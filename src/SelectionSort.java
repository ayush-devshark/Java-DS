class SelectionSort{
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};
    int n = arr.length;
  
    for(int i = 0;i < n-1;i++){
      int minIndex = i;
      for( int j = i+1; j<n;j++){
        if( arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }

    for(int x: arr){
      System.out.print(x + " ");
      }
  }
}