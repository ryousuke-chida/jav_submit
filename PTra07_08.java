/*
 * PTra07_08.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_08 {
  public static void main(String[] args) {
    // 2次元配列
    int[][] array = {
      {1, 3, 5, 7}, // 0番目の配列
      {11, 13, 17, 19, 23, 29} // 1番めの配列
    };

    // TODO 2次元配列arrayに含まれるすべての整数要素を順に出力してください
    // ※ 繰り返しを使用して記述すること
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {

        System.out.println(array[i][j]);
      }
    }

  }
}
