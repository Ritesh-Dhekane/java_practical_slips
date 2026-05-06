import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;

/**
 * Slip 57 Q1: Servlet addition of two numbers.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/Add")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try {
            double num1 = Double.parseDouble(req.getParameter("n1"));
            double num2 = Double.parseDouble(req.getParameter("n2"));
            out.println("<h2>Addition Result</h2>");
            out.println("<p>" + num1 + " + " + num2 + " = <b>" + (num1 + num2) + "</b></p>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red'>Invalid input! Please enter numbers.</p>");
        }
        out.println("<a href='index.html'>Back</a>");
    }
}
