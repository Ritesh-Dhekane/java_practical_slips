import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class AddServlet extends HttpServlet { public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException { res.getWriter().println(10+20); } }
