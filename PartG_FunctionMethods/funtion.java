package PartG_FunctionMethods;

import java.util.*;
import java.lang.Math;

class function {

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static int binomailCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int biCo = fact_n / (fact_r * fact_nmr);
        return biCo;

    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            // for (int i = 2; i <= (n - 1); i++) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            ;
        }
    }

    public static void binToDec(int binNum) {
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println(dec);
    }

    public static void decToBin(int decNum) {
        int pow = 0;
        int bin = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin += rem * Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        System.out.println(bin);
    }

    public static float average(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int reverse(int n) {
        int revereNum = 0;
        while (n > 0) {
            int lastD = n % 10;
            revereNum = (int) ((revereNum * 10) + lastD);
            n /= 10;
        }
        return revereNum;

    }

    public static boolean isPalindrome(int n) {
        if (n == reverse(n)) {
            return true;
        }
        return false;
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(12345));
    }
}
