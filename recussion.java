public class recussion{
  public static void towerOfHonio(int n ,String src, String helper, String dist){

    if(n == 1){
      System.out.println("transfer disk "+ n +" from " + src + " to "+ dist);
      return;
    }
    towerOfHonio(n-1, src, dist, helper);
    System.out.println( "transfer disk "+ n +" from " + src + " to "+ dist );
    towerOfHonio(n-1, helper,src, dist);

  }

  public static void main(String args[]){
    int n=5;
    towerOfHonio(n, "S", "H", "D");
  }
}