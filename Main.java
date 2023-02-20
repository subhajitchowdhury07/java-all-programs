import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n =sc.nextInt();
        System.out.println("Enter the second number =");
        int m= sc.nextInt();
        if(n>m){
            System.out.print("greater no is "+n);

        }
        else {
            System.out.println("greater number is "+m);
        }
    }
}