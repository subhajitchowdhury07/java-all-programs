public class mergeSort {
  public static void conqure(int arr[], int si, int mid, int ei){
    int marged[] = new int[ei - si +1];
    // nlogn
    int idx1= si;
    int idx2 = mid+1;
    int x=0;

    while(idx1 <=mid && idx2 <= ei ){
      if(arr[idx1]<= arr[idx2]){
        marged[x++] = arr[idx1++]; // same as the below
        // x++; idx1++;
      }else{
        marged[x++] = arr[idx2++];
      }
    }

    while(idx1 <= mid){
      marged[x++] = arr[idx1++];
    }
    while(idx2 <= ei){
      marged[x++] = arr[idx2++];
    }

    for(int i=0, j=si; i< marged.length; i++, j++){  // all the ele from marged array return store in arr
      arr[j] = marged[i];
    }

  }
  public static void devide(int arr[], int si, int ei){
    if(si >= ei){
      return;
    }

    int mid = si+ (ei-si)/2;
    devide(arr, si, mid);
    devide(arr, mid+1, ei);
    conqure(arr, si, mid, ei);

  }
  public static void main(String[] args) {
    int arr[] ={2,6,3,7,1,8,5,4};
    int n = arr.length;

    devide(arr, 0, n-1);

    for(int i=0; i<n ;i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }
}
