// public class recurssion5 {
//   public static void param(String str, String permutation){
//     if(str.length()==0){
//       System.out.println(permutation);
//       return;
//     }
//     for(int i=0;i<str.length(); i++){
//       char currChar = str.charAt(i);
//       String newstr = str.substring(0,i) + str.substring(i+1);
//       param(newstr, permutation+currChar);
//     }

//   }
//   public static void main(String[] args) {
//     String str = "abc";
//     param(str, "");
// }}

// public class recurssion5{
//   public static int countPath(int i, int j, int n, int m){
//     if(i==n || j == m){
//       return 0;
//     }
//     if(i == n-1 && j == m-1){
//       return 1;
//     }

//     //downpath
//     int downpath = countPath(i+1, j, n, m);
//     //rightpath
//     int rightpath = countPath(i, j+1, n, m);

//     return downpath + rightpath;
//   }

//   public static void main(String[] args) {
//     int n =3;
//     int m=3;

//     int totalpath =countPath(0, 0, n, m);

//     System.out.println(totalpath);
//   }
// }

// public class recurssion5{
//   public static int placeTiles(int n,int m){

//     if(n == m){
//       return 2;
//     }
//     if(n< m){
//       return 1;
//     }

//     //vertically
//     int verti = placeTiles(n-m, m);
//     //Horizontally
//     int hori = placeTiles(n-1, m);

//     return verti+hori;
//   }

//   public static void main(String[] args) {
//     int n=7; int m =2;
//     System.out.println(placeTiles(n, m));
//   }
// }

public class recurssion5{
  public static int callGuess(int n){

    if(n <= 1){
      return 1;
    }
    //single

    int ways1 = callGuess(n-1);

    //pair

    int ways2 = (n-1) * callGuess(n-2);

    return ways1+ways2;
  }

  public static void main(String[] args) {
    int n= 4;
    System.out.println(callGuess(n));
  }
}