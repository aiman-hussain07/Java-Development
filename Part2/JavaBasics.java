package Part2;

import java.util.Scanner;
// import java.lang.Math;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = ((pencil + pen + eraser) * 118) / 100;
        System.out.println(bill);

    }
}