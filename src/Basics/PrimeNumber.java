package Basics;

import java.util.Scanner;

// check for prime number / print prime no till n.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        for (int i = 2; i<num; i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }


    }
    public static boolean isPrime(int num)
    {
        boolean flag = true;
        for (int i = 2; i<num; i++)
        {
            if(num%i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
