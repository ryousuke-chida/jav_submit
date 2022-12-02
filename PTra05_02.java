/*
 * PTra05_02.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra05_02 {

  public static void main(String[] args) {
    System.out.println("1つ目の数値を入力してください");
    // キーボードから入力した文字列を num1 に代入します。
    int num1 = new java.util.Scanner(System.in).nextInt();

    System.out.println("2つ目の数値を入力してください");
    // キーボードから入力した文字列を num2 に代入します。
    int num2 = new java.util.Scanner(System.in).nextInt();

    System.out.println("計算方法を選択してください");
    // キーボードから入力した文字列を choice に代入します。
    String choice = new java.util.Scanner(System.in).nextLine();

    // TODO 以下の条件に沿ったプログラムを記述してください

    //    入力された数値によって以下のように出力してください。
    //    変数choiceの値が + の場合 -> num1 と num2 を 足した数 を出力
    //    変数choiceの値が - の場合 -> num1 から num2 を 引いた を出力
    //    変数choiceの値が * の場合 -> num1 と num2 を 掛けた を出力
    //    変数choiceの値が / の場合 -> num1 を num2 で 割った を出力
    //    変数choiceの値が % の場合 -> num1 を num2 で 割った余り を出力
    //    変数choiceの値が 上記以外 の場合 -> 計算に失敗しましたを出力

    switch (choice) {

      case ("+"):
        System.out.println((num1 + num2));
        break;
      case ("-"):
        System.out.println((num1 - num2));
        break;
      case ("*"):
        System.out.println((num1 * num2));
        break;
      case ("/"):
        System.out.println((num1 / num2));
        break;
      case ("%"):
        System.out.println((num1 % num2));
        break;
      default:
        System.out.println("計算に失敗しました");
        break;

    }

  }
}
