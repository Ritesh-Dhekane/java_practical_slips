import java.io.*; import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;
import java.util.Date;

/**
 * Slip 67 Q1: Servlet welcome message + current date time.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>Welcome</title></head>");
        out.println("<body style='font-family:Arial;margin:40px'>");
        out.println("<h2 style='color:#2e7d32'>Welcome to Servlets!</h2>");
        out.println("<p><b>Current Date and Time:</b> " + new Date() + "</p>");
        out.println("</body></html>");
    }
}
