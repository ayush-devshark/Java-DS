class CountSort {
  public static void main(String[] args) {
    int []arr = {1,3,2,3,2,1,3};
    int count1 = 0;
    int count2 =0;
    int count3 =0;

   for(int x: arr){
      if(x == 1)count1++;
      if(x == 2) count2++;
      if(x == 3) count3++;
   }

   int k = 0;

   for(int i = 0; i< count1;i++){
     arr[k++] = 1;
   }
   for(int i = 0; i< count2;i++){
    arr[k++] = 2;
  }
  for(int i = 0; i< count3;i++){
    arr[k++] = 3;
  }

  for(int x: arr){
    System.out.println(x);
  }
  }
}