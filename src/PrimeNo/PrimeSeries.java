package PrimeNo;

public class PrimeSeries {

    // Method to check if a number is prime
    public static boolean isPrime(int num, int divisor) {
        // Base cases
        if (num <= 2) {
            return (num == 2);
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        // Recursive case
        return isPrime(num, divisor + 1);
    }

    // Method to print prime numbers
    public static void printPrimeSeries(int count, int currentNum, int primesPrinted) {
        if (primesPrinted == count) {
            return;
        }
        if (isPrime(currentNum, 2)) {
            System.out.print(currentNum + " ");
            primesPrinted++;
        }
        printPrimeSeries(count, currentNum + 1, primesPrinted);
    }

    public static void main(String[] args) {
        int numberOfPrimes = 10; // Number of primes to print
        System.out.println("Prime numbers:");
        printPrimeSeries(numberOfPrimes, 2, 0);
    }
}

