package Strings;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if(s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[]arr = new int[26];

        for(int i = 0; i<s1.length(); i++)
        {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i)- 'a']--;
        }

        boolean isAnagram = true;
        for (int i = 0;i<s1.length(); i++)
        {
            if(arr[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) System.out.println("This is anagram");
        else System.out.println("Not anagram");


    }
}
