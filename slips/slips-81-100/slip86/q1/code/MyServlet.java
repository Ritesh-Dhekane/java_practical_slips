import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class StudentServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        int marks = Integer.parseInt(req.getParameter("marks"));
        out.println("Student: " + name + " - " + (marks >= 40 ? "Pass" : "Fail"));
    }
}
