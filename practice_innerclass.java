 class practice_innerclass {
    
     static class inner{
        int x;
        int a;
        inner(){
            a=50;
        }
        void display(){
            System.out.println("a = "+a);
            x=5;
        }
        
        
    }
   
    

    public static void main(String[] args) {
        inner m =new inner();
        m.display();
        practice_innerclass inn=new practice_innerclass();
      
        

    }
    
}
