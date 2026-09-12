package com.cafe.mybot;

import org.springframework.stereotype.Service;

@Service
public class RagService {

    private String documentText = "";

    public void storeDocument(String text) {
        documentText = text;
    }

    public String answerQuestion(String question) {

        if (documentText.isEmpty()) {
            return "Please upload a PDF first.";
        }

        String q = question.toLowerCase();
        String text = documentText.toLowerCase();

        // Director / Writer
        if (q.contains("director") || q.contains("writer")) {
            int start = text.indexOf("director and writer");

            if (start != -1) {
                int end = documentText.indexOf("\n", start);

                if (end == -1) {
                    end = documentText.length();
                }

                return documentText.substring(start, end).trim();
            }
        }

        // Lead Cast
        if (q.contains("cast") || q.contains("actor") || q.contains("actors")) {
            int start = text.indexOf("lead cast");

            if (start != -1) {
                int end = documentText.indexOf("\n", start);

                if (end == -1) {
                    end = documentText.length();
                }

                return documentText.substring(start, end).trim();
            }
        }

        // Storyline / Plot
        if (q.contains("plot") || q.contains("story") || q.contains("storyline")) {
            int start = text.indexOf("storyline");

            if (start != -1) {
                int end = documentText.indexOf("\n", start);

                if (end == -1) {
                    end = documentText.length();
                }

                return documentText.substring(start, end).trim();
            }
        }

        return "I could not find the answer in the PDF.";
    }
}