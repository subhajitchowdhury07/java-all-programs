class Subha extends Thread{
    
    public void run(){
        
            try {
                for(int i =1;i<11;i=i+2)
                {
                    System.out.println("Subha"+i);
                Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                
                System.out.println("Exceptiono"+e);
            }
        }
        
    }
   

public class practice_thread {
    public static void main(String[] args)throws InterruptedException {
        Subha obj= new Subha();
        obj.start();
        
        for(int i=2;i<11;i=i+2){
            System.out.println("Alpha"+i);
            Thread.sleep(1000);
        }


    }
}
