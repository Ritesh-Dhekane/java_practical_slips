import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;
/**
 * Slip 47 Q1: Servlet – multiplication table from user input.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/MultiTable")
public class MultiTableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html"); PrintWriter out = res.getWriter();
        int num = Integer.parseInt(req.getParameter("num"));
        out.println("<html><body><h2>Multiplication Table of " + num + "</h2><table border='1' cellpadding='6'>");
        for (int i=1; i<=10; i++)
            out.println("<tr><td>"+num+" x "+i+"</td><td>= "+(num*i)+"</td></tr>");
        out.println("</table><br/><a href="index.html">Back</a></body></html>");
    }
}
