class Rectanglepattern {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++){
            for (int j = 1; j <=5; j++) {
                System.out.print("* ");

            }
            System.out.println();
           
        }
           
    }
}
class HollowSquare {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}