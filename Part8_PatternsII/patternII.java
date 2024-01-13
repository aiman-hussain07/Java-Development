package Part8_PatternsII;

class patternII {
    public static void printHollowRectangle(int row, int column) {
        // Outer Loop - Rows
        for (int i = 1; i <= row; i++) {
            // Inner Loop - Columns
            for (int j = 1; j <= column; j++) {
                // Cell - (i,j)
                if (i == 1 || i == row || j == 1 || j == column) {
                    // Boundary Cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramid(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidwNumbers(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Numbers
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            // Spaces
            for (int k = 1; k <= (i - 1); k++) { // Can altogether avoid spaces black and the code will remain same
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        // First Half
        for (int i = 1; i <= n; i++) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for (int i = n; i >= 1; i--) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars (Hollow Rectangle)
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n) {
        // First Half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Second Half
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // printHollowRectangle(5, 8);
        // invertedRotatedHalfPyramid(10);
        // invertedHalfPyramidwNumbers(10);
        // floydTriangle(3);
        // zeroOneTriangle(6);
        // butterflyPattern(3);
        // solidRhombus(6);
        // hollowRhombus(6);
        diamond(4);

    }
}