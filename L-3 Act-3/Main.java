import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects: ");
        int noOfSubjects = sc.nextInt();

        int marks[] = new int[noOfSubjects]; // initializing array

        System.out.println("Enter the marks of " + noOfSubjects + " subjects. Press Enter to give marks for another subject:");

        // entering marks
        for (int i = 0; i < noOfSubjects; i++) {
            marks[i] = sc.nextInt();
        }

        // calculating sum
        for (int j = 0; j < noOfSubjects; j++) {
            sum += marks[j];
        }

        // generating result
        int percentage = sum / noOfSubjects;
        // can also be written as:
        // int percentage = (sum / noOfSubjects * 100);

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 95) {
            result = "You scored O grade. Great Work!";
        } else if (percentage > 90 && percentage < 95) {
            result = "You scored A+. Well Done!";
        } else {
            result = "You passed";
        }

        // make sure to create grading for other marks too
        // percentage can also be converted to CGPA

        System.out.println(result);
    }
}
