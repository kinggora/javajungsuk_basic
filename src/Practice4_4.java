public class Practice4_4 {

  public static void main(String[] args) {
    Practice4_4 p4_4 = new Practice4_4();
    System.out.println(p4_4.resolve(100));
  }

  // 홀수: +
  // 짝수: -
  public int resolve(int n) {
    int sum = 0;
    int temp = 0;
    int cnt = 1;
    while(sum < n) {
      if(cnt % 2 == 0) {
        temp = (-1) * cnt;
      } else {
        temp = cnt;
      }
      sum += temp;
      cnt++;
    }
    return temp;
  }
}
