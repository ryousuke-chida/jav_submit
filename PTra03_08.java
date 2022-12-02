/*
 * PTra03_08.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_08 {

  public static void main(String[] args) {
    // TODO 現在の月を代入する (以下は12月の場合)
    int month = 5;

    System.out.print("季節は");
    if ((month == 1) || (month == 2) || (month == 12)) {
      System.out.println("冬");
    } else if ((month == 3) || (month == 4) || (month == 5)) {
      System.out.println("春");
    } else if ((month == 6) || (month == 7) || (month == 8)) {
      System.out.println("夏");
    } else if ((month == 9) || (month == 10) || (month == 11)) {
      System.out.println("秋");
    }

    // CHECK 上記は正しく動作しますが、「春」を出力するというSystem.out.println("春");は3回も記述されています。
    // 「春ではなくSpringと出力する」という修正を実施するとき3箇所修正する必要があります。これは保守性が低いということです。
    // TODO 上記を修正し、出力のコードが重複しないようにして下さい。なお、挙動は上記と同一になるようにすること。
  }
}
