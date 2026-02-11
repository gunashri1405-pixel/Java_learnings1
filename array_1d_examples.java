import java.util.Scanner;
class Array1DExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[2]);
        System.out.println("Third element: " + numbers[4]);
        }
    }


    class Array1DPrint {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println("Elements of the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

class Array1DEnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
class PositiveNegativeZero {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 0, 20, -15};

        System.out.println("Elements of the array:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
    }
}

class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
class VowelConsonant {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'E', 'I', 'O', 'U'};

        System.out.println("Elements of the array:");
        for (char letter : letters) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
    }
}
class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
class GradeCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scn.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}


