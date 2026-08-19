import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("Current Balance: ₹" + balance);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0)
        {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: ₹" + balance);
        }

        sc.close();
    }
}