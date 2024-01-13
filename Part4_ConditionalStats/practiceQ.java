package Part4_ConditionalStats;

import java.util.Scanner;

class practiceQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        // System.out.print("Enter your number: ");
        // int num = sc.nextInt();
        // String number = num>0? "positive":"negative";
        // System.out.println("Entered number is a " + number + " number" );

        // 2
        // double temp = 103.5;
        // String status = temp>100? "You have a fever": "You don't have a fever.";
        // System.out.println(status);

        // 3
        // System.out.print("Enter a number from 1-7: ");
        // int weakNum = sc.nextInt();
        // String weakDay;
        // switch (weakNum) {
        // case 1: weakDay = "Monday";
        // break;
        // case 2: weakDay = "Tueday";
        // break;
        // case 3: weakDay = "Wednesday";
        // break;
        // case 4: weakDay = "Thursday";
        // break;
        // case 5: weakDay = "Friday";
        // break;
        // case 6: weakDay = "Saturday";
        // break;
        // case 7: weakDay = "Sunday";
        // break;
        // default: weakDay = "invalid input";
        // }
        // System.out.println("Today is " + weakDay);

        // 5
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Entered year is a leap year");
                } else {
                    System.out.println("Entered year is not a leap year.");

                }
            } else {
                System.out.println("Entered year is a leap year.");

            }
        } else {
            System.out.println("Entered year is not a leap year.");
        }
    }
}