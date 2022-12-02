/*
 * PTra05_03.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra05_03 {
  public static void main(String[] args) {
    System.out.println("=========================================");
    System.out.println("               ゲームの説明");
    System.out.println("=========================================");

    System.out.println("これからハイ＆ローゲームを行います。");
    System.out.println("ハイ＆ローゲームは、あなたのカードがディーラーのカードより大きいか小さいかを予想するゲームです。");

    System.out.println();
    System.out.println("=========================================");
    System.out.println("               ゲーム開始");
    System.out.println("=========================================");

    // ランダムな数値を dealerCard に代入します。(範囲は 1 ~ 13)
    int dealerCard = new java.util.Random().nextInt(13) + 1;

    System.out.println("ディーラーのカードは" + dealerCard + "です");

    // ランダムな数値を myCard に代入します。(範囲は 1 ~ 13)
    int myCard = new java.util.Random().nextInt(13) + 1;

    System.out.println();
    System.out.println("あなたのカードがディーラのカードより大きい場合は H 小さい場合は L を入力してください。");
    System.out.println("※ カードの数値が同じ場合はあなたの勝ちです。");

    // キーボードから入力した文字列を judgment に代入します。
    String judgment = new java.util.Scanner(System.in).nextLine();

    System.out.println("あなたのカードは" + myCard + "です");

    System.out.println();
    System.out.println("=========================================");
    System.out.println("               勝敗判定");
    System.out.println("=========================================");

    // TODO 以下を修正し、予想が当たった場合は「あなたの勝ちです」、外れた場合は「あなたの負けです」を出力してください。
    // ※ H か L 以外の文字が入力された場合は、「不正な値が入力されました」と出力してください。
    switch (judgment) {
      case ("H"):
        if (myCard >= dealerCard) {
          System.out.println("あなたの勝ちです");
        } else {
          System.out.println("あなたの負けです");
        }
        break;

      case ("L"):
        if (myCard <= dealerCard) {
          System.out.println("あなたの勝ちです");
        } else {
          System.out.println("あなたの負けです");
        }
        break;

      default:
        System.out.println("不正な値が入力されました");
    }
  }
}
