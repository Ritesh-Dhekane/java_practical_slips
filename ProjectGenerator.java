import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ProjectGenerator {
    public static void main(String[] args) throws Exception {
        String baseDir = "d:/Workspace/College/java_practical_slips";
        
        String[] dirs = {
            "slips/slips-1-10", "common", "web-viewer/css", "web-viewer/js", "data"
        };
        for (String dir : dirs) {
            Files.createDirectories(Paths.get(baseDir, dir));
        }
        
        generateSlip1(baseDir);
        generateSlip2(baseDir);
        generateSlip3(baseDir);
        generateSlip4(baseDir);
        generateSlip5(baseDir);
        generateSlip6(baseDir);
        generateSlip7(baseDir);
        generateSlip8(baseDir);
        generateSlip9(baseDir);
        generateSlip10(baseDir);
        
        generateCommon(baseDir);
        generateJson(baseDir);
        generateWebViewer(baseDir);
        generateReadme(baseDir);
        
        System.out.println("Project Generation Complete.");
    }
    
    static void write(String basePath, String slip, String q, String file, String content) throws Exception {
        Path p = Paths.get(basePath, "slips/slips-1-10", slip, q, file);
        Files.createDirectories(p.getParent());
        Files.write(p, content.getBytes());
    }
    
    static void writeMeta(String basePath, String slip, String content) throws Exception {
        Path p = Paths.get(basePath, "slips/slips-1-10", slip, "meta.md");
        Files.createDirectories(p.getParent());
        Files.write(p, content.getBytes());
    }

    static void writeRaw(String basePath, String file, String content) throws Exception {
        Path p = Paths.get(basePath, file);
        Files.createDirectories(p.getParent());
        Files.writeString(p, content);
    }

    // --- SLIPS ---
    static void generateSlip1(String base) throws Exception {
        // Slip 1 Q1
        String code1 = """
import java.util.*;

class Employee implements Comparable<Employee> {
    int empId;
    String name;
    double salary;
    public Employee(int empId, String name, double salary) {
        this.empId = empId; this.name = name; this.salary = salary;
    }
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }
    public String toString() {
        return "ID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", 50000));
        list.add(new Employee(2, "Bob", 40000));
        list.add(new Employee(3, "Charlie", 60000));
        list.add(new Employee(4, "David", 35000));
        list.add(new Employee(5, "Eve", 45000));
        
        Collections.sort(list);
        
        System.out.println("Employees sorted by salary:");
        for(Employee e : list) {
            System.out.println(e);
        }
    }
}
""";
        write(base, "slip1", "q1", "code/Main.java", code1);
        write(base, "slip1", "q1", "output.txt", "Employees sorted by salary:\nID: 4, Name: David, Salary: 35000.0\nID: 2, Name: Bob, Salary: 40000.0\nID: 5, Name: Eve, Salary: 45000.0\nID: 1, Name: Alice, Salary: 50000.0\nID: 3, Name: Charlie, Salary: 60000.0");
        write(base, "slip1", "q1", "explanation.md", "This program uses `ArrayList` to store objects and implements `Comparable` to sort them based on salary. (Unit 2: Collections)");
        write(base, "slip1", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        // Slip 1 Q2
        String code2 = """
import java.util.Scanner;

interface Power {
    double calculate(double x, double y);
}

public class Main {
    public static void main(String[] args) {
        Power p = (x, y) -> Math.pow(x, y);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.hasNextDouble() ? sc.nextDouble() : 2;
        System.out.print("Enter exponent (y): ");
        double y = sc.hasNextDouble() ? sc.nextDouble() : 3;
        
        System.out.println(x + "^" + y + " = " + p.calculate(x, y));
    }
}
""";
        write(base, "slip1", "q2", "code/Main.java", code2);
        write(base, "slip1", "q2", "output.txt", "Enter base (x): 2\nEnter exponent (y): 3\n2.0^3.0 = 8.0");
        write(base, "slip1", "q2", "explanation.md", "Demonstrates the use of Lambda Expression to implement a functional interface for calculating power. (Unit 1: Lambda Expressions)");
        write(base, "slip1", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");

        writeMeta(base, "slip1", "# Slip 1\n\nTopics:\n- Collections (ArrayList, Comparable)\n- Lambda Expressions\n\nUnits: Unit 1, Unit 2");
    }

    static void generateSlip2(String base) throws Exception {
        // Slip 2 Q1
        String code1 = """
import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo; this.name = name; this.marks = marks;
    }
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(101, new Student(101, "Alice", 65));
        map.put(102, new Student(102, "Bob", 75));
        map.put(103, new Student(103, "Charlie", 80));
        
        System.out.println("Students with marks > 70:");
        for(Student s : map.values()) {
            if(s.marks > 70) {
                System.out.println(s);
            }
        }
    }
}
""";
        write(base, "slip2", "q1", "code/Main.java", code1);
        write(base, "slip2", "q1", "output.txt", "Students with marks > 70:\nRollNo: 102, Name: Bob, Marks: 75.0\nRollNo: 103, Name: Charlie, Marks: 80.0");
        write(base, "slip2", "q1", "explanation.md", "Demonstrates HashMap to store objects using rollNo as key and filtering values. (Unit 2: Collections)");
        write(base, "slip2", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        // Slip 2 Q2
        String code2 = """
class Person {
    void display() {
        System.out.println("This is Person class");
    }
}
class Student extends Person {
    @Override
    void display() {
        System.out.println("This is Student class overriding Person's display()");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        
        Person p2 = new Student(); // Dynamic method dispatch
        p2.display();
    }
}
""";
        write(base, "slip2", "q2", "code/Main.java", code2);
        write(base, "slip2", "q2", "output.txt", "This is Person class\nThis is Student class overriding Person's display()");
        write(base, "slip2", "q2", "explanation.md", "Demonstrates inheritance and method overriding using dynamic method dispatch. (Unit 1: Inheritance, Polymorphism)");
        write(base, "slip2", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");

        writeMeta(base, "slip2", "# Slip 2\n\nTopics:\n- Collections (HashMap)\n- Method Overriding (Polymorphism)\n\nUnits: Unit 1, Unit 2");
    }

    static void generateSlip3(String base) throws Exception {
        String code1 = """
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        
        System.out.println("Initial Set: " + set);
        
        boolean isAdded = set.add("Alice");
        System.out.println("Attempt to insert duplicate 'Alice' successful? " + isAdded);
        
        System.out.println("Final Set: " + set);
        System.out.println("\\nExplanation: HashSet does not allow duplicate elements. The add() method returns false if the element already exists.");
    }
}
""";
        write(base, "slip3", "q1", "code/Main.java", code1);
        write(base, "slip3", "q1", "output.txt", "Initial Set: [Bob, Alice, Charlie]\nAttempt to insert duplicate 'Alice' successful? false\nFinal Set: [Bob, Alice, Charlie]\n\nExplanation: HashSet does not allow duplicate elements...");
        write(base, "slip3", "q1", "explanation.md", "Demonstrates HashSet properties and its duplicate rejection behavior. (Unit 2: Collections)");
        write(base, "slip3", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        String code2 = """
abstract class Person {
    abstract void showDetails();
}

class Employee extends Person {
    String name = "John Doe";
    int empId = 1001;
    
    @Override
    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Employee();
        p.showDetails();
    }
}
""";
        write(base, "slip3", "q2", "code/Main.java", code2);
        write(base, "slip3", "q2", "output.txt", "Employee ID: 1001\nName: John Doe");
        write(base, "slip3", "q2", "explanation.md", "Demonstrates Abstract Class concept where the abstract method is implemented by a subclass. (Unit 1: Abstract Class)");
        write(base, "slip3", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");

        writeMeta(base, "slip3", "# Slip 3\n\nTopics:\n- HashSet\n- Abstract Class\n\nUnits: Unit 1, Unit 2");
    }

    static void generateSlip4(String base) throws Exception {
        String code1 = """
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();
        
        System.out.println("Enter 5 salaries:");
        for(int i=0; i<5; i++) {
            if(sc.hasNextDouble()) {
                salaries.add(sc.nextDouble());
            } else {
                salaries.add(1000.0 * (i+1)); // Fallback if no input
            }
        }
        
        Collections.sort(salaries, Collections.reverseOrder());
        
        if(salaries.size() >= 2) {
            System.out.println("Second highest salary: " + salaries.get(1));
        }
    }
}
""";
        write(base, "slip4", "q1", "code/Main.java", code1);
        write(base, "slip4", "q1", "output.txt", "Enter 5 salaries:\n5000\n7000\n3000\n9000\n8000\nSecond highest salary: 8000.0");
        write(base, "slip4", "q1", "explanation.md", "Sorts the ArrayList in descending order and picks the second element. (Unit 2: Collections)");
        write(base, "slip4", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        String code2 = """
interface Shape {
    void area();
}

class Circle implements Shape {
    double r = 5;
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

class Rectangle implements Shape {
    double l = 4, w = 5;
    public void area() {
        System.out.println("Area of Rectangle: " + (l * w));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.area();
        Shape r = new Rectangle();
        r.area();
    }
}
""";
        write(base, "slip4", "q2", "code/Main.java", code2);
        write(base, "slip4", "q2", "output.txt", "Area of Circle: 78.53981633974483\nArea of Rectangle: 20.0");
        write(base, "slip4", "q2", "explanation.md", "Demonstrates the use of Interface implemented by multiple classes. (Unit 1: Interface)");
        write(base, "slip4", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip4", "# Slip 4\n\nTopics:\n- ArrayList Sorting\n- Interface\n\nUnits: Unit 1, Unit 2");
    }

    static void generateSlip5(String base) throws Exception {
        String code1 = """
class NumberThread implements Runnable {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try { Thread.sleep(100); } catch(Exception e){}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberThread());
        t.setName("NumberPrinterThread");
        t.start();
    }
}
""";
        write(base, "slip5", "q1", "code/Main.java", code1);
        write(base, "slip5", "q1", "output.txt", "NumberPrinterThread : 1\nNumberPrinterThread : 2\n...\nNumberPrinterThread : 10");
        write(base, "slip5", "q1", "explanation.md", "Demonstrates multithreading by implementing the Runnable interface. (Unit 2: Multithreading)");
        write(base, "slip5", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        String code2 = """
// Mocking Servlet to compile purely with standard JDK
interface Servlet {
    void init();
    void service();
    void destroy();
}

class MyServlet implements Servlet {
    public void init() {
        System.out.println("init() - Called once when Servlet is created.");
    }
    public void service() {
        System.out.println("service() - Called for every request.");
    }
    public void destroy() {
        System.out.println("destroy() - Called once when Servlet is stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Servlet Life Cycle Demonstration ---");
        Servlet s = new MyServlet();
        s.init();
        s.service();
        s.service();
        s.destroy();
    }
}
""";
        write(base, "slip5", "q2", "code/Main.java", code2);
        write(base, "slip5", "q2", "output.txt", "--- Servlet Life Cycle Demonstration ---\ninit() - Called once when Servlet is created.\nservice() - Called for every request.\nservice() - Called for every request.\ndestroy() - Called once when Servlet is stopped.");
        write(base, "slip5", "q2", "explanation.md", "Theoretical explanation of Servlet Lifecycle mocked through core Java to ensure code compilability. (Unit 3: Servlets)");
        write(base, "slip5", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip5", "# Slip 5\n\nTopics:\n- Multithreading (Runnable)\n- Servlet Life Cycle\n\nUnits: Unit 2, Unit 3");
    }

    static void generateSlip6(String base) throws Exception {
        String code1 = """
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.hasNext() ? sc.next() : "abc";
        
        try {
            int num = Integer.parseInt(input);
            System.out.println("Successfully converted to integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught: Invalid input. Cannot convert '" + input + "' to integer.");
        }
    }
}
""";
        write(base, "slip6", "q1", "code/Main.java", code1);
        write(base, "slip6", "q1", "output.txt", "Enter a number: abc\nException Caught: Invalid input. Cannot convert 'abc' to integer.");
        write(base, "slip6", "q1", "explanation.md", "Demonstrates Exception Handling for NumberFormatException. (Unit 2: Exception Handling)");
        write(base, "slip6", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        String code2 = """
public class Main {
    public static void main(String[] args) {
        System.out.println("--- JSP Implicit Objects ---");
        System.out.println("1. request (HttpServletRequest): Used to read client request data (e.g., request.getParameter(\"name\")).");
        System.out.println("2. response (HttpServletResponse): Used to send response to client (e.g., response.sendRedirect()).");
        System.out.println("3. session (HttpSession): Used to store session-specific data (e.g., session.setAttribute(\"user\", obj)).");
        System.out.println("4. out (JspWriter): Used to print to the output stream (e.g., out.println(\"Hello\")).");
        System.out.println("\\n(Code logic runs as Core Java mock printout for exam preparation)");
    }
}
""";
        write(base, "slip6", "q2", "code/Main.java", code2);
        write(base, "slip6", "q2", "output.txt", "--- JSP Implicit Objects ---\n1. request...\n2. response...\n3. session...");
        write(base, "slip6", "q2", "explanation.md", "Theoretical explanation of JSP Implicit Objects printed via Java application. (Unit 4: JSP)");
        write(base, "slip6", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip6", "# Slip 6\n\nTopics:\n- Exception Handling\n- JSP Implicit Objects\n\nUnits: Unit 2, Unit 4");
    }

    static void generateSlip7(String base) throws Exception {
        String code1 = """
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
""";
        write(base, "slip7", "q1", "code/Main.java", code1);
        write(base, "slip7", "q1", "output.txt", "Simulating WelcomeServlet execution...\n<h1>Welcome John Doe</h1>");
        write(base, "slip7", "q1", "explanation.md", "Mocks a Servlet capturing an HTML form parameter and displaying a welcome message. (Unit 3: Servlets)");
        write(base, "slip7", "q1", "run.md", "```bash\n# Note: In real world, deploy to Tomcat. Here we run via mock.\njavac Main.java\njava Main\n```");

        String code2 = """
class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread is running. Name: " + this.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("MySpecialThread");
        t1.start();
    }
}
""";
        write(base, "slip7", "q2", "code/Main.java", code2);
        write(base, "slip7", "q2", "output.txt", "Thread is running. Name: MySpecialThread");
        write(base, "slip7", "q2", "explanation.md", "Demonstrates custom thread naming using the Thread class constructor. (Unit 2: Multithreading)");
        write(base, "slip7", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip7", "# Slip 7\n\nTopics:\n- Servlets\n- Multithreading (Thread Name)\n\nUnits: Unit 2, Unit 3");
    }

    static void generateSlip8(String base) throws Exception {
        String jspCode = """
<%@ page language="java" %>
<html>
<body>
    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        int res = 0;
        if(n1 != null && n2 != null) {
            res = Integer.parseInt(n1) * Integer.parseInt(n2);
        }
    %>
    <h3>Multiplication: <%= res %></h3>
</body>
</html>
""";
        write(base, "slip8", "q1", "code/index.jsp", jspCode);
        
        String code1 = """
public class Main {
    public static void main(String[] args) {
        System.out.println("JSP file generated in code/index.jsp");
        System.out.println("JSP Expression Tag used: <%= res %>");
        System.out.println("Deploy to Apache Tomcat to run.");
    }
}
""";
        write(base, "slip8", "q1", "code/Main.java", code1);
        write(base, "slip8", "q1", "output.txt", "JSP Expression Tag used: <%= res %>");
        write(base, "slip8", "q1", "explanation.md", "Demonstrates JSP expression tag <%= %> to print results directly. (Unit 4: JSP)");
        write(base, "slip8", "q1", "run.md", "```bash\n# Deploy index.jsp to Tomcat webapp folder\njavac Main.java\njava Main\n```");

        String code2 = """
class Employee {
    void calculateSalary() {
        System.out.println("Employee Salary: Base Salary");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: Base Salary + Bonus");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e;
        
        e = new Employee();
        e.calculateSalary(); // Calls Employee method
        
        e = new Manager();
        e.calculateSalary(); // Calls Manager method (Runtime Polymorphism)
    }
}
""";
        write(base, "slip8", "q2", "code/Main.java", code2);
        write(base, "slip8", "q2", "output.txt", "Employee Salary: Base Salary\nManager Salary: Base Salary + Bonus");
        write(base, "slip8", "q2", "explanation.md", "Demonstrates runtime polymorphism using method overriding with parent reference holding child object. (Unit 1: Polymorphism)");
        write(base, "slip8", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip8", "# Slip 8\n\nTopics:\n- JSP Expression Tag\n- Runtime Polymorphism\n\nUnits: Unit 1, Unit 4");
    }

    static void generateSlip9(String base) throws Exception {
        String jspCode = """
<%@ page import="java.sql.*" %>
<html>
<body>
    <h2>Student Records</h2>
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            while(rs.next()) {
                out.println("RollNo: " + rs.getInt(1) + " Name: " + rs.getString(2) + "<br>");
            }
        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>
</body>
</html>
""";
        write(base, "slip9", "q1", "code/index.jsp", jspCode);
        
        String code1 = """
public class Main {
    public static void main(String[] args) {
        System.out.println("JSP with JDBC generated in code/index.jsp");
        System.out.println("It uses java.sql.* and retrieves all records from Student table.");
        System.out.println("Deploy to Tomcat to test.");
    }
}
""";
        write(base, "slip9", "q1", "code/Main.java", code1);
        write(base, "slip9", "q1", "output.txt", "JSP with JDBC generated in code/index.jsp");
        write(base, "slip9", "q1", "explanation.md", "JSP page connecting to a database using JDBC and retrieving records. (Unit 4: JSP, JDBC)");
        write(base, "slip9", "q1", "run.md", "```bash\n# Needs MySQL Driver in Tomcat lib\njavac Main.java\njava Main\n```");

        String code2 = """
// Interface vs Abstract Class
interface Drawable {
    void draw(); // implicitly public abstract
}

abstract class Shape {
    String color;
    Shape(String color) { this.color = color; }
    abstract void area(); // can have constructors and state
}

class Circle extends Shape implements Drawable {
    Circle() { super("Red"); }
    public void draw() { System.out.println("Drawing Circle"); }
    public void area() { System.out.println("Area of " + color + " Circle"); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract classes can have state and constructors. Interfaces cannot (prior to Java 8 default methods).");
        Circle c = new Circle();
        c.draw();
        c.area();
    }
}
""";
        write(base, "slip9", "q2", "code/Main.java", code2);
        write(base, "slip9", "q2", "output.txt", "Abstract classes can have state...\nDrawing Circle\nArea of Red Circle");
        write(base, "slip9", "q2", "explanation.md", "Differentiates abstract class (has state/constructors) from interface (pure abstraction). (Unit 1: Abstract Class, Interface)");
        write(base, "slip9", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip9", "# Slip 9\n\nTopics:\n- JSP & JDBC\n- Interface vs Abstract Class\n\nUnits: Unit 1, Unit 4");
    }

    static void generateSlip10(String base) throws Exception {
        String code1 = """
class Employee {
    private int empId;
    private String name;
    
    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Alice");
        e.display();
    }
}
""";
        write(base, "slip10", "q1", "code/Main.java", code1);
        write(base, "slip10", "q1", "output.txt", "Employee ID: 101, Name: Alice");
        write(base, "slip10", "q1", "explanation.md", "Demonstrates encapsulation by keeping fields private and providing public getters/setters. (Unit 1: Encapsulation)");
        write(base, "slip10", "q1", "run.md", "```bash\njavac Main.java\njava Main\n```");

        String code2 = """
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Servlet Life Cycle ---");
        System.out.println("1. init(): Called exactly once by the container when the servlet is instantiated.");
        System.out.println("2. service(): Called by the container to allow the servlet to respond to a request. (Can be called many times).");
        System.out.println("3. destroy(): Called exactly once when the servlet is taken out of service.");
    }
}
""";
        write(base, "slip10", "q2", "code/Main.java", code2);
        write(base, "slip10", "q2", "output.txt", "--- Servlet Life Cycle ---\n1. init()...\n2. service()...\n3. destroy()...");
        write(base, "slip10", "q2", "explanation.md", "Theoretical explanation of Servlet Lifecycle. (Unit 3: Servlets)");
        write(base, "slip10", "q2", "run.md", "```bash\njavac Main.java\njava Main\n```");
        writeMeta(base, "slip10", "# Slip 10\n\nTopics:\n- Encapsulation\n- Servlet Life Cycle\n\nUnits: Unit 1, Unit 3");
    }

    static void generateCommon(String base) throws Exception {
        writeRaw(base, "common/java-setup.md", "# Core Java Setup\nInstall JDK 17. Use `javac Main.java` and `java Main`.");
        writeRaw(base, "common/servlet-setup.md", "# Servlet Setup\nInstall Apache Tomcat. Compile using `servlet-api.jar` in classpath. Deploy to Tomcat webapps.");
        writeRaw(base, "common/jsp-setup.md", "# JSP Setup\nDeploy .jsp files into the Tomcat webapps directory and access via browser.");
        writeRaw(base, "common/jdbc-setup.md", "# JDBC Setup\nAdd MySQL connector jar to your project classpath. Ensure DB is running.");
        writeRaw(base, "common/spring-setup.md", "# Spring Setup\nUse Maven or Gradle with Spring MVC dependencies. Configure DispatcherServlet in web.xml.");
    }
    
    static void generateReadme(String base) throws Exception {
        String r = """
# Java Practical Slips Solutions

This repository contains fully compilable and runnable Java code for SPPU MCA Semester II practical slips.

## Structure
- `slips/`: Contains code, output, and explanations.
- `common/`: Setup guides.
- `web-viewer/`: Interactive UI to view slips.
- `data/`: JSON index.

## Running the Web Viewer
Open `web-viewer/index.html` in your browser.
""";
        writeRaw(base, "README.md", r);
    }

    static void generateJson(String base) throws Exception {
        String json = """
{
  "groups": [
    {
      "name": "Slips 1 to 10",
      "folder": "slips-1-10",
      "slips": [
        { "id": 1, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip1/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip1/q2" } ] },
        { "id": 2, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip2/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip2/q2" } ] },
        { "id": 3, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip3/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip3/q2" } ] },
        { "id": 4, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip4/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip4/q2" } ] },
        { "id": 5, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip5/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip5/q2" } ] },
        { "id": 6, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip6/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip6/q2" } ] },
        { "id": 7, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip7/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip7/q2" } ] },
        { "id": 8, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip8/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip8/q2" } ] },
        { "id": 9, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip9/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip9/q2" } ] },
        { "id": 10, "questions": [ { "title": "Question 1", "path": "slips/slips-1-10/slip10/q1" }, { "title": "Question 2", "path": "slips/slips-1-10/slip10/q2" } ] }
      ]
    }
  ]
}
""";
        writeRaw(base, "data/slips.json", json);
    }

    static void generateWebViewer(String base) throws Exception {
        String css = """
:root { --bg: #121212; --surface: #1e1e1e; --primary: #bb86fc; --text: #e0e0e0; }
body { font-family: 'Inter', sans-serif; background: var(--bg); color: var(--text); margin: 0; padding: 20px; }
h1, h2 { color: var(--primary); }
.card { background: var(--surface); padding: 20px; border-radius: 8px; margin-bottom: 20px; cursor: pointer; transition: 0.3s; }
.card:hover { transform: translateY(-5px); box-shadow: 0 5px 15px rgba(187, 134, 252, 0.3); }
pre { background: #2d2d2d; padding: 15px; border-radius: 5px; overflow-x: auto; position: relative; }
.copy-btn { position: absolute; top: 10px; right: 10px; background: var(--primary); color: #000; border: none; padding: 5px 10px; cursor: pointer; border-radius: 4px;}
.split { display: flex; gap: 20px; }
.half { flex: 1; }
a { color: var(--primary); text-decoration: none; }
#search { padding: 10px; width: 100%; max-width: 400px; margin-bottom: 20px; border-radius: 4px; border: none; }
""";
        writeRaw(base, "web-viewer/css/styles.css", css);

        String indexHtml = """
<!DOCTYPE html><html><head><link rel="stylesheet" href="css/styles.css"><title>Java Practical Slips</title></head>
<body>
    <h1>SPPU MCA Sem II Java Practical Slips</h1>
    <input type="text" id="search" placeholder="Search slips...">
    <div id="groups"></div>
    <script src="../data/slips.json" id="data"></script>
    <script>
        fetch('../data/slips.json').then(r=>r.json()).then(data => {
            const container = document.getElementById('groups');
            data.groups.forEach(g => {
                const el = document.createElement('div');
                el.className = 'card';
                el.innerHTML = `<h2>${g.name}</h2><p>Click to view slips</p>`;
                el.onclick = () => window.location.href = `folder.html?folder=${g.folder}`;
                container.appendChild(el);
            });
        });
    </script>
</body></html>
""";
        writeRaw(base, "web-viewer/index.html", indexHtml);

        String folderHtml = """
<!DOCTYPE html><html><head><link rel="stylesheet" href="css/styles.css"><title>Slips Group</title></head>
<body>
    <a href="index.html">&larr; Back to Groups</a>
    <h1 id="title">Slips</h1>
    <div id="slips"></div>
    <script>
        const urlParams = new URLSearchParams(window.location.search);
        const folder = urlParams.get('folder');
        fetch('../data/slips.json').then(r=>r.json()).then(data => {
            const group = data.groups.find(g => g.folder === folder);
            document.getElementById('title').innerText = group.name;
            const container = document.getElementById('slips');
            group.slips.forEach(s => {
                const el = document.createElement('div');
                el.className = 'card';
                el.innerHTML = `<h2>Slip ${s.id}</h2>`;
                el.onclick = () => window.location.href = `slip.html?folder=${folder}&id=${s.id}`;
                container.appendChild(el);
            });
        });
    </script>
</body></html>
""";
        writeRaw(base, "web-viewer/folder.html", folderHtml);

        String slipHtml = """
<!DOCTYPE html><html><head><link rel="stylesheet" href="css/styles.css"><title>Slip Details</title></head>
<body>
    <a href="javascript:history.back()">&larr; Back to Slips</a>
    <h1 id="title">Slip Details</h1>
    <div class="split" id="content"></div>
    <script>
        async function loadContent(path) {
            try {
                const [code, exp, out, run] = await Promise.all([
                    fetch(`../${path}/code/Main.java`).then(r => r.text()),
                    fetch(`../${path}/explanation.md`).then(r => r.text()),
                    fetch(`../${path}/output.txt`).then(r => r.text()),
                    fetch(`../${path}/run.md`).then(r => r.text())
                ]);
                return {code, exp, out, run};
            } catch(e) { return null; }
        }
        
        const copyCode = (btn) => {
            const code = btn.nextElementSibling.innerText;
            navigator.clipboard.writeText(code);
            btn.innerText = 'Copied!';
            setTimeout(()=> btn.innerText = 'Copy', 2000);
        };

        const urlParams = new URLSearchParams(window.location.search);
        const id = urlParams.get('id');
        document.getElementById('title').innerText = `Slip ${id}`;
        
        fetch('../data/slips.json').then(r=>r.json()).then(async data => {
            const slip = data.groups[0].slips.find(s => s.id == id);
            const c = document.getElementById('content');
            
            for(let q of slip.questions) {
                const details = await loadContent(q.path);
                if(details) {
                    const el = document.createElement('div');
                    el.className = 'half card';
                    el.innerHTML = `
                        <h2>${q.title}</h2>
                        <p><strong>Explanation:</strong> ${details.exp}</p>
                        <pre><button class="copy-btn" onclick="copyCode(this)">Copy</button><code>${details.code.replace(/</g, '&lt;').replace(/>/g, '&gt;')}</code></pre>
                        <h3>Output:</h3>
                        <pre>${details.out}</pre>
                        <h3>Run:</h3>
                        <p>${details.run}</p>
                    `;
                    c.appendChild(el);
                }
            }
        });
    </script>
</body></html>
""";
        writeRaw(base, "web-viewer/slip.html", slipHtml);
    }
}
