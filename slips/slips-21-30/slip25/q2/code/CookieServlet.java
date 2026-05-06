import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Slip 25 - Question 2
 * Program: Servlet demonstrating Cookie usage – set and retrieve.
 * Concepts: Servlet, Cookies, HttpServletResponse.addCookie(), HttpServletRequest.getCookies()
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        out.println("<html><head><title>Cookie Demo</title></head><body>");
        out.println("<h2>Servlet Cookie Demo</h2>");

        if ("set".equals(action)) {
            // SET a Cookie
            Cookie userCookie = new Cookie("username", "Ritesh");
            userCookie.setMaxAge(60 * 60); // 1 hour
            response.addCookie(userCookie);

            Cookie roleCookie = new Cookie("role", "Admin");
            roleCookie.setMaxAge(60 * 60);
            response.addCookie(roleCookie);

            out.println("<p style="color:green"><b>Cookies SET successfully!</b></p>");
            out.println("<p>username = Ritesh</p><p>role = Admin</p>");
            out.println("<br/><a href="cookie?action=get">Click to Retrieve Cookies</a>");

        } else if ("get".equals(action)) {
            // RETRIEVE Cookies
            Cookie[] cookies = request.getCookies();
            out.println("<p><b>Retrieved Cookies:</b></p><ul>");
            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("<li>" + c.getName() + " = " + c.getValue() + "</li>");
                }
            } else {
                out.println("<li>No cookies found.</li>");
            }
            out.println("</ul>");

        } else {
            out.println("<a href="cookie?action=set">Set Cookies</a>");
        }

        out.println("</body></html>");
    }
}
