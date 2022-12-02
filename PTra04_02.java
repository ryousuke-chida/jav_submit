/*
 * PTra04_02.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra04_02 {
  public static void main(String[] args) {
    // TODO int型の変数numを宣言し、2を代入してください。
    int num = 2;

    // TODO numが1000を超えるまで繰り返しを行ってください。
    // 繰り返しの中でnumを2倍した数値をnumに代入してください。
    // ※ 繰り返しにはwhile文を用いてください
    while (num < 1000) {
      num = 2 * num;
      System.out.println(num);
    }
  }
}
