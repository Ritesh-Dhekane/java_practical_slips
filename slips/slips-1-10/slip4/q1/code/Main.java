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
