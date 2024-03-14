package Part9_Arrays;

class hw {
    // Q1
    public static boolean findValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Q2
    public static int search(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Identify the sorted half
            // for left sorted
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    // Eliminate the second(/right) half
                    high = mid - 1;
                } else {
                    // Eliminate the first(/left) half
                    low = mid + 1;
                }
                // for right sorted
            } else if (arr[mid] <= arr[high]) {
                if (arr[mid] <= target && target <= arr[high]) {
                    // Eliminate first(/left) half
                    low = mid + 1;
                } else {
                    // Eliminate second(/right) half
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // Q3
    // public static int stock(int arr[]){

    // }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 1));

    }
}