package Basics;

// febo series till n.
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        //0 1 1 2 3 5 8 13
        int n = 10;


        for(int i =0; i<n; i++){
            System.out.println(first+ " ");
            int next = first+second;
            first = second;
            second = next;
        }

    }
}
