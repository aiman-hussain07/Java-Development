package Part12_Strings;

import java.util.*;

class string {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    // Q1
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " is not a palindrome.");
                return false;
            }
            i++;
            j--;
        }
        System.out.println(str + " is a palindrome.");
        return true;
    }

    // Q2
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x++;
            } else if (dir == 'E') {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    // Q3
    public static String largestString(String arr[]) {
        // Assumption
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Checking Assumption
            if (largest.compareTo(arr[i]) < 0) {
                // If assumption is wrong, updating largest
                largest = arr[i];
            }
        }
        return largest;
    }

    public static String firstLetterinWordtoUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            sb.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // don't understand how will this affect for loop's i++. I understand this will change this will make to i will affect for loop too.
            }
            if (count > 1) {
                sb.append(count);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String line = "hi, my name is aiman.";
        // System.out.println(firstLetterinWordtoUppercase(line));
        String str = "abcd";
        System.out.println(stringCompression(str));

    }
}