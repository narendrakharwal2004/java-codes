public class recursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int fibb(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibb(n - 2) + fibb(n - 1);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Factorial of the No is " + factorial(n));
        System.out.println("Fibonaci of the No is " + fibb(n));

    }
}
