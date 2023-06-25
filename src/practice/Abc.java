package practice;

import java.util.Arrays;

public class Abc extends RemoveCharacters {
    public static void main(String args[]) {
//        noOfChar = 99;
//        String str = "kaanishk";
//        char[] a = str.toCharArray();
//        int k = 0;
//        for (int i = 0; i < a.length; i++) {
//            int j;
//            for (j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    break;
//                }
//            }
//            if (i == j) {
//                a[k++] = a[i];
//            }
//
//        }
//        for(int i = 0; i< k; i++){
//            System.out.println(a[i]);
//
//        }
//        str = new String(a);
//        System.out.println(str.substring(0,k));
//        System.out.println(Arrays.copyOf(a, k));


//        findDifferentCharacter("Yxyz", "xywz");

        // How to check if two strings are rotations of each other?
//        boolean b = checkRotation();
//        if (b)
//            System.out.println("Rotation");
//        else
//            System.out.println("no rotation");
        splitMethod();
    }

    private static Boolean checkRotation() {
        String a = "XYZ";
        String b = "ZYX";
        int n = a.length();
        int m = b.length();
        int p=0;
        if (n != m)
            return false;
        else
        {
            int j = n-1;
            for(int i = 0; i<n; i++) {
                if(a.charAt(i) == b.charAt(j))
                {
                    p=1;
                }
                j--;
                if(p==0)
                {
                   return false;
                }
            }
            return true;
        }
    }

    // xyz
    //xyzw
    public static void findDifferentCharacter(String a, String b) {
        int n = a.length();
        int m = b.length();
        int k = 0;
        char c = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                k = 1;
            }
            if (k == 1) {
                c = a.charAt(i);
                break;
            }
        }
        System.out.println("Different Character = " + c);
    }

    public static void splitMethod() {
        String str = "kanishk jain";
        String[] a = str.split(" ");
        System.out.println(a[1]);
    }

}
