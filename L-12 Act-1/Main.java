import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];
        int option, size = 100;

        Scanner sc = new Scanner(System.in);

        while (infiniteLoop) {
            System.out.println("Welcome to Akshat Banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below. ");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.println("6-> Quit");

            System.out.print("Enter your option to proceed ahead: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("\nAdd Customer \nMenu->");
                sc.nextLine();
                System.out.print("\nEnter Customer Name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.print("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully.\n");
                System.out.println("Account Details:- \n ");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name: " + accountName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + " Rs \n");
                System.out.println("================================");

                size = size + 1;
            } else if (option == 2) {
                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex >= size || accountIndex < 100) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    temp = accountName[accountIndex];
                    System.out.print("Enter the new name: ");
                    String newName = sc.nextLine();
                    accountName[accountIndex] = newName;
                    System.out.println("Name changed successfully.");
                    System.out.println("Old Name: " + temp);
                    System.out.println("New Name: " + accountName[accountIndex]);
                }
                System.out.println("================================");
            } else if (option == 3) {
                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");
                int accountIndex = sc.nextInt();

                if (accountIndex >= size || accountIndex < 100) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println("Account Name: " + accountName[accountIndex]);
                    System.out.println("Account Balance: " + accountBalance[accountIndex] + " Rs");
                }
                System.out.println("================================");
            } else if (option == 4) {
                System.out.println("\nUpdate Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");
                int accountIndex = sc.nextInt();

                if (accountIndex >= size || accountIndex < 100) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println("1-> Deposit");
                    System.out.println("2-> Withdraw");
                    System.out.print("\nEnter your option to proceed: ");
                    int transactionOption = sc.nextInt();

                    if (transactionOption == 1) {
                        System.out.print("Enter amount to be deposited: ");
                        double depositAmount = sc.nextDouble();
                        accountBalance[accountIndex] += depositAmount;
                        System.out.println(accountName[accountIndex] + ", your updated balance is : " + accountBalance[accountIndex] + " Rs.\n");
                    } else if (transactionOption == 2) {
                        System.out.print("Enter amount to be withdrawn: ");
                        double withdrawAmount = sc.nextDouble();
                        if (withdrawAmount > accountBalance[accountIndex]) {
                            System.out.println("Insufficient Balance.");
                        } else {
                            accountBalance[accountIndex] -= withdrawAmount;
                            System.out.println(withdrawAmount + " Rs withdrawn successfully.");
                            System.out.println("Current Account Balance: " + accountBalance[accountIndex] + " Rs");
                        }
                    } else {
                        System.out.println("Invalid option.");
                    }
                }
                System.out.println("================================");
            } else if (option == 5) {
                System.out.println("Accounts registered\n");
                for (int i = 100; i < size; i++) {
                    System.out.println("Account Number: " + i);
                    System.out.println("Customer Name: " + accountName[i]);
                    System.out.println("Account Balance: " + accountBalance[i] + " Rs \n");
                    System.out.println("================================");
                }
            } else if (option == 6) {
                System.out.println("Thank you for using our banking services!");
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid option. Please try again.");
                System.out.println("================================");
            }
        }
    }
}
