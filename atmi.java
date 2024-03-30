/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class atmi {
    public static void main(String args[]) {
        bank_account mybank = new bank_account();
        mybank.user_bank_account();
        mybank.options();
    }
}

class atm {
    int choice;
    public double balance = 1000;

    void options() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("here are some of options for atm interface");
            System.out.println("1. Option for withdrawing");
            System.out.println("2. Option for depositing");
            System.out.println("3. Option for checking balance");
            System.out.println("4. Option for exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> withdraw();
                case 2 -> deposit();
                case 3 -> checkbalance();
                case 4 -> exit();
                default -> System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
    }

    

    public double withdraw() {
        int withdraw_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdraw amount:");
        withdraw_amount = scanner.nextInt();
        if (balance < withdraw_amount) {
            System.out.println("Insufficient balance in the bank.");
        } else {
            balance -= withdraw_amount;
            System.out.println("The balance after withdrawing: " + balance);
        }
        return balance;
    }

    public void deposit() {
        int deposit_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        deposit_amount = scanner.nextInt();
        balance += deposit_amount;
        System.out.println("The balance after depositing is: " + balance);
    }

    public double checkbalance() {
        System.out.println(" the balance is "+balance);
        return 0;
    }
    public void exit() {
        System.out.println("Exiting the program. Thank you for using ATM.");
    }
}

class bank_account extends atm {
    void user_bank_account() {
        System.out.println("The balance in ATM: " + balance);
    }
}
