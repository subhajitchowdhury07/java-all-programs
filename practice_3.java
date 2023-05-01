public class practice_3 {
    public static void main(String[] args) {
    try {
        int a=args.length;
        System.out.println(a);
        // int b=42/a;         //check the bound 
        int c[]={1};
        c[42]=99;
    } catch (ArithmeticException e) {
       System.out.println("divide by zero\n"+e);
    }
    catch(ArrayIndexOutOfBoundsException o){
        System.out.println("array index problem \n"+o);

    }
    }
    
}
