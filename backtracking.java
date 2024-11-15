public class backtracking {
  public static void printPerm(String str, int idx, String perm){
    if(str.length() == 0){
      System.out.println(perm);
      return;
    }

    for(int i= 0; i<str.length(); i++){
      char currentChar = str.charAt(i);
      String newString = str.substring(0, i) + str.substring(i+1);
      printPerm(newString, idx+1, perm+currentChar);

    }
  }


  public static void main(String[] args) {
    String str = "ABC";
    printPerm(str, 0, "");
  }
}
