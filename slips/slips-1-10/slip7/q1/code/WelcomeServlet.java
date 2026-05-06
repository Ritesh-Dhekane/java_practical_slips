import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Slip 7 - Question 1
 * Program: Servlet that accepts employee name from HTML form and displays a welcome message.
 * Concepts: Servlet, HTTP POST, request parameters, HTML output
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get employee name from the form
        String empName = request.getParameter("empName");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Welcome</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 50px; background: #e8f5e9; }");
        out.println(".msg { background: white; padding: 30px; border-radius: 8px; "
                  + "width: 400px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }");
        out.println("h2 { color: #2e7d32; }");
        out.println("</style></head><body>");
        out.println("<div class='msg'>");

        if (empName != null && !empName.trim().isEmpty()) {
            out.println("<h2>Welcome " + empName.trim() + "!</h2>");
            out.println("<p>Hello <b>" + empName.trim() + "</b>, you have successfully logged in.</p>");
        } else {
            out.println("<h2>Welcome, Employee!</h2>");
            out.println("<p>No name was provided.</p>");
        }

        out.println("<br/><a href='index.html'>Go Back</a>");
        out.println("</div></body></html>");
    }
}
