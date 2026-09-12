# 🤖 RAG Study Chatbot

An AI-powered Retrieval-Augmented Generation (RAG) chatbot designed to make document-based learning interactive, engaging, and accessible for everyone.

---

## 📌 About the Project

The **RAG Study Chatbot** allows users to upload a PDF document and instantly ask questions based on its content. Built with modern backend technologies and a Gen-Z-friendly, intuitive UI, this application transforms standard, text-heavy PDFs into interactive learning sessions.

The primary goal of this project is to showcase how RAG technology can bridge the gap between static educational material and dynamic AI-driven interaction.

---

## ✨ Features

* 📄 **PDF File Processing:** Upload standard PDF documents for instant processing and vector indexing.
* 🔍 **Context-Aware Retrieval:** Employs Retrieval-Augmented Generation (RAG) to pull accurate answers directly from uploaded documents.
* 💬 **Interactive Chat Interface:** A sleek, user-friendly interface designed for interactive Q&A sessions.
* 🤖 **AI-Powered Responses:** Modern LLM integration to generate human-like, contextual answers.
* 🎨 **Gen-Z Friendly UI:** Modern design aesthetics (HTML/CSS) built to be engaging for younger audiences while remaining simple and accessible for users of all ages.

---

## 🛠️ Technologies Used

### **Backend & AI**
* **Java 17+**
* **Spring Boot** – Core application framework and REST APIs
* **Maven** – Dependency management and build automation
* **RAG & PDF Libraries** – Document extraction, chunking, and AI integration

### **Frontend**
* **HTML5 & CSS3** – Responsive, custom-styled frontend interface

---

## 📁 Project Structure

```text
mybot/
├── src/
│   ├── main/
│   │   ├── java/com/cafe/mybot/
│   │   │   ├── MybotApplication.java   # Spring Boot Main Application
│   │   │   ├── ChatController.java     # REST Controller handling chat requests
│   │   │   ├── PdfService.java         # PDF extraction & processing service
│   │   │   └── RagService.java         # RAG pipeline & AI model integration
│   │   └── resources/
│   │       ├── application.properties  # App configurations
│   │       └── static/
│   │           ├── index.html          # Chat interface UI
│   │           └── style.css           # UI Styling
└── pom.xml                             # Maven Dependencies