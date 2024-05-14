package ArmstrongNumber;
public class ArmStrong {

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

    // Recursive method to calculate the sum of the digits raised to the power of the number of digits
    public static int sumOfPowers(int num, int numDigits) {
        if (num == 0) {
            return 0;
        }
        int lastDigit = num % 10;
        return power(lastDigit, numDigits) + sumOfPowers(num / 10, numDigits);
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int numDigits = countDigits(num);
        int sum = sumOfPowers(num, numDigits);
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
