public class Practice4_5 {

  public static void main(String[] args) {
    Practice4_5 p4_5 = new Practice4_5();
    int n = 10;
    p4_5.printStarsUsingFor(n);
    p4_5.printStarsUsingWhile(n);
  }

  public void printStarsUsingFor(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void printStarsUsingWhile(int n) {
    int i = 0;
    while(i <= n) {
      int j = 0;
      while(j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
