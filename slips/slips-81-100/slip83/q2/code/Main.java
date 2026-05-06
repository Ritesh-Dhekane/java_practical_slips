class SalaryException extends Exception { SalaryException(String m){super(m);} }
class Employee {
    void setSalary(int s) throws SalaryException {
        if(s <= 10000) throw new SalaryException("Salary must be > 10000");
        System.out.println("Salary set: " + s);
    }
}
public class Main {
    public static void main(String[] args) {
        try { new Employee().setSalary(5000); } catch(Exception e) { System.out.println(e.getMessage()); }
    }
}
