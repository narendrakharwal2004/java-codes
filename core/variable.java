public class variable {
    public static void main(String[] args) {
        // Integers int short long byte

        // byte b = 3;
        // byte b = 0b11; //binary representation
        // byte b = 06; // octal representation
        byte b = 0X6; // hexadecimal representation

        short s = 50;
        int i = 399999;
        long l = 20049859;
        System.out.println("Values are-->" + b + " " + s + " " + i + " " + l);

        // Real No float double

        float f = 458.66f;
        // double d = 554.8; //Standard way
        double d = 6.022e23; // 6.022*10^23; Scientific way

        System.out.println("Values are-->" + f + " " + " " + d);

        // Characters

        char c = 'N';
        System.out.println("Character is " + c);

        // boolean
        Boolean bool = false;
        System.out.println("Boolean value " + bool);

        // Swap of two no

        int a = 56;
        int g = 90;
        System.out.println("Before Swap-->" + "a:" + a + " " + "g:" + g);
        int temp = a;
        a = g;
        g = temp;
        System.out.println("After Swap-->" + "a:" + a + " " + "g:" + g);

    }
}
