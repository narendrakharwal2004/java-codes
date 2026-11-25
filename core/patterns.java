public class patterns {
    public static void main(String[] args) {
        // Star Pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Number Triangle

        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Counting Triangle
        // int n = 5;
        // int cnt = 0;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(cnt + " ");
        // cnt++;
        // }

        // System.out.println();
        // }

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
