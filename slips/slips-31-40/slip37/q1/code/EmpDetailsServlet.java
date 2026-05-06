import java.io.*;
import javax.servlet.*; import javax.servlet.annotation.*; import javax.servlet.http.*;
/**
 * Slip 37 - Q1: Servlet – accept employee details via params, display formatted.
 * Unit: UNIT 3 – Servlets
 */
@WebServlet("/EmpDetails")
public class EmpDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); PrintWriter out = res.getWriter();
        String name=req.getParameter("name"), dept=req.getParameter("dept"), sal=req.getParameter("salary");
        out.println("<html><head><title>Employee</title></head><body>");
        out.println("<h2>Employee Details</h2>");
        out.println("<table border='1' cellpadding='8'>");
        out.println("<tr><td><b>Name</b></td><td>" + name + "</td></tr>");
        out.println("<tr><td><b>Department</b></td><td>" + dept + "</td></tr>");
        out.println("<tr><td><b>Salary</b></td><td>Rs. " + sal + "</td></tr>");
        out.println("</table><br/><a href="index.html">Back</a></body></html>");
    }
}
