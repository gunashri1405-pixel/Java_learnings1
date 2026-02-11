import java.util.Scanner;

class Example1 {
    void hello() {
        System.out.println("Hello");
    }
    void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.add(10,20);

    }
}

class Example2 {
    int getNumber() {
        return 10;

    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        int result = obj.getNumber();
        System.out.println(result);
    }
}
