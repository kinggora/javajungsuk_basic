public class Practice4_9 {

  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;

    while(num > 0) {
      int n = num % 10; // 자릿수
      sum += n;
      num = num / 10;
    }
    System.out.println("sum=" + sum);
  }
}
