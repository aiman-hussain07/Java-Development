package Part13_BitManipulation;

class hw {

    // Q1
    public static int xorSameNumber(int n) {
        return (n ^ n); // always 0
    }

    // Q2
    public static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + ", " + y);
    }

    // Q3
    public static int addOne(int n) {
        return (-(~n));
    }

    // Q4
    public static void upperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | 32) + " ");
        }
    }

    public static void main(String[] args) {
        // swap(2, 3);
        // System.out.println(addOne(500000000));
        upperToLower();
    }
}