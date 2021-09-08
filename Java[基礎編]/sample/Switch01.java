public class Switch01 {
  public static void main(String[] args) {
    int val = 2;
    switch (val) {
    
    case 3:
      System.out.println("よくできました!");
      break; //処理されるとそれ以降は実行しない
    
    case 2:
      System.out.println("普通でした!");
      break;
    
    // default：全てのcaseの値に一致しない場合にブロックを実行
    default:
      System.out.println("頑張ろう!");
    }
  }
}

// if文の場合
    // int val = 2;
    // if (val == 3) {
    //     System.out.println("よくできました！");
    // } else if (val == 2) {
    //     System.out.println("ふつうでした！");
    // } else {
    //     System.out.println("がんばろう！");
    // }


