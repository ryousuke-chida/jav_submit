/*
 * PTra03_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_05 {
  public static void main(String[] args) {

    // TODO: 以下、自分のステータスとなるように変数の中身を書き換えなさい
    boolean isMan = true; // 男性である
    boolean isLessThan25 = false; // 25歳未満である(25歳は含まない)

    // 男性である(変数isMan == true)場合は「私は男性です」と表示する
    if (isMan) {
      System.out.print("私は男性、");
    } else {
      System.out.print("私は女性、");
    }

    // 25歳未満ではない (変数isLessThan25 == false)場合は「私は25歳以上です」と表示する
    if (!isLessThan25) {
      System.out.println("私は25歳以上です");
    } else {
      System.out.println("25歳未満です");
    }
    System.out.println("********************");

    // TODO ①〜④の条件式を完成させなさい

    // TODO ①女性かつ25歳未満の場合は「私は女性かつ25歳未満です」と表示する
    if (isMan == false && isLessThan25) {
      System.out.println("私は女性かつ25歳未満です ーー①");
    }

    // TODO ② 男性もしくは25歳以上の場合は「私は男性もしくは25歳以上です」と表示する
    if (isMan || isLessThan25 == false) {
      System.out.println("私は男性もしくは25歳以上です ーー②");
    }

    // TODO ③ 女性かつ25歳以上の場合は「私は女性かつ25歳以上です」と表示する
    if (isMan == false && isLessThan25 == false) {
      System.out.println("私は女性かつ25歳以上です ーー③");
    }

    // TODO ④ 女性、もしくは25歳以上の場合は「私は女性、もしくは25歳以上です」と表示する
    if (isMan == false || isLessThan25 == false) {
      System.out.println("私は女性、もしくは25歳以上です ーー④");
    }

    // TODO isManにtrue、isLessThan25にtrueをセットして実行しなさい
    // CHECK ②のみ表示されていれば正解です。

    // TODO isManにtrue、isLessThan25にfalseをセットして実行しなさい
    // CHECK ②と④のみ表示されていれば正解です。

    // TODO isManにfalse、isLessThan25にtrueをセットして実行しなさい
    // CHECK ①と④のみ表示されていれば正解です。

    // TODO isManにfalse、isLessThan25にfalseをセットして実行しなさい
    // CHECK ②と③と④のみ表示されていれば正解です。
  }
}
