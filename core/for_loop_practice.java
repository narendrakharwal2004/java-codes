public class for_loop_practice {
    public static void main(String[] args) {
        // Prime No check
        // int n = 13;
        // boolean prime = true;
        // if (n <= 1)
        // prime = false;
        // else {
        // for (int i = 2; i < n * n; i++) {
        // if (n % i == 0) {
        // prime = false;
        // break;
        // }
        // }
        // }
        // if (prime) {
        // System.out.println("Prime found");
        // } else {
        // System.out.println("Prime not found");
        // }

        // Factorial
        // int n = 5;
        // int fact = 1;
        // if (n == 0)
        // fact = 1;
        // else {
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // }
        // System.out.print(fact);

        // Palindrome
        // int sum = 0;
        // int p = 110;
        // int n = p;

        // while (n > 0) {
        // int digit = n % 10;
        // sum = sum * 10 + digit;
        // n = n / 10;
        // }
        // if (sum == p)
        // System.out.println("No is Palindrome");
        // else
        // System.out.println("No is not Palindrome");

        // Armstrong

        int n = 153;
        int sum = 0;
        int p = n;
        String num = String.valueOf(n);
        int len = num.length();
        while (p > 0) {
            int digit = p % 10;
            sum += Math.pow(digit, len);
            p = p / 10;
        }
        if (n == sum) {
            System.out.println("NO is Armstrong");
        } else {
            System.out.println("NO is not Armstrong");
        }
    }
}
