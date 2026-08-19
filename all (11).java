import java.util.Scanner;

public class LoginSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername))
        {
            if (password.equals(correctPassword))
            {
                System.out.println("Login Successful");
            }
            else
            {
                System.out.println("Incorrect Password");
            }
        }
        else
        {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}