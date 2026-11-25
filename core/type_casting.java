public class type_casting {
    public static void main(String[] args) {
        // Implicit conversion
        // Byte to int
        // byte b = 45;
        // int i;
        // i = b;
        // System.out.println(i);

        // Character to int
        // char c = 'a';
        // i = c;
        // System.out.println(i);

        // Explicit conversion
        // byte b;
        // int i = 300;
        // b = (byte) i;
        // System.out.println(b);

        // Truncating Conversion
        // float f = 54.67f;
        // int i;
        // i = (int) f;
        // System.out.println(i);

        // Automatic type promotion
        byte b = 50;
        b = (byte) (b * 2);
        System.out.println(b);

    }
}
