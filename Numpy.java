import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int result;
            if (number > 50) {
                // If number is greater than 50, find the difference between the digits
                int digit1 = number / 10;
                int digit2 = number % 10;
                result = digit1 - digit2;
            } else {
                // If number is less than or equal to 50, reverse the number and find the difference in digits
                int reversed = (number % 10) * 10 + (number / 10);
                int digit1 = reversed / 10;
                int digit2 = reversed % 10;
                result = digit1 - digit2;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid number");
        }

        scanner.close();
    }
}
