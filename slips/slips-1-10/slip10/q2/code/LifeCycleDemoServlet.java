import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Slip 10 - Question 2
 * Program: Servlet demonstrating Life Cycle methods – init(), service(), destroy().
 * (Same concept as Slip 5 Q2 but with additional lifecycle detail and styling)
 * Concepts: Servlet Life Cycle
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/lifecycle")
public class LifeCycleDemoServlet extends HttpServlet {

    private String initTime;
    private int    requestCount = 0;

    /**
     * PHASE 1 – init()
     * Called once when the servlet is instantiated.
     * Good for: loading config, opening DB connections, initializing resources.
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        initTime = new java.util.Date().toString();
        System.out.println("[LIFECYCLE] init() called at: " + initTime);
        System.out.println("[LIFECYCLE] Servlet ready to serve requests.");
    }

    /**
     * PHASE 2 – service() / doGet()
     * Called for every client HTTP request.
     * Routes to doGet() or doPost() based on HTTP method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        requestCount++;
        System.out.println("[LIFECYCLE] service()/doGet() - Request #" + requestCount);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html><html><head><title>Servlet Lifecycle</title>");
        out.println("<style>");
        out.println("body{font-family:Arial,sans-serif;margin:40px;background:#e8eaf6}");
        out.println(".card{background:white;padding:30px;border-radius:8px;max-width:600px;box-shadow:0 2px 8px rgba(0,0,0,0.15)}");
        out.println("h2{color:#3f51b5}.phase{background:#f3f4f6;padding:12px;margin:10px 0;border-left:4px solid #3f51b5;border-radius:4px}");
        out.println("</style></head><body><div class='card'>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<div class='phase'><b>Phase 1 – init()</b><br/>Called once at startup.<br/>Init time: " + initTime + "</div>");
        out.println("<div class='phase'><b>Phase 2 – service() / doGet()</b><br/>Called for every request.<br/>Request count: <b>" + requestCount + "</b></div>");
        out.println("<div class='phase'><b>Phase 3 – destroy()</b><br/>Called once when server shuts down. Check server console.</div>");
        out.println("<br/><a href='lifecycle'>Refresh to see request count increase</a>");
        out.println("</div></body></html>");
    }

    /**
     * PHASE 3 – destroy()
     * Called once when the servlet is removed or server shuts down.
     * Good for: releasing resources, closing DB connections.
     */
    @Override
    public void destroy() {
        System.out.println("[LIFECYCLE] destroy() called. Total requests served: " + requestCount);
        System.out.println("[LIFECYCLE] Servlet removed from service.");
    }
}
