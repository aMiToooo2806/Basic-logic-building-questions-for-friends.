package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "Hello world";
        //input.trim(): Removes spaces from the start and end of the original string so they don't confuse the split logic.
        //split("\\s+"):
        //split(" ") works if there is exactly one space.
         //split("\\s+") is safer. It means "split by one or more spaces." If your input is "Hello World", this ensures you don't get empty strings in your array.
        String[] words = s1.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--)
        {
           sb.append(words[i]);

           if(i>0)
               sb.append(" ");
        }
        System.out.println("Og string "+s1);
        System.out.println("Reversed string "+sb);
    }
}
