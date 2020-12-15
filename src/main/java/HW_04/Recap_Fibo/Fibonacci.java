package HW_04.Recap_Fibo;
//design stolen form: https://www.programiz.com/java-programming/examples/fibonacci-series

import javax.xml.bind.ValidationException;

public class Fibonacci {

    public static void fibonacci(Integer n) //list the first n numbers
    {
        if (n < 0){

            try {
                throw new FibonacciException("Please try a positive value.");
            } catch (FibonacciException e) {
                e.printStackTrace();
            }

        }

        int t1 = 0;
        int t2 = 1;
        System.out.print("The first " + n + " numbers in the Fibonacci series are: ");
        for (int i = 1; i <= n; ++i)
        {
            if (i<n){
            System.out.print(t1 + " , ");}
            else {System.out.print(t1 + ".");}

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
    }

    public static void fibonacci2(String x) //list the series up to n
    {
        int n = Integer.parseInt(x);

        int t1 = 0;
        int t2 = 1;
        System.out.print("\nThe fibonacci series up to " + n + " is: ");
        while (t1 <= n)
        {
            if (t1<n){
                System.out.print(t1 + " , ");}
            else {System.out.print(t1 + ".\n");}

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}