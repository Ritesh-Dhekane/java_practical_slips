import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Slip 5 - Question 2
 * Program: Servlet demonstrating Life Cycle methods – init(), service(), destroy().
 * Concepts: Servlet, Servlet Life Cycle
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    private int requestCount = 0;

    /**
     * init() – Called ONCE when servlet is first loaded.
     * Used for one-time initialization (DB connection, config loading, etc.)
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("*** SERVLET LIFECYCLE ***");
        System.out.println("init() called – Servlet initialized.");
        System.out.println("Servlet Name: " + config.getServletName());
    }

    /**
     * service() – Called for EVERY client request.
     * Routes to doGet() or doPost() based on HTTP method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        requestCount++;
        System.out.println("service()/doGet() called – Request #" + requestCount);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<p><b>init()</b>  : Called once when servlet loads.</p>");
        out.println("<p><b>service()</b>: Called for each request. Request # " + requestCount + "</p>");
        out.println("<p><b>destroy()</b>: Called once when servlet is removed.</p>");
        out.println("<hr>");
        out.println("<p>Visit <a href='lifecycle'>this page</a> again to see request count increase.</p>");
        out.println("</body></html>");
    }

    /**
     * destroy() – Called ONCE when servlet is unloaded/server stops.
     * Used for cleanup (close DB connections, release resources, etc.)
     */
    @Override
    public void destroy() {
        System.out.println("destroy() called – Servlet destroyed. Total requests served: " + requestCount);
    }
}
