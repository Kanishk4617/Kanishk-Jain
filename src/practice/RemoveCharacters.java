package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveCharacters {

    public static int noOfChar = 256;

    public static int[] getCharCountArray(String str) {
        int[] count = new int[noOfChar];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        return count;
    }

    public static String removeCharactersPresentInAnotherString(String str, String str2) {

        int[] count = getCharCountArray(str2);
        char[] a = str.toCharArray();
        int f = 0, r = 0;
        while (f != a.length) {
            char temp = a[f];
            if (count[temp] == 0) {
                a[r] = a[f];
                r++;
            }
            f++;
        }
        str = new String(a);
        return str.substring(0, r);
    }

    public static void main(String args[]) {
        String str1 = "kanishk";
        String str2 = "jain";
//        System.out.println(removeCharactersPresentInAnotherString(str1, str2));
//        System.out.println(countWords());
//        System.out.println(getSortedString());
        String a = removeCharacterFromString();
        System.out.println(a);
    }

    private static String removeCharacterFromString() {
        String a = "kanishk jain";
        String str = a.replace("a", "");
        return str;
    }

    //count number of words in a string
    public static int countWords() {
        String str = "The times of India";
        String[] a = str.split(" ");
        int c = 0;
        for (String w : a) {
            c++;
        }
        return c;
    }

    public static String getSortedString() {
        String s = "The Times Of India";
        List<Character> v = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                v.add(s.charAt(i));
        }
        Collections.sort(v);
        int i = 0;
        String str = "";
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z') {
                str = str + v.get(i);
                ++i;
            } else
                str = str + s.charAt(k);

        }
        return str;
    }

}
