public class casting_conversion {
    public static void main(String[] args) {
        byte b=(byte)128;
        System.out.println(b);

        char c=25;
        System.out.println(c);

        short s=(short)32768;
        System.out.println(s);
        
        byte a=50;
        b=(byte) (a*2);
        System.out.println(b);
    }
}
// Rules for the type promotion
// all the byte ,short, and char values are promoted to integer
