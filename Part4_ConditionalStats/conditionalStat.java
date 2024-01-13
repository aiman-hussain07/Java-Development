package Part4_ConditionalStats;

import java.util.*;

class conditionalStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age:");
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("Aap badhe hain");
        // } else if (age > 13 && age < 18) {
        // System.out.println("Aap teenager hain");
        // } else {
        // System.out.println("Aap bachche hain");
        // }

        // Print the largest of any two numbers
        // System.out.println("Enter first number:");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = sc.nextInt();
        // if(num1>num2){
        // System.out.println("The largest number among " + num1 + " & " + num2 + " is "
        // + num1);
        // } else {
        // System.out.println("The largest number among " + num1 + " & " + num2 + " is "
        // + num2);
        // }

        // Print if a number is odd or even
        // System.out.println("Enter your number:");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        // Income Tax Calculator
        // System.out.println("Enter income : ");
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        // tax = 0;
        // } else if (income >= 500000 && income < 1000000) {
        // tax = (int) (0.2 * income);
        // } else {
        // tax = (int) (0.3 * income);
        // }
        // System.out.println("Tax is "+ tax);

        // Print the largest of three numbers
        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int num2 = sc.nextInt();
        // System.out.println("Enter third number: ");
        // int num3 = sc.nextInt();
        // if(num1>=num3 && num1>=num3){
        // System.out.println("Largest value is "+ num1);
        // } else if (num2>=num3){
        // System.out.println("Largest value is "+ num2);
        // } else {
        // System.out.println("Largest value is "+ num3);
        // }

        // Ternary Operator
        // System.out.println("Enter your marks: ");
        // int marks = sc.nextInt();
        // String status = (marks>=33)? "passed":"failed";
        // System.out.println("The student has " + status + " this session." );

        // Calculator using Switch
        int a = 10;
        int b = 3;
        float value;
        System.out.println("Which operation would you like to perform: ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                value = a + b;
                break;
            case '-':
                value = a - b;
                break;
            case '*':
                value = a * b;
                break;
            case '/':
                value = a / b;
                break;
            case '%':
                value = a % b;
                break;
            default:
                value = 0;
        }
        System.out.println("On performing " + op + " operation on a and b, we get " + value);

    }
}