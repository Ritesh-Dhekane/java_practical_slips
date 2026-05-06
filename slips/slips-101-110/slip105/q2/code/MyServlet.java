import java.io.*; import java.util.*; import javax.servlet.*; import javax.servlet.http.*;
public class GreetServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println('Hello ' + req.getParameter('user') + ' ' + new Date());
    }
}
