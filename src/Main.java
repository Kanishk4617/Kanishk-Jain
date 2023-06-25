import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Kanishk Jain");
//        System.out.println(reverseStringByWord("Kanishk Jain"));
//        countOccurance("kanishkJain");
//        System.out.println(findMaxOccuring("kanishkJain"));
//        String str = "kanishk";
//        int n = str.length();
//        char[] a = str.toCharArray();
////        System.out.println(removeduplicates(a, n));
//        removeduplicate(a,n);
        String str1="Hello";
        String str2="World";
        str1.concat(str2);
        System.out.println(str1);

    }

    public static String stringReversal(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            r = str.charAt(i) + r;
        }
        return r;
    }

    public static String reverseStringByWord(String str) {
        String r = "";
        String[] a = str.split(" ");
        for (String w : a) {
            r = r + stringReversal(w) + " ";
//            r = w + " " + r;
        }
        return r;
    }

    public static void countOccurance(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (mp.containsKey(str.charAt(i))) {
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
            } else {
                mp.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> m : mp.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }

    static final int ASCII_SIZE = 256;

    public static char findMaxOccuring(String str) {
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
//            System.out.println(count[str.charAt(i)]);
        }
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    // O(n*n)
    public static String removeduplicates(char[] str, int n) {
        int result = 0;
        for(int i=0; i<str.length; i++) {
            int j;
            for(j = 0; j< i; j++) {
                if (str[j]== str[i])
                    break;
            }
            if(i==j) {
                str[result++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str,result));
    }

    // O(n)
    public static void removeduplicate(char[] a, int n) {

        HashSet<Character> c = new HashSet<>(n-1);
        for (char i : a) {
            c.add(i);
        }
        for (char i : c) {
            System.out.println(i);
        }
    }
}