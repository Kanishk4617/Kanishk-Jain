package practice;

import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static void main(String args[]) {
        String str2 = "listen";
        String str1 = "silent";
        checkAnagram(str1, str2);
    }

    private static void checkAnagram(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        char[] a, b;
        a = str1.toCharArray();
        b = str2.toCharArray();
        if(n!=m) {
            System.out.println("Not a anagram");
        }
        else {
            Arrays.sort(a);
            Arrays.sort(b);
            String s = String.valueOf(a);
            String t = String.valueOf(b);
            if(s.equals(t))
                System.out.println("yes, its a anagram");
            else
                System.out.println("no, its not a anagram");
        }
    }

    public static List<List<String>> returnAnagramList(List<String> str1, List<String> str2) {

        return null;
    }
}
