import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;

/**
 * Slip 54 Q2: Servlet Life Cycle.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/LifeCycle")
public class LifeCycleServlet extends HttpServlet {
    private int initCount = 0;
    private int serviceCount = 0;

    @Override
    public void init() throws ServletException {
        initCount++;
        System.out.println("init() method called. Count: " + initCount);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        serviceCount++;
        System.out.println("service() method called. Count: " + serviceCount);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body><h2>Servlet Life Cycle Demo</h2>");
        out.println("<p><b>init()</b> called: " + initCount + " time(s) (only once per servlet lifecycle)</p>");
        out.println("<p><b>service()</b> called: " + serviceCount + " time(s) (once per request)</p>");
        out.println("<p><b>destroy()</b> will be called when server shuts down.</p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() method called. Servlet is being destroyed.");
    }
}
