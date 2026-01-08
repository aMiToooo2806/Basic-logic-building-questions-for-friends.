package Strings;

// Reverse string and check for palindrome. just compare reversed string and og string
public class ReverseString {
    public static void main(String[] args) {
        String str = "Amit";

        for (int i = str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i)+" ");
        }

    }
}
