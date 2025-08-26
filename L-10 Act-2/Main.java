// Main.java
import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);

        // we are creating a hiring tool where the HR can register candidates 
        // based on eligibility to the database
        // database connection is not done in this program to avoid complexity
        // this could be completed using simple if else too but when systems become complex
        // using the standard approach becomes the best solution

        System.out.println("Enter the candidate Details");

        System.out.println("Name:");
        String name = scanner.next();

        System.out.println("Gender:");
        String gender = scanner.next();

        System.out.println("Enter Percentage in 10th:");
        int percentage = scanner.nextInt();

        // extra eligibility criteria can also be added (like 12th marks, Java skills etc.)
        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percentage cannot be less than 50%.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InternHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
            // consider this was a working application, here we could save data to database
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Candidate.java
class Candidate {
    private String name;
    private String gender;
    private int percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}

// InvalidInternException.java
class InvalidInternException extends Exception {
    public InvalidInternException(String message) {
        super(message);
    }
}
