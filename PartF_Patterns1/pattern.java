package PartF_Patterns1;

import java.util.*;

class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Star Pattern
        // Outer Loop
        // for (int i = 0; i < n; i++) {
        // // Inner Loop
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // Inverted Star Pattern
        // Outer Loop
        // for (int i = 0; i < n; i++) {
        // // Inner Loop
        // for (int j = n; j > i; j--) {
        // // for (int j = 1; j < (n-i+1); j++) { //Shradha K. way
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Half Pyramid Pattern
        // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(j);
            // }
        // System.out.println();
        // }

        // Character Pattern
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
