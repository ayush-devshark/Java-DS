class PrintBinary{
  public static void main(String[] args) {
    int n = 3; // no. of bits
    printBinaryfn(n,"");
  }

  public static void printBinaryfn(int n, String prefix){
      if( n == 0){
        System.out.println(prefix);
      } else{
        printBinaryfn(n-1, prefix+"0");
        printBinaryfn(n-1, prefix+"1");
      } 
  }
} 