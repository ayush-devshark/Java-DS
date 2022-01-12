public class CountInversion {
  public static void main(String[] args) {
    int [] arr = {3,1,2};
    int n =arr.length;
    int count = 0;

    // brute force
    for(int i = 0;i<n;i++){
      for(int j = i+1;j<n;j++){
          if(arr[i] > arr[j]){
            count++;
          }
      }
    }


    // optmised code using merge sort
    System.out.println(count);
  }
}
