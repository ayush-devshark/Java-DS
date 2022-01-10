import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};
    int n = arr.length;
    quickSort(arr, 0, n-1);
    System.out.println(Arrays.toString(arr));
  }

public static void quickSort(int [] arr, int l, int h){
      if(l < h){
        int partitionIndex = partition(arr, l, h);
        quickSort(arr, l, partitionIndex-1);
        quickSort(arr, partitionIndex+1, h);
      }
}

  public static int partition( int [] arr, int l, int h){
    int pivot = arr[l];
    int i = l;
    int j = h;
    while(i<j){
      while( i<= h && arr[i] <= pivot){
          i++;
      }
      while( arr[j] > pivot){
        j--;
      }
      if( i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp; 
    return j; // A 'j' array has been partioned
  }

}
