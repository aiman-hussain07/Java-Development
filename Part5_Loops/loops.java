package Part5_Loops;

import java.util.*;
import java.lang.Math;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Sum of ___ natural numbers: ");
        // int n = sc.nextInt();
        // int = 1;
        // int sum = 0;
        // while ( < n + 1) {
        // sum += ;
        // ++;
        // }
        // System.out.println(sum);

        // for loop
        // System.out.print("Print square of size: ");
        // int side = sc.nextInt();
        // for (int i = 1; i <= side; i++) {
        // for (int j = 1; j <= side; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // print reverse of a number
        // int n = -446699;
        // int num = Math.abs(n);
        // // System.out.println(num);
        // while (num > 0) {
        // int n1 = num % 10;
        // System.out.print(n1);
        // num /= 10;
        // }

        // reverse a given number
        // int m = 12345;
        // int reverse = 0;
        // while (m > 0) {
        // int m1 = m % 10;
        // reverse = (reverse * 10) + m1;
        // m /= 10;
        // }
        // System.out.println(reverse);

        // do while loop
        // int counter = 1;
        // do{
        // System.out.println("hi");
        // counter++;
        // } while(counter<1);

        // Break Statement
        // for(int i =1; i<=5; i++){
        // if(i==4){
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("Shayad 4 agaya");

        // Q. Keep entering no-s till user enters a multiple of 10
        // int input;
        // do {
        // System.out.println("Enter your number");
        // input = sc.nextInt();
        // } while (input % 10 != 0);

        // Above Q with for loop
        // int input;
        // Scanner num = new Scanner(System.in);

        // System.out.println("Enter your number");
        // input = num.nextInt();

        // for (; input % 10 != 0;) {
        // System.out.println("Enter a number divisible by 10:");
        // input = num.nextInt();
        // }

        // continue statement
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // Q. Display all numbers entered by user except multiple of 10
        // do{
        // int a = sc.nextInt();
        // if(a%10==0){
        // continue;
        // }
        // System.out.println(a);
        // } while(true);

        // Q. Check whether a number is prime or not
        // System.out.println("Enter your number: ");
        // int b = sc.nextInt();

        // if (b == 2) {
        // System.out.println("Number is prime");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(b); i++) {
        // if (b % i == 0) {
        // isPrime = false;
        // }
        // System.out.println("check");
        // }
        // if (isPrime == true) {
        // System.out.println("Number is prime");
        // } else {
        // System.out.println("Number is not prime");
        // }

        // }

        // factorial
        // System.out.println("Enter number: ");
        // int c = sc.nextInt();
        // int fact = 1;
        // if (c == 0) {
        // fact = 1;
        // } else {
        // for (int i = c; i > 0; i--) {
        // fact *= i;
        // }
        // }
        // System.out.println("Factorial of entered number is: " + fact);

        // Multiplication Table
        // System.out.print("Enter number: ");
        // int d = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(d * i);
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }

}