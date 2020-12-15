package HW_04.Math;

//mostly from https://www.geeksforgeeks.org/print-all-prime-numbers-less-than-or-equal-to-n/
//but rewritten the chek at line 14
public class Prime {
    // function check whether a number is prime or not

    static boolean isPrime(int n) {
// Corner case
        if (n <= 1) {
            return false;
        }
// Check from 2 to n-1
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print primes
    static void printPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }


}
