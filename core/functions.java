public class functions {
    public static void main(String[] args) {
        greet();
        greet("Ashok");
        System.out.println(getno());
        System.out.println(multiply(4, 5));

    }

    // NO Ip, NO Op
    static void greet() {
        System.out.println("Hello My Friends");
    }

    // Ip ,NO op
    // In this number of parameters can be anything
    static void greet(String Name) {
        System.out.println("Hello My Friend : " + Name);
    }

    // NO ip, Op
    static int getno() {
        return 45;
    }

    // Ip ,Op
    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }
}
