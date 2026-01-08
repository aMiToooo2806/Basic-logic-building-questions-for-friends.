package Basics;

public class LargestOfThreeNo {
    public static void main(String[] args) {
        int a = 50;
        int b = 29;
        int c = 38;

//        if(a>b && a>c)
//            System.out.println(a+" is greater");
//        else if (b>a && b>c)
//            System.out.println(b+" is greater");
//        else
//            System.out.println(c+ " is greater");
        String s = (a>b && a>c)?" a is greater":(b>a && b>c)?" b is greater":" c is greater";
        System.out.println(s);
    }
}
