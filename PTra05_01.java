/*
 * PTra05_01.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra05_01 {
  public static void main(String[] args) {
    System.out.println("今日の運勢を占います。");

    // ランダムな数値をnumに代入します。範囲は 0 ~ 5 です。
    int num = new java.util.Random().nextInt(6);

    // TODO 以下の条件に沿ったプログラムを記述してください
    // ※ switch文を使用してプログラムを記述してください

    //    入力された数値によって以下のように出力してください。
    //    変数numの値が 0 の場合 -> あなたの運勢は「大吉」です
    //    変数numの値が 1 の場合 -> あなたの運勢は「吉」です
    //    変数numの値が 2 の場合 -> あなたの運勢は「中吉」です
    //    変数numの値が 3 の場合 -> あなたの運勢は「小吉」です
    //    変数numの値が 4 の場合 -> あなたの運勢は「末吉」です
    //    変数numの値が 5 の場合 -> あなたの運勢は「凶」です
    switch (num) {
      case (0):
        System.out.println("あなたの運勢は「大吉」です");
        break;
      case (1):
        System.out.println("あなたの運勢は「吉」です");
        break;
      case (2):
        System.out.println("あなたの運勢は「中吉」です");
        break;
      case (3):
        System.out.println("あなたの運勢は「小吉」です");
        break;
      case (4):
        System.out.println("あなたの運勢は「末吉」です");
        break;
      default:
        System.out.println("あなたの運勢は「凶」です");
        break;
    }

  }
}
