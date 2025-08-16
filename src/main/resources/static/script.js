document.getElementById("resumeForm").addEventListener("submit", async function (e) {
    e.preventDefault();

    const formData = new FormData();
    formData.append("file", document.getElementById("file").files[0]);
    formData.append("jobDescription", document.getElementById("jobDescription").value);

    const responseBox = document.getElementById("responseBox");
    responseBox.style.display = "block";
    responseBox.innerHTML = "⏳ Analyzing resume...";

    try {
        const response = await fetch("/ai-analyze-resume/v1/resume/analyze-resume", {
            method: "POST",
            body: formData
        });

        if (!response.ok) {
            throw new Error("Server error: " + response.status);
        }

        const result = await response.text();
        responseBox.innerHTML = `<strong>Analysis Result:</strong><br><br>${result}`;
    } catch (error) {
        responseBox.innerHTML = "❌ Error: " + error.message;
    }
});
