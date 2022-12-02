import java.util.Random;
import java.util.Scanner;
/*
 * PTra03_06.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_06 {

  public static void main(String[] args) {
    // 以下はじゃんけんを行うプログラムです。
    // TODO TODOコメントの指示に従ってプログラムを完成させてください。
    // ジャンケンの手は定数を使い、0や1などマジックナンバーを使用しないこと。

    // 入力を要求するためのもの
    Scanner scanner = new Scanner(System.in);
    // 乱数生成処理
    Random random = new Random();

    // 定数：ジャンケンの手
    final int GUU = 0; // グー
    final int CHOKI = 1; // チョキ
    final int PAA = 2; // パー

    System.out.println("じゃんけんを行います。");
    System.out.println("あなたの出す手を入力してください");
    System.out.println("0:グー, 1:チョキ, 2:パー");
    int playerHand = Integer.parseInt(scanner.nextLine());

    // TODO 入力された手を出力してください(0なら"あなたはグーを出しました"等)
    // なお、0〜2以外の文字が入力された場合は、「入力に誤りがあります」と表示し処理を終了させて下さい。
    // return; と書くと処理は終了します。

    if (playerHand == 0) {
      System.out.println("あなたはグーを出しました");
    } else if (playerHand == 1) {
      System.out.println("あなたはチョキを出しました");
    } else if (playerHand == 2) {
      System.out.println("あなたはパーを出しました");
    } else {
      System.out.println("入力に誤りがあります");
      return;
    }

    // 対戦相手の手をランダムに選択する。
    int npcHand = random.nextInt(3); // npcHandには0〜３のランダムな数字が代入される

    // TODO 対戦相手の手を出力してください(0なら"相手はグーを出しました"等)
    if (npcHand == 0) {
      System.out.println("相手はグーを出しました");
    } else if (npcHand == 1) {
      System.out.println("相手はチョキを出しました");
    } else if (npcHand == 2) {
      System.out.println("相手はパーを出しました");
    } else {
      return;
    }
    // TODO じゃんけんの結果を出力て下さい。
    // 例 あなたが勝った場合→ あなたの勝ちです！、あなたが負けた場合 → 対戦相手の勝ちです、あいこの場合 → あいこです

    if ((playerHand == 0 && npcHand == 1) || (playerHand == 1 && npcHand == 2)
        || (playerHand == 2 && npcHand == 0)) {
      System.out.println("あなたの勝ちです！");
    } else if ((playerHand == 0 && npcHand == 2) || (playerHand == 1 && npcHand == 0)
        || (playerHand == 2 && npcHand == 0)) {
      System.out.println("対戦相手の勝ちです");
    } else {
      System.out.println("あいこです");
    }
  }
}
