class diamondpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n - i; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <=2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i>= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for 
            (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle

        for (int i = 0; i < n; i++) {
            for (int j=0; j< n-i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the butterfly

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n - 1; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}