/*
 * PTra07_10.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_10 {
  public static void main(String[] args) {
    // 配列の宣言
    int[] array = new int[100];

    // このプログラムを実行すると実行中に「ArrayIndexOutOfBoundsException」というエラーがコンソールに出力されてしまいます
    // TODO 以下のプログラムを修正してエラーが出力されないようにしてください
    // ※コンソールに1から100までの値が順番に表示されれば成功です
    // ヒント：ArrayIndexOutOfBoundsException を調べましょう

    // 配列の中身が{1,2,3,…,98,99,100}となるように値を代入する
    int i = 0;
    while (i < 100) {
      array[i] = i + 1;
      i++;
    }

    // 配列の中身を順にすべて出力する
    for (int element : array) {
      System.out.println(element);
    }
  }
}
