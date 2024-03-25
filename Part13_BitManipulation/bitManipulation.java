package Part13_BitManipulation;

public class bitManipulation {

    public static String isOddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }

    public static int getithBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateithBit(int n, int i, int updateBit) {
        // if (updateBit == 0) {
        // return clearithBit(n, i);
        // } else {
        // return setithBit(n, i);
        // }

        // Alternate Way
        n = clearithBit(n, i);
        int bitMask = updateBit << i;
        return n | bitMask;
    }

    public static int clearLastithBit(int n, int i) {
        int bitMask = -1 << i; // (~0)<<i
        return n & bitMask;
    }

    public static int clearRangeofBits(int n, int i, int j) {
        int i_new = (1 << i) - 1;
        int j_new = -1 << (j + 1);
        int bitMask = i_new | j_new;
        return n & bitMask;
    }

    public static boolean isPowerof2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            // Check LSB
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int fastModuloExponentiation(int a, int n, int m) {
        int ans = 1;
        while (n > 0) {
            // Check LSB
            if ((n & 1) != 0) {
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponentiation(5, 5));
    }

}