package Part10_Sorting;

import java.util.*;

class sorting {
    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        // For best case scenerios - to avoid unnecessary work - O(n)
        int swap = 0;
        // Turns
        for (int turn = 0; turn < (arr.length - 1); turn++) {
            for (int j = 0; j < (arr.length - 1 - turn); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("The array is already sorted");
                break;

            }
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Assumption - to be tested
            int minimum = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                // Picking the smallest
                if (arr[minimum] > arr[j]) {
                    minimum = j;
                }
            }
            // swap
            if (minimum != i) {
                // if assumption fails
                int temp = arr[minimum];
                arr[minimum] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; //temp
            int prev = i - 1;
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position OR Finding out the correct position to insert*/
            while (prev >= 0 && arr[prev] > key) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = key;
        }
    }

    // Counting Sort
    public static void countingSort(int arr[]) {
        // Locate the largest element in Array
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        // count Array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Editing original Array- sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 4, 5, 2, 1, 3 }; // arr[] is now an object of Integer class
        int array[] = { 4, 5, 2, 1, 3, 2, 4, 5, 10 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr, 1, 4, Collections.reverseOrder());
        countingSort(array);
        printArr(array);
    }
}