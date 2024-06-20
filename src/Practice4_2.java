public class Practice4_2 {

  public static void main(String[] args) {
    Practice4_2 p4_2 = new Practice4_2();
    System.out.println(p4_2.sum(20)); // 1 5 7 11 13 17 19 => 73
  }

  // 1부터 n까지의 정수 중 2 또는 3의 배수가 아닌 수들의 총합을 구하는 메서드
  public int sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if(i % 2 != 0 && i % 3 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}
