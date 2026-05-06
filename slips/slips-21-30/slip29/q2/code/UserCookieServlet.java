import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Slip 29 - Question 2
 * Program: Servlet stores username in Cookie; retrieves and displays in next request.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/user")
public class UserCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");

        out.println("<!DOCTYPE html><html><head><title>Cookie</title></head><body>");

        if ("store".equals(action)) {
            String username = request.getParameter("username");
            if (username == null || username.isEmpty()) username = "GuestUser";
            Cookie c = new Cookie("username", username);
            c.setMaxAge(60 * 30);
            response.addCookie(c);
            out.println("<p><b>Cookie stored!</b> Username: " + username + "</p>");
            out.println("<a href='user?action=retrieve'>Retrieve in Next Request</a>");

        } else if ("retrieve".equals(action)) {
            Cookie[] cookies = request.getCookies();
            String username = "Not Found";
            if (cookies != null)
                for (Cookie c : cookies)
                    if ("username".equals(c.getName())) { username = c.getValue(); break; }
            out.println("<p>Retrieved from Cookie – Username: <b>" + username + "</b></p>");
            out.println("<a href='user'>Start Over</a>");

        } else {
            out.println("<form method='get'><input type='hidden' name='action' value='store'/>");
            out.println("Username: <input type='text' name='username'/>");
            out.println("<input type='submit' value='Store Cookie'/></form>");
        }
        out.println("</body></html>");
    }
}
