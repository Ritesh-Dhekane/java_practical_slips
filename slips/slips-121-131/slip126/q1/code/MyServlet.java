import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class EmpServlet extends HttpServlet { public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException { res.getWriter().println("<table><tr><td>R</td></tr></table>"); } }
