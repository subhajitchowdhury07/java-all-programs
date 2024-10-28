




// public class recurssion4 {
//   public  static void moveAllChar (String str, int idx, int count , String newStr){
//     if(idx == str.length()){
      
//     for(int i=0; i<count; i++){
//       newStr += 'x';
//     }
//       System.out.println(newStr);
//       return;
//     }

//     char currChar = str.charAt(idx);
//     if(currChar == 'x'){
//       count++;
//       moveAllChar(str, idx+1, count, newStr);
//     }else{
//       newStr += currChar;
//       moveAllChar(str, idx+1, count, newStr);
//     }

//   }
//   public static void main(String[] args) {
//     String str ="axabxxcd";
//     moveAllChar(str, 0, 0, " ");
//   }

// }

// public class recurssion4 {
//   public static boolean[] arr = new boolean[26];
// public static void removeDuplicates(String str, int idx, String newStr){

//   if(idx == str.length()){
//     System.out.println(newStr);
//     return;
//   }
//   char currentChar = str.charAt(idx);
//   if(arr[currentChar - 'a']){
//     removeDuplicates(str, idx+1, newStr);
//   }else{
//     newStr += currentChar;
//     arr[currentChar - 'a'] = true;
//     removeDuplicates(str, idx+1, newStr);
//   }
// }

//   public static void main(String[] args) {
//     String str ="abbcdb";
//       removeDuplicates(str, 0, "");
//   }
// }

public class recurssion4 {
  public static void subsequence (String str, int idx , String newStr){
    if(idx == str.length()){
      System.err.println(newStr);
      return;
    }
    char currentChar = str.charAt(idx);
    // to be
    subsequence(str, idx+1, newStr+currentChar);

    // not to be

    subsequence(str, idx+1, newStr);
  }

  public static void main(String[] args) {
    String str ="abc";
      subsequence(str, 0, "");
  }
}