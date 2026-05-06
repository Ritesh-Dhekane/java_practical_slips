import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;

/**
 * Slip 76 Q1: Servlet accept student details from form.
 * Note: Same as Slip 73 Q2.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/StudentDetails")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String course = req.getParameter("course");
        String age = req.getParameter("age");
        
        out.println("<html><body>");
        out.println("<h2>Student Details Submitted</h2>");
        out.println("<table border='1' cellpadding='8'>");
        out.println("<tr><td><b>Name</b></td><td>" + name + "</td></tr>");
        out.println("<tr><td><b>Age</b></td><td>" + age + "</td></tr>");
        out.println("<tr><td><b>Course</b></td><td>" + course + "</td></tr>");
        out.println("</table>");
        out.println("<br/><a href="index.html">Back</a></body></html>");
    }
}
