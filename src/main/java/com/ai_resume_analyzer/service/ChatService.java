package com.ai_resume_analyzer.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.apache.tika.Tika;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ChatService {

    private final Client client;

    public ChatService(Client client) {
        this.client = client;
    }

    public String getSuggestion(MultipartFile file, String jobDescription) {
        try {
            if (file.isEmpty() || jobDescription == null || jobDescription.isBlank()) {
                throw new IllegalArgumentException("Resume file and job description are required.");
            }

            String resumeText = extractText(file);

            String prompt = "Analyze this resume: " + resumeText +
                    "\nCompare with job description: " + jobDescription +
                    "\nSuggest improvements for ATS optimization, skill matching, and formatting." +
                    "\nFormat the suggestions so that they are wrapped in HTML <span style='color:red'> ... </span> tags.";

            GenerateContentResponse response = client.models.generateContent(
                    "gemini-2.5-flash",
                    prompt,
                    null
            );

            return response != null ? response.text() : "No suggestions generated.";

        } catch (Exception e) {
            throw new RuntimeException("Error analyzing resume: " + e.getMessage(), e);
        }
    }

    private String extractText(MultipartFile file) throws Exception {
        Tika tika = new Tika();
        return tika.parseToString(file.getInputStream());
    }
}
