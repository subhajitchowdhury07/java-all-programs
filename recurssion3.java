public class recurssion3 {
public static void checkSort(int arr[],int idx ){
  // int start =0;
  // int end = arr.length-1;

  if (idx == arr.length) {
    System.out.println("true");
    return;
  }

  if(arr[idx-1] >= arr[idx]){
    System.out.println("false");
    return;
  }
  checkSort(arr, idx+1);
}

  public static void main(String[] args) {
    int arr[]= {1,2,3,4,4,5};
    checkSort(arr, 1);
  }
  
}
