package Strings;

import java.util.HashMap;
import java.util.Map;

public class FreqOfEachCharacter {
    public static void main(String[] args) {
        Map<Character,Integer>mp = new HashMap<>();
        String str = "Hello, I am Amit";
        for (int i = 0; i<str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == ' ') continue;

            mp.put(ch,mp.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(mp);
    }
}
