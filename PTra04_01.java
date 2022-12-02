/*
 * PTra04_01.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;

public class PTra04_01 {
  public static void main(String[] args) {
    // 乱数生成用の処理
    Random random = new Random();
    // 乱数を格納するための変数を初期化
    int randomNumber = 0;

    // 以下のwhile文は0~9のランダムな値をコンソールに出力する処理を無限に繰り返します。
    // TODO while文の条件を修正して5が出力されたら繰り返しを止めるようにしてください。
    while (randomNumber != 5) {
      // 0~9のランダムな値を生成
      randomNumber = random.nextInt(10);
      // 生成した値をコンソールに出力
      System.out.println(randomNumber);
    }
  }
}
