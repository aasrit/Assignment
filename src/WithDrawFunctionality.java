import java.util.Scanner;

public class WithDrawFunctionality {
    static void display()  {
        double deposit, withdraw, balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Withdraw an amount");
        withdraw = sc.nextDouble();
        balance = balance - withdraw;
        if (withdraw > balance || balance < 0) {
            throw new ArithmeticException("InsufficientBalanceException");
        } else {
            System.out.println(balance);
        }
        if(withdraw<0) {
            throw new ArithmeticException("IllegalBankTransactionException");
        }
        else {
            System.out.println(balance);
        }
    }

    public static void main(String[] args) {
        display();
    }

}
