package 確認問題;

public class Chapter08 {
  public static void main(String[] args) {
    int number = 1;
    while (number < 5) {
      System.out.println(number * number);
      number++;
    }
    
    int array[] = { 2, 5, 9, 12 };
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    for (int val : array) {
      if (val % 2 == 0) {
        continue;
      }
      System.out.println(val);
    }
  }
}
