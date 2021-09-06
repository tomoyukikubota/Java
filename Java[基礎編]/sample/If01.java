package sample;

public class If01 {
  public static void main(String[] args) {
    int number = 7;
    
    // falseの場合処理が実行されない
    if (number < 5){
      System.out.println(number + "は5未満です");
    }
    
    if (number < 10) {
      System.out.println(number + "は10未満です");
    }
    
    if (number < 15) {
      System.out.println(number + " は15未満です");
    }
  }
}

