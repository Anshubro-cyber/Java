import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Lambdas =======");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(35);
        numbers.add(48);
        // numbers.add(49);
        numbers.add(18);
        numbers.add(13);

        // Print all numbers using lambda
        numbers.forEach(x -> { 
            System.out.println(x); 
        });

        // Check if 49 is present
        numbers.forEach(n -> { 
            if (n == 49) {
                System.out.println("Found 49");
            }
        });
    }
}
