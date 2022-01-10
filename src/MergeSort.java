import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};
    int n = arr.length;
    int [] temp = new int [n];
    mergeSort(arr, temp,0, n-1);
    System.out.println(Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr,int[] temp, int l, int h){
    if( l < h){
      int mid = (l+h)/2;
      mergeSort(arr, temp,l, mid);
      mergeSort(arr, temp, mid+1, h);
      merge(arr, temp, l, mid, h);
    }
  }

  public static void merge(int [] arr, int[] temp , int l, int mid, int h){ 
    
    int i  = l; // first array start
    int j = mid+1; // second array start
    int k = l; // new array start index

    while( i <= mid && j <= h){
      if(arr[i] < arr[j]){
        temp[k++] = arr[i++];
      }else{
        temp[k++] = arr[j++];
      }
    }

    while( i <= mid){
      temp[k++] = arr[i++];
    }

    while( j <= h){
      temp[k++] = arr[j++];
    }

    for(int p = l; p<= h; p++){
      arr[p] = temp[p];
    }
  }

}
