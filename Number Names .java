import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        String number = scanner.nextLine();

        
        char[] digits = number.toCharArray();

        
        String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        
        for (char digit : digits) {
            int index = Character.getNumericValue(digit);
            System.out.print(names[index] + " ");
        }

        scanner.close();
    }
}
