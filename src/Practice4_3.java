public class Practice4_3 {
  public static void main(String[] args) {
    Practice4_3 p4_3 = new Practice4_3();
    int n = 10;
    System.out.println(p4_3.totalSum(n)); // 220
  }

  public int totalSum(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        sum += j;
      }
    }
    return sum;
  }
}
