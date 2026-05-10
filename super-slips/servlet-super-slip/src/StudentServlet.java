import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
    private int requestCount;

    @Override
    public void init() throws ServletException {
        requestCount = 0;
        getServletContext().log("StudentServlet initialized.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest("GET", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        processRequest("POST", request, response);
    }

    private void processRequest(String method, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        String studentName = readOrDefault(request.getParameter("studentName"), "Guest Student");
        String course = readOrDefault(request.getParameter("course"), "Not provided");
        String semester = readOrDefault(request.getParameter("semester"), "Not provided");
        String message = readOrDefault(request.getParameter("message"), "No custom message provided.");

        synchronized (this) {
            requestCount++;
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Student Servlet Response</title>");
            out.println("<style>");
            out.println("body{font-family:Arial,sans-serif;background:#f8fafc;margin:0;padding:32px;color:#1e293b;}");
            out.println(".card{max-width:820px;margin:0 auto;background:#fff;border-radius:16px;padding:32px;");
            out.println("box-shadow:0 14px 40px rgba(15,23,42,0.12);}");
            out.println("h1{margin-top:0;color:#0f766e;}");
            out.println("table{width:100%;border-collapse:collapse;margin-top:20px;}");
            out.println("th,td{padding:12px;border:1px solid #cbd5e1;text-align:left;}");
            out.println("th{background:#ecfeff;width:220px;}");
            out.println(".badge{display:inline-block;padding:6px 10px;background:#dcfce7;color:#166534;border-radius:999px;font-size:12px;font-weight:bold;}");
            out.println(".note{margin-top:20px;background:#eff6ff;padding:16px;border-radius:12px;border-left:4px solid #2563eb;}");
            out.println("a{color:#2563eb;text-decoration:none;font-weight:bold;}");
            out.println("</style></head><body>");
            out.println("<div class=\"card\">");
            out.println("<span class=\"badge\">Servlet Reference Response</span>");
            out.println("<h1>StudentServlet handled your request</h1>");
            out.println("<p>This page was generated dynamically by a servlet running on Tomcat.</p>");
            out.println("<table>");
            out.println("<tr><th>HTTP Method</th><td>" + escapeHtml(method) + "</td></tr>");
            out.println("<tr><th>Student Name</th><td>" + escapeHtml(studentName) + "</td></tr>");
            out.println("<tr><th>Course</th><td>" + escapeHtml(course) + "</td></tr>");
            out.println("<tr><th>Semester</th><td>" + escapeHtml(semester) + "</td></tr>");
            out.println("<tr><th>Message</th><td>" + escapeHtml(message) + "</td></tr>");
            out.println("<tr><th>Request Count</th><td>" + requestCount + "</td></tr>");
            out.println("<tr><th>Handled At</th><td>" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "</td></tr>");
            out.println("</table>");
            out.println("<div class=\"note\">");
            out.println("<strong>Lifecycle note:</strong> Tomcat calls <code>init()</code> once, then ");
            out.println("<code>doGet()</code> or <code>doPost()</code> for each request, and finally ");
            out.println("<code>destroy()</code> when the servlet is taken out of service.");
            out.println("</div>");
            out.println("<p style=\"margin-top:24px;\"><a href=\"index.html\">Back to form</a></p>");
            out.println("</div></body></html>");
        }
    }

    @Override
    public void destroy() {
        getServletContext().log("StudentServlet destroyed after serving " + requestCount + " requests.");
    }

    private String readOrDefault(String value, String fallback) {
        if (value == null || value.trim().isEmpty()) {
            return fallback;
        }
        return value.trim();
    }

    private String escapeHtml(String value) {
        return value
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;");
    }
}
