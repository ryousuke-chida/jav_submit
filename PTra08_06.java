/*
 * PTra08_06.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra08_06 {
  public static void main(String[] args) {
    // TODO 引数に 10 と 20 を渡してaddArrayメソッドを呼び出し、戻り値を変数 array に代入してください
    int[] array = addArray(10, 20);


    // TODO arrayの中身を全て出力してください
    for (int i : array)
      System.out.println(i);

  }

  //  TODO 以下の仕様でメソッドを作成してください。
  // 戻り値 ：int[]
  // メソッド名 ：addArray
  // 引数 ：int x, int y
  //
  //  配列を宣言して、引数で渡された2つのint型の引数を配列の0番目と1番目に代入して返す
  public static int[] addArray(int x, int y) {
    int[] array = {x, y};
    return array;

  }

}
