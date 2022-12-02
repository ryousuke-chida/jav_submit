/*
 * PTra08_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra08_05 {
  public static void main(String[] args) {
    System.out.println("1つ目の数値を入力してください");
    // キーボードから入力した文字列を num1 に代入します。
    int num1 = new java.util.Scanner(System.in).nextInt();

    System.out.println("2つ目の数値を入力してください");
    // キーボードから入力した文字列を num2 に代入します。
    int num2 = new java.util.Scanner(System.in).nextInt();

    // TODO num1、num2メソッドを引数に渡してsumメソッドを呼び出し、戻り値を変数 sum に代入してください。
    int sum = sum(num1, num2);

    // TODO 変数 sum の値を出力してください。
    System.out.println(sum);
  }

  //  TODO 以下の仕様でメソッドを作成してください。
  //  戻り値 ：int
  //  メソッド名 ：sum
  //  引数 ：int x, int y
  public static int sum(int x, int y) {


  //  引数で渡された２つのint型の合計を返すメソッド
    return x + y;

  }
}
