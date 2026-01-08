package Basics;

import java.util.Scanner;
// rev a number / check for palindrome.
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        int temp = number;

        int rev = 0;  //32
        while(temp != 0){
            rev = rev * 10 + (temp%10);
            temp/=10;
        }
        if(number == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome");
    }
}
