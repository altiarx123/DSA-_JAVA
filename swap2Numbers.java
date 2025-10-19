import java.util.Scanner;

public class swap2Numbers {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("the value of a is "+a+" and the value of b is "+b);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        swap(a, b);
    }
}
