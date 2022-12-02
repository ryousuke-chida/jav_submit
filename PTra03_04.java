/*
 * PTra03_04.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_04 {
  public static void main(String[] args) {
    System.out.println("降水確率を入力してください。（数字のみ）");

    // キーボードから入力した数値を変数 num に代入します
    int num = new java.util.Scanner(System.in).nextInt();

    // TODO 以下の条件に沿ったプログラムを記述してください
    /*
     * 入力された数値によって以下のように出力してください。 変数numの値が 75以上 の場合 -> 雨が降る確率が高いです 変数numの値が 30～74 の場合 ->
     * 雨が降るかもしれないです 変数numの値が 30未満 の場合 -> 雨はまず降らないでしょう
     *
     * ※ 変数numの値が 0より小さい または 100より大きい場合は「不正な値が入力されました」と出力してください。
     */

    if (num < 0 || num > 100) {
      System.out.println("不正な値が入力されました");
    } else if (num >= 75) {
      System.out.println(" 雨が降る確率が高いです");
    } else if (num < 75 && num >= 30) {
      System.out.println("雨が降るかもしれないです");
    } else {
      System.out.println("雨はまず降らないでしょう");
    }
    // CHECK: 以下の値を入れてそれぞれの結果を予想し実際そのとおり実行されるか試して見てください
    // 0, -1, 1, 30, 29,75, 74, 99, 100, 101
  }
}
