import java.util.*;

public class ATM {
    public static void main(String args[]) {
        // declare and initialize balance, withdraw, and deposit
        int balance = 5000, withdraw, deposit;
        // create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("**Automated Teller Machine**");
            System.out.println("l. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose the operation you want to perform: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        // remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.println("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    // add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    // display the total balance
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    // exit from the menu
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
