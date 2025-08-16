package com.ai_resume_analyzer.controller;


import com.ai_resume_analyzer.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ChatService chatService;

    public ResumeController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/analyze-resume")
    public ResponseEntity<String> analyzeResumeLatexPdf(
            @RequestParam("file") MultipartFile file,
            @RequestParam("jobDescription") String jobDescription){

        String rewrittenResume = chatService.getSuggestion(file, jobDescription);

        return ResponseEntity.ok(rewrittenResume);
    }

}
