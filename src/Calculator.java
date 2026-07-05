public class Calculator {
    public static int add(int a, int b) {
        return a +
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("5 - 2 = " + subtract(5, 2));
        System.out.println("4 * 3 = " + multiply(4, 3));
        System.out.println("10 / 2 = " + divide(10, 2));
    }
}