import java.util.*;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User, please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your lucky number:");
        int lucky = sc.nextInt();

        System.out.println("Hello " + name + ", your lucky number " + lucky + " shows you are really hardworking. Keep it up!");
    }
}
