package Part9_Arrays;

import java.util.*;

class array {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int foodFinder(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestNum(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int[] reverseArr(int arr[]) {
        // int arrCopy[] = new int[arr.length];
        // for (int i = 0; i < arrCopy.length; i++) { // TC = O(n), SC = O(n)
        // arrCopy[i] = arr[arr.length - i - 1];
        // }
        // arr = arrCopy;
        // return arr;
        int first = 0, last = arr.length - 1;
        while (first < last) { // TC = O(n), SC = O(1)
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void pairinArray(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs = " + tp);
    }

    public static void printSubArray(int arr[]) {
        int ts = 0;
        // Start
        for (int i = 0; i < arr.length; i++) {
            // End
            for (int j = i; j < arr.length; j++) {
                // print Start to End
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println(" ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total number of Subarrays are: " + ts);
    }

    public static void suminSubArraysBrute(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > largest) {
                    largest = sum;
                }
                if (sum < smallest) {
                    smallest = sum;
                }
            }
        }
        System.out.println("Smallest sum of Subarray is: " + smallest);
        System.out.println("Largest sum of Subarray is: " + largest);
    }

    public static void suminSubArrayPrefix(int arr[]) {
        int prefixArr[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefixArr[i] = sum;
        }
        int largest = Integer.MIN_VALUE;
        int subSum = 0;
        // Start
        for (int i = 0; i < arr.length; i++) {
            // End
            for (int j = i; j < arr.length; j++) {
                subSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                System.out.println(subSum);
            }
            if (subSum > largest) {
                largest = subSum;
            }
        }
        System.out.println("Max Sum = " + largest);

    }

    public static void suminSubArrayKedane(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (currSum > largest) {
                largest = currSum;
            }
        }
        System.out.println("Max Sum = " + largest);
    }

    public static boolean checkArrforAllNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void maxforAllNegativeArr(int arr[]) {
        if (checkArrforAllNegative(arr)) {
            int ms = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (ms < arr[i]) {
                    ms = arr[i];
                }
            }
            System.out.println("Max Sum: " + ms);
        }
    }

    public static int trappedWater(int height[]) {
        // Calculate Left max Boundary
        int leftMax[] = new int[height.length];
        // Corner case
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // Calculate right max Boundary
        int rightMax[] = new int[height.length];
        // Corner case
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Loop
        int tw = 0;
        for (int i = 0; i < height.length; i++) {
            // Calculate Water Level
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            // Calculate Trapped Water
            tw += waterLevel - height[i];
        }

        return tw;
    }

    public static int buySellStocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // Case 1 - Profit
            if (buyPrice < arr[i]) {
                // Today's Profit
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Case 2
                buyPrice = arr[i]; 
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        buySellStocks(arr);

    }
}
