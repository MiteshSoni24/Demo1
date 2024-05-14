package Factorial;
public class FactorialNum {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        } else { // Recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial of a different number
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
