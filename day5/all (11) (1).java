import java.util.Scanner;

public class MostFrequentDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] frequency = new int[10];

        while (num != 0)
        {
            int digit = num % 10;

            frequency[digit]++;

            num = num / 10;
        }

        int maxDigit = 0;
        int maxFrequency = frequency[0];

        for (int i = 1; i <= 9; i++)
        {
            if (frequency[i] > maxFrequency)
            {
                maxFrequency = frequency[i];
                maxDigit = i;
            }
        }

        System.out.println("Most Frequent Digit: " + maxDigit);
        System.out.println("Frequency: " + maxFrequency);

        sc.close();
    }
}