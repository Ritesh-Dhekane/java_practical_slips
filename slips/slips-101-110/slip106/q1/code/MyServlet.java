import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println('Welcome ' + req.getParameter('name'));
    }
}
