/**
 * Slip 43 Q2: InvalidAgeException for senior citizen (age < 60).
 * Unit: UNIT 2 – User-defined Exception
 */
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
class SeniorCitizen {
    String name; int age;
    SeniorCitizen(String name, int age) throws InvalidAgeException {
        if (age < 60) throw new InvalidAgeException(name + " age " + age + " is below 60. Not a senior citizen.");
        this.name = name; this.age = age;
    }
    void display() { System.out.println("Senior Citizen: " + name + ", Age: " + age); }
}
public class Main {
    public static void main(String[] args) {
        String[][] data = {{"Ramesh","65"},{"Sunil","55"},{"Kamala","72"},{"Aarti","45"}};
        for (String[] d : data) {
            try {
                SeniorCitizen sc = new SeniorCitizen(d[0], Integer.parseInt(d[1]));
                sc.display();
            } catch (InvalidAgeException e) {
                System.out.println("InvalidAgeException: " + e.getMessage());
            }
        }
    }
}
