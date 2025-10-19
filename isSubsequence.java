public class isSubsequence {
    public static Boolean isSubsequence1(String str,String str2){
        int a = 0;
        for(int i=0;i<str.length();i++) {

            if (str2.charAt(a) == str.charAt(i)) {
                a++;
            }
            if (a == str2.length()) {
                return true;
            }
        }
        return false;
        }
    public static void main(String []args){
        String str= "abcdef";
        String str2 = "bdf";
        Boolean subsequence1 = isSubsequence1(str, str2);
        System.out.println(subsequence1);
    }
}
