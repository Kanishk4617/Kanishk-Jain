package practice;

public class ReplaceString {

    public static void main(String[] args) {
        String str = "Gaurav rai is a rich boy but he is notrai";
        char[] c = str.toCharArray();
        int n = str.length() - "rai".length();
//        if(str.contains("rai")) {
//           str =  str.replace("rai","tata");
//            System.out.println(str);
        for (int i = 0; i <= n; i++) {
            if (c[i] == 'r' && c[i + 1] == 'a' && c[i + 2] == 'i') {
                c[i] = 't';
                c[i + 1] = 'a';
                c[i + 2] = 't';
            }
        }
        str = new String(c);
        System.out.println(str);
    }


}
