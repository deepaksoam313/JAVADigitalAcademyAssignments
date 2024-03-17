
/*
Problem Statement 2:

Write a Java program that prints all the prime numbers up to n (where n is a positive integer
input by the user), but with a twist: the program should use a while loop and should not use any
break statements.

 */

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        System.out.print("Enter the Number = ");
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i<= number; i++){
            if(printPrimeNumber(i))
                System.out.println(i);
        }
    }

    static boolean printPrimeNumber(int n){
        if(n == 1 || n == 0) return false;

        int i = 2;

        while(i< n){
           if(n % i == 0) return false;
           i++;
        }

        return true;
    }
}
