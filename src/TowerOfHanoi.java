public class TowerOfHanoi {
  public static void main(String[] args) {
    char A = 'A';
    char B = 'B';
    char C = 'C';
    toh(3, A, B, C);
  }

  public static void toh(int n, char A, char B, char C ){
     // A = src
     // B = aux,
     // C = target
    if(n >0){
        toh(n-1, A, C, B);
        System.out.println("Move a disc from " + A +" "+ C );
        toh(n-1, B, A, C);
    }
  }
}
