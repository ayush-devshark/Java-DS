public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};

    int n = arr.length;
    boolean flag;
    
    for( int i = 0;i<n-1;i++){
      flag = false;
        for( int j = 0; j< n-1-i;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
        }
        // If no swaps break;
        if(!flag) break;
      }

      for(int x: arr){
      System.out.print(x + " ");
      }
  }
}
