import java.util.*;

public class checkEvenOddBoolean {
    public static boolean checkEven(int n){
        int m = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(n%2==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for even and odd : ");
        int n = sc.nextInt();
        System.out.println("the Output is "+checkEven(n));
    }
}
