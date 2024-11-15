public class quicksort {
  public static int privot(int arr[], int low, int high){
    int privot = arr[high];
    int i =low-1;
    for(int j=low; j<high; j++){
      if(arr[j]< privot){
        i++;
        //swap
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = privot;
    arr[high] = temp;
    return i;
  }

  public static void quickSort(int arr[], int low, int high){
    if(low < high){
      int pidx = privot(arr ,low, high);

      quickSort(arr, low, pidx-1);
      quickSort(arr, pidx+1, high);
    }
  }
  public static void main(String[] args) {
    int arr[] = {5,3,6,7,1,4,2};
    int n = arr.length;

    quickSort(arr, 0, n-1);

    for(int i=0 ;i<n; i++){
      System.out.print(arr[i]+ " ");

    }
    System.out.println();
  }
}
