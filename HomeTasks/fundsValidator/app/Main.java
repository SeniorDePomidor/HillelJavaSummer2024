package fundsValidator.app;

import java.util.Scanner;

public class Main {

    public static double balance=1000.00;

    public static void main(String[] args) {
        balance=getBalance();
        do{
            validateAmount(getAmount());
        }while(getBalance()>0);
    }

    private static double getBalance() {
        return balance; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException ("Insufficient funds!\n");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f\n", balance);
        }
    }

    // Метод розрахунку наявних коштів на рахунку
    // після зняття певної суми коштів
    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
