public class Main {
    public static void main(String[] args) {
        // swap two numbers without using third variable
        int a = 10;
        int b = 30;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}