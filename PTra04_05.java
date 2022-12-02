/*
 * PTra04_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;
import java.util.Scanner;

public class PTra04_05 {
  public static void main(String[] args) {
    // 以下はじゃんけんを行うプログラムです。
    // TODO TODOコメントの指示に従ってプログラムを完成させてください。

    // 入力を要求するためのもの
    Scanner scanner = new Scanner(System.in);
    // 乱数生成処理
    Random random = new Random();

    // TODO 以下の定数を使って条件を書くこと。0,1,2等、マジックナンバーは書かない。
    final int GUU = 0;
    final int CHOKI = 1;
    final int PAA = 2;
    // 勝敗の状態を覚えておくための変数(初期値は負けとする)
    boolean winFlag = false;
    // プレイヤーが勝つまでじゃんけんを繰り返す。
    while (!winFlag) {
      // プレイヤーに出す手を選ばせる
      // ※ 数値でない入力は考慮していません(エラーになります)
      System.out.println("じゃんけんを行います。");
      System.out.println("あなたの出す手を入力してください");
      System.out.println("0:グー, 1:チョキ, 2:パー");
      int playerHand = Integer.parseInt(scanner.nextLine());

      // TODO 入力された手を出力してください(0なら"あなたはグーを出しました"等)
      // なお、0〜2以外の文字が入力された場合は、「入力に誤りがあります」と表示し、以降の繰り返し処理を飛ばし次のループを実行して下さい。
      // ※ 「入力に誤りがあります」が表示されたら次に「じゃんけんを行います。」が表示される
      if (playerHand == GUU) {
        System.out.println(" あなたはグーを出しました");
      } else if (playerHand == CHOKI) {
        System.out.println("あなたはチョキを出しました");
      } else if (playerHand == PAA) {
        System.out.println("あなたはパーを出しました");
      } else {
        System.out.println("入力に誤りがあります");
        break;
      }

      // 対戦相手の手をランダムに選択する。
      int npcHand = random.nextInt(3);
      // TODO 対戦相手の手を出力してください(0なら"相手はグーを出しました"等)
      if (npcHand == GUU) {
        System.out.println("相手はグーを出しました");
      } else if (npcHand == CHOKI) {
        System.out.println("相手はチョキを出しました");
      } else if (npcHand == PAA) {
        System.out.println("相手はパーを出しました");
      }

      // TODO じゃんけんの結果を出力し,プレイヤーが勝った場合はプログラムが終了するようにしてください。
      // 例 あなたが勝った場合→ あなたの勝ちです！、あなたが負けた場合 → 対戦相手の勝ちです、あいこの場合 → あいこです


        if (((playerHand == GUU) && (npcHand == PAA))
            || ((playerHand == CHOKI) && (npcHand == GUU))
            || ((playerHand == PAA) && (npcHand == CHOKI))) {
          System.out.println("対戦相手の勝ちです");
        } else if ((playerHand == npcHand)) {
          System.out.println("あいこです");
        } else if (((playerHand == GUU) && (npcHand == CHOKI))
            || ((playerHand == CHOKI) && (npcHand == PAA))
            || ((playerHand == PAA) && (npcHand == GUU))) {
          System.out.println("あなたの勝ちです！");
          break;
        }

      // 次のじゃんけんの前に改行しておく
      System.out.println();
    }
  }
}
