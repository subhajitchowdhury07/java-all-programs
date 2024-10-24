// public class Recurssion2 {
//   public static void ReverseString(String str, int indx){
//     if( indx == 0){
//       System.out.print(str.charAt(indx));
//       return;
//     }

//     System.out.print(str.charAt(indx));
//     ReverseString(str, indx-1);
//   }
//   public static void main(){
//     String str = "abcd";
//     ReverseString(str, str.length()-1);
//   }
// }


public class Recurssion2 {
  public static int first =-1;
  public static int end =-1;
  public static void occerance(String str, int indx , char element) {
      if (indx == str.length()){
        System.out.println(first);
        System.out.println(end);
        return;
      }
      char currentChar = str.charAt(indx);
      if( currentChar== element){
        if(first == -1){
          first = indx;
        }else{
          end= indx;
        }
      }
      occerance(str, indx+1, element);

}

public static void main(){
  String str = "aabaacdaefaah";
  occerance(str, 0, 'a');
}
}