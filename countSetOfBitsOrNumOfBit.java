public class countSetOfBitsOrNumOfBit {
      public static int hammingWeight(int n) {
         int count = 0;
        while (n != 0) {
        count++;
        n &= (n - 1);
    }
    return count;
  } 
  public static void main(String[] args) {
    int n =14;
    System.out.println(hammingWeight(n));
  }
}
