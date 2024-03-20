package Part12_Strings;

import java.util.Arrays;

public class hw {
    // Q1
    public static int countLowerCaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2) {
        // check length
        if (str1.length() == str2.length()) {
            // then
            int n = str1.length();
            // Convert String into char array
            char charArray1[] = new char[n], charArray2[] = new char[n];
            for (int i = 0; i < n; i++) {
                charArray1[i] = Character.toLowerCase(str1.charAt(i));
            }
            for (int i = 0; i < n; i++) {
                charArray2[i] = Character.toLowerCase(str1.charAt(i));
            }

            // Sort these arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted arrays
            return Arrays.equals(charArray1, charArray2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "hi, my name is aiman.";
        System.out.println(countLowerCaseVowels(str));
        String str1 = "Angered";
        String str2 = "enraged";
        System.out.println(isAnagram(str1, str2));

    }
}
