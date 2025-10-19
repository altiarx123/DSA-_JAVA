import java.util.*;

public class multiplictionTable {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Number to generate Table: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
