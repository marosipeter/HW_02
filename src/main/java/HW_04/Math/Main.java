package HW_04.Math;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String... args){

        //1. Calculate the sum of the first 100 numbers higher than 0
        int sum = 0;
        int n = 100;
        for (int i = 0; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println("The sum of the first " + n + " numbers is " + sum +".");
        System.out.println("***\n");

        //2. Display the smallest number from an array of number
        int[] ints = {10, 7, -1, -2, 11, -114, 245};
        List<Integer> intList = new ArrayList<>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : ints){
            max=Math.max(max, element);
            min=Math.min(min, element);
        }
        System.out.print("We have these numbers: ");
        for (int i =0; i < intList.size()-1; i++)
            {System.out.print(intList.get(i) + ", ");}
        System.out.print(intList.get(intList.size()-1) + ".\n");
        System.out.println("The smallest number is " + min + ".");
        System.out.println("The biggest number is " + max + ".");
        System.out.println("***\n");

       // 3. Display the max digit from a number.
        int number = 98237;
        int length = String.valueOf(number).length();
        int small = 9;
        int big = 0;
        for (int i=1; i<=length; i++){
            int lastDigit = number%10;
            number = number /10;
            small = Math.min(small, lastDigit);
            big = Math.max(big, lastDigit);
        }
        System.out.println("The integer number is " + length + " digits long.");
        System.out.println("The smallest digit is " + small +".");
        System.out.println("The biggest digit is " + big +".");
        System.out.println("***\n");

       // 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
        int number2 = 123321;
        boolean palindrome = false;
        String numberStr = Integer.toString(number2);
        int lenght = numberStr.length();
        for (int i=0; i<lenght/2; i++){
            char c = numberStr.charAt(i);
            char d = numberStr.charAt(lenght-1-i);
            if (c==d)  {
                palindrome=true;
                continue; // without the continue it always returned false; why?
            }
            palindrome=false;
            break; //a break is needed, otherwise abcAAdef is also ends up true (the last pair matters)
        }
        if (palindrome == true){
            System.out.println("The integer number " + number2 + " is palindrome.");
        } else {
            System.out.println("The integer number " + number2 + " is _NOT_ a palindrome.");
        }
        System.out.println("***\n");


        //5. Display all the prime numbers lower than a given number

        int number3 = 19;
        if (Prime.isPrime(number3)==true){
        System.out.println("The input number " + number3 + " is a prime number.");
        System.out.println("The following numbers are also primes: ");
        Prime.printPrime(number3);}
        else {
            System.out.println("The input number " + number3 + " is _NOT_ a prime number.");
        }

    }
    }

