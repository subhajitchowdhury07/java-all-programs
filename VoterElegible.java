import java.util.*;
public class VoterElegible {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age to check wether you elegible or not for voter card = ");
        int n = sc.nextInt();
        if (n<0 || n>100){
            System.out.println("Invalid");
        }

        else if (n > 18) {

            System.out.println("elegible");
        }
        else{
            System.out.println("Not elegible");

        }

    }
}
