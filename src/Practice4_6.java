public class Practice4_6 {
  public static void main(String[] args) {
    Practice4_6 p4_6 = new Practice4_6();
    System.out.println(p4_6.resolve(6));
  }

  // 두 개의 주사위를 던졌을 때, 눈의 합이 n이 되는 모든 경우의 수 반환
  // 서로 다른 주사위라고 할 때
  public int resolve(int n) {
    if(n < 0 || n > 12) {
      return 0;
    }
    int cnt = 0;
    for(int i = 1; i <= 6; i++) {
      for(int j = 1; j <= 6; j++) {
        if(i + j == n) {
          System.out.println("i = " + i + ", j = " + j);
          cnt++;
        }
      }
    }
    return cnt;
  }
}
