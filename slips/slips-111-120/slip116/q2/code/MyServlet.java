import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class SafeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try { int n = Integer.parseInt(req.getParameter('n')); res.getWriter().println(n); }
        catch(Exception e){ res.getWriter().println("Invalid"); }
    }
}
