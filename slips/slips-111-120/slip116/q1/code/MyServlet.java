import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class CalcServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int a = Integer.parseInt(req.getParameter("n1")); int b = Integer.parseInt(req.getParameter("n2"));
        res.getWriter().println("Add: " + (a+b) + " Sub: " + (a-b));
    }
}
