package com.cafe.mybot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ChatController {

    @Autowired
    private PdfService pdfService;

    @Autowired
    private RagService ragService;


    // =========================
    // UPLOAD PDF
    // =========================

    @PostMapping("/upload")
    public String uploadPdf(
            @RequestParam("file") MultipartFile file) {

        try {

            if (file.isEmpty()) {
                return "Please select a PDF file.";
            }

            String text = pdfService.extractText(file);

            if (text == null || text.trim().isEmpty()) {
                return "The PDF does not contain readable text.";
            }

            ragService.storeDocument(text);

            return "PDF uploaded successfully!";

        } catch (Exception e) {

            return "Error: " + e.getMessage();
        }
    }


    // =========================
    // ASK QUESTION
    // =========================

    @GetMapping("/ask")
    public String askQuestion(
            @RequestParam String question) {

        return ragService.answerQuestion(question);
    }
}
