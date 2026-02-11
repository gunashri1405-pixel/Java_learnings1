class JaggedArrayExample {
    public static void main(String[] args) {
        int n = 5;
        // Create a jagged array
        int[][] staircase = new int[3][];

        for (int i =0; i < n; i++) {
            staircase[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                staircase[i][j] = j + 1;
            }
        }

        System.out.println("Staircase Pattern:");
        for (int i = 0; i < staircase.length; i++) {
            for (int j = 0; j < staircase[i].length; j++) {
                System.out.print(staircase[i][j] + " ");
            }
            System.out.println();
        }
    }
}