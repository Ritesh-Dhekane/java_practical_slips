import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;

/**
 * Slip 56 Q2: Servlet – welcome scott/tiger.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String u = req.getParameter("user");
        String p = req.getParameter("pass");
        
        out.println("<html><body>");
        if ("scott".equals(u) && "tiger".equals(p)) {
            out.println("<h2 style="color:green">Welcome user " + u + "!</h2>");
        } else {
            out.println("<h2 style="color:red">Sorry wrong details.</h2>");
        }
        out.println("<br/><a href="index.html">Back</a></body></html>");
    }
}
