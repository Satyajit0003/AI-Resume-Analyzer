🚀 **AI Resume Analyzer**

**Tagline:** Revolutionizing resume analysis with AI-powered insights

**Description:**

The AI Resume Analyzer is a Spring Boot-based application designed to analyze resumes and provide valuable insights to recruiters and hiring managers. This application uses natural language processing (NLP) and machine learning algorithms to extract relevant information from resumes and match them with job descriptions.

The application is built using Java 17, Spring Boot 3.5.4, and Maven as the build tool. It utilizes the Google GenAI client library for NLP and Apache Tika for file format recognition.

**Features:**

1. 📁 Resume Analysis: The application analyzes resumes and extracts relevant information such as skills, education, and work experience.
2. 🔍 Job Description Matching: The application matches resumes with job descriptions and provides a score indicating the candidate's suitability for the job.
3. 📊 Insights Generation: The application generates insights such as top skills, education level, and work experience for each candidate.
4. 📝 Customizable: The application allows recruiters and hiring managers to customize the analysis process by adjusting the weightage of different factors.
5. 📦 File Format Support: The application supports various file formats, including PDF, Word, and Text.
   
**Tech Stack:**

| **Category** | **Technology** |
| --- | --- |
| Frontend | HTML, CSS, JavaScript, Thymeleaf |
| Backend | Java 17, Spring Boot 3.5.4, Maven |
| NLP | Google GenAI Client Library |
| File Format Recognition | Apache Tika |
| Database | In-memory database (H2) |
| Build Tool | Maven |

**Project Structure:**

* `ai-resume-analyzer`: The main project directory
* `src/main/java`: Java source files
* `src/main/resources`: Configuration files, templates, and static assets
* `src/main/webapp`: Web application files (index.html, style.css, script.js)
* `src/test/java`: Unit tests
* `pom.xml`: Maven build file

**How to Run:**

1. Clone the repository and navigate to the project directory.
2. Install the required dependencies by running `mvn install`.
3. Run the application using `mvn spring-boot:run`.
4. Access the application at `http://localhost:8080` in your web browser.
5. Upload a resume and select a job description to analyze.

**Testing Instructions:**

1. Run the unit tests using `mvn test`.
2. Use the application's REST API to test the analysis functionality.

**Screenshots:**

[Placeholder for screenshots]

**API Reference:**

[[Placeholder for API reference documentation](https://ai.google.dev/gemini-api/docs?authuser=1)]

**Author:**

* [Satyajit Sahoo]

**License:**

The AI Resume Analyzer is licensed under the Apache License 2.0.
