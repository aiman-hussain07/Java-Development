package Part11_2DArrays;

import java.util.*;

class TwoDArray {
    // Search in 2D Array
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Found key at (" + i + " , " + j + ") index.");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void smallestin2DArr(int arr[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest in 2D Array is " + smallest);
    }

    public static void largestin2DArr(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest in 2D Array is " + largest);
    }

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        // i -> Row, j-> Column
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { /* What has been printed in top shall not be printed in bottom */
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { /* What has been printed in right shall not be printed in left */
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static int diagonalSum(int matrix[][]) { // O(n^2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Primary Diagonal
                if (i == j) { // Covers the overlapping issue
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) { // Secondary Diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum1(int matrix[][]) { // O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // PD
            sum += matrix[i][i];
            // To avoid adding overlapping element
            if (i != matrix.length - 1 - i) {
                // SD
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        // Starts from top right corner
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ") cell");
                return true;
            } else if (matrix[row][col] < key) {
                row = row + 1;
            } else {
                col = col - 1;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static boolean stairCaseSearch(int matrix[][], int key) {
        // Starts from bottom left corner
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ") cell");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        // System.out.println(diagonalSum1(matrix));
        System.out.println(stairCaseSearch(matrix, 25));
    }
}
