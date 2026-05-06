import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Slip 26 - Question 1
 * Program: Servlet reads two numbers from request parameters, displays their sum.
 * Concepts: Servlet, request.getParameter(), arithmetic
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            double sum  = num1 + num2;

            out.println("<!DOCTYPE html><html><head><title>Sum Result</title>");
            out.println("<style>body{font-family:Arial;margin:50px;background:#e8f5e9}");
            out.println(".card{background:white;padding:30px;border-radius:8px;width:300px;");
            out.println("box-shadow:0 2px 8px rgba(0,0,0,0.1)}h2{color:#2e7d32}.sum{font-size:28px;color:#1b5e20;font-weight:bold}</style></head><body>");
            out.println("<div class="card"><h2>Sum Result</h2>");
            out.println("<p>Number 1 : <b>" + num1 + "</b></p>");
            out.println("<p>Number 2 : <b>" + num2 + "</b></p>");
            out.println("<hr/><p class="sum">" + num1 + " + " + num2 + " = " + sum + "</p>");
            out.println("<br/><a href="index.html">&#8592; Calculate Again</a>");
            out.println("</div></body></html>");

        } catch (NumberFormatException e) {
            out.println("<p style="color:red">Invalid input. Please enter valid numbers.</p>");
        }
    }
}
