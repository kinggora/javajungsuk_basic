public class Practice4_1 {
  public static void main(String[] args) {
    Practice4_1 p4_1 = new Practice4_1();
    // int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
    System.out.println("ex01");
    System.out.println(p4_1.ex01(15)); // true
    System.out.println(p4_1.ex01(10)); // false
    System.out.println(p4_1.ex01(20)); // false

    // char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
    System.out.println("ex02");
    System.out.println(p4_1.ex02(' ')); // false
    System.out.println(p4_1.ex02('\t')); // false
    System.out.println(p4_1.ex02('a')); // true

    // char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
    System.out.println("ex03");
    System.out.println(p4_1.ex03('x')); // true
    System.out.println(p4_1.ex03('X')); // true
    System.out.println(p4_1.ex03('a')); // false

    // char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
    System.out.println("ex04");
    System.out.println(p4_1.ex04('a')); // false
    System.out.println(p4_1.ex04('0')); // true
    System.out.println(p4_1.ex04((char)9)); // false

    // char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건
    System.out.println("ex05");


  }

  public boolean ex01(int x) {
    return x > 10 && x < 20;
  }

  public boolean ex02(char ch) {
    return ch != ' ' && ch != '\t';
  }

  public boolean ex03(char ch) {
    return ch == 'x' || ch == 'X';
  }

  public boolean ex04(char ch) {
    return ch >= '0' && ch <= '9';
  }

  public boolean ex05(char ch) {
    boolean isUpperCaseAlphabet = 'A' <= ch && ch <= 'Z';
    boolean isLowerCaseAlphabet = 'a' <= ch && ch <= 'z';
    return isUpperCaseAlphabet || isLowerCaseAlphabet;
  }

  public boolean ex06(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  public boolean ex07(boolean powerOn) {
    return !powerOn;
  }

  public boolean ex08(String str) {
    return "yes".equals(str);
  }
}
