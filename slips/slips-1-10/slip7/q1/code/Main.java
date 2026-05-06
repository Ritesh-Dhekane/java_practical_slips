// Standalone Java that compiles but simulates a Servlet
import java.io.*;

// Mocks to make it compile via standard JDK
class HttpServletRequest { public String getParameter(String s) { return "John Doe"; } }
class HttpServletResponse {
    public PrintWriter getWriter() { return new PrintWriter(System.out); }
    public void setContentType(String s) {}
}
class HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws Exception {}
}

class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String empName = request.getParameter("empName");
        out.println("<h1>Welcome " + empName + "</h1>");
        out.flush();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Simulating WelcomeServlet execution...");
        WelcomeServlet servlet = new WelcomeServlet();
        servlet.doGet(new HttpServletRequest(), new HttpServletResponse());
    }
}
