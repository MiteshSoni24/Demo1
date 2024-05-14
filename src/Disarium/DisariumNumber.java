package Disarium;

public class DisariumNumber {

    // Method to calculate the power of a number
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    // Recursive method to calculate the sum of digits powered to their positions
    public static int sumOfPowerDigits(int num, int numDigits) {
        if (num == 0) {
            return 0;
        }
        int lastDigit = num % 10;
        return power(lastDigit, numDigits) + sumOfPowerDigits(num / 10, numDigits - 1);
    }

    // Method to check if a number is a Disarium number
    public static boolean isDisarium(int num) {
        int numDigits = countDigits(num);
        int sum = sumOfPowerDigits(num, numDigits);
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 175; // Change this number to test other values
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }
}
