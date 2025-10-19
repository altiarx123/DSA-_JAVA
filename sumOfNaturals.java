import java.util.*;
public class sumOfNaturals {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number till you want the sum : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
