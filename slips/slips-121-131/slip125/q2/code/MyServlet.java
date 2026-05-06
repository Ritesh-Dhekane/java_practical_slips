import java.io.*; import javax.servlet.*; import javax.servlet.http.*;
public class LifeServlet extends HttpServlet { public void init(){System.out.println('init');} public void doGet(HttpServletRequest q, HttpServletResponse s) throws IOException { s.getWriter().println('Hello'); } public void destroy(){System.out.println('destroy');} }
