public class InsertionSort {
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};
    int n = arr.length;

    for(int i = 1;i<n;i++){
      int j = i-1; // el to which we compare
      int x = arr[i]; // el to be inserted
      while( j > -1 && arr[j] > x){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = x;
    }

    for(int x: arr){
      System.out.print(x + " ");
      }
  }
}
