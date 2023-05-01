//useing This key word

public class practice_2 {
    int x=10000;
   void display(){
    System.out.println(x);
   }
    practice_2(){
        this.display();
        System.out.println("learn coding");
    }
    
    practice_2(int a){
        this();
        System.out.println(a);
        
    }
   
    
    public static void main(String[] args) {
        practice_2 r =new practice_2(232);

        
        // r.display();
        
        
    }

    
}
