package COLLEGE;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Executing statement 1");
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Executing statement 2"); // This will not be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}

