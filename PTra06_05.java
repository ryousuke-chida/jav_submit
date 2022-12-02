/*
 * PTra06_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;

public class PTra06_05 {
  public static void main(String[] args) {
    // 乱数生成
    Random random = new Random();
    // 乱数を格納するための変数を初期化
    int randomNumber = 0;

    // 以下のfor文は0~2のランダムな値を10回出力します。
    // TODO 値が2の場合は出力しないようにしてください。
    // ※ continueを用いてください。
    for (int i = 0; i < 10; i++) {
      randomNumber = random.nextInt(3);

      if (randomNumber == 2) {
        continue;
      }

      System.out.println(randomNumber);
    }
  }
}
