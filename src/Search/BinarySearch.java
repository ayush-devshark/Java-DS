package Search;

public class BinarySearch{
  public static void main(String[] args) {
    int [] arr = {2,3,5,8,10,20,45};

    int target = 26;

    System.out.print(binarySearch(arr, target));
  }

  public static int binarySearch(int []arr, int target){
    int l = 0;
    int r = arr.length-1;
    
    while( l<= r){

      int mid = l + r-l/2;

      if( target == arr[mid]){
        return mid;
      } else if( target > arr[mid]){
            l = mid+1;
      } else{
        r = mid - 1;
      }
    }

    return -1;
  }
}