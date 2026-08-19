import java.util.Scanner;

public class RestaurantMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- RESTAURANT MENU -----");
        System.out.println("1. Idly  - ₹30");
        System.out.println("2. Dosa  - ₹50");
        System.out.println("3. Poori - ₹40");
        System.out.println("4. Meals - ₹100");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You selected Idly");
                System.out.println("Price: ₹30");
                break;

            case 2:
                System.out.println("You selected Dosa");
                System.out.println("Price: ₹50");
                break;

            case 3:
                System.out.println("You selected Poori");
                System.out.println("Price: ₹40");
                break;

            case 4:
                System.out.println("You selected Meals");
                System.out.println("Price: ₹100");
                break;

            case 5:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}