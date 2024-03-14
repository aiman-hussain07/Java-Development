package Part10_Sorting;

class hw {
    public static void decBubbleSort(int arr[]) {
        int swap = 0;
        for (int turns = 0; turns < arr.length - 1; turns++) {
            for (int j = 0; j < arr.length - 1 - turns; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("Array is already sorted in descending order.");
            }
        }
    }

    public static void decSelectionSort(int arr[]) {
        for (int i = 0; i < (arr.length - 1); i++) {
            // Assumption - to be proved later
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] < arr[j]) {
                    // Picking largest
                    largest = j;
                }
            }
            // If in picking largest, assumption fails
            if (largest != i) {
                // swap
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
            }

        }
    }

    public static void decInsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void decCountingSort(int arr[]) {
        // find largest in array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        // create count array
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        int array[] = { 4, 5, 1, 3, 2 };
        // decBubbleSort(arr);
        // decSelectionSort(arr);
        // decSelectionSort(arr);
        decInsertionSort(array);
        printArr(array);
    }
}
