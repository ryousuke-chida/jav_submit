/*
 * PTra07_09.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_09 {
  public static void main(String[] args) {
    // 2次元配列
    int[][] array = {
      {1, 3, 5, 7}, // 0番目の配列
      {11, 13, 17, 19, 23, 29} // 1番めの配列
    };
    /*
     * // TODO 2次元配列arrayに含まれるすべての整数要素の平均値を浮動小数で出力してください // ※ 繰り返しを使用して記述すること double sum = 0; //
     * 各要素を足した数を格納する変数 double elementNum = 0; // 平均を計算するため、割る数を記憶する変数 for (int i = 0; i <
     * array.length; i++) { // for文をつかうこと for (int j = 0; j < array[i].length; j++) { sum +=
     * array[i][j]; elementNum = array.length; } System.out.println(sum / array[i].length); }
     */

    double sum = 0;
    double elementNum = 0;
    for (int i = 0; i < array.length; i++) {
      elementNum += array[i].length; // CHECK 配列の長さを記憶する場合(どちらでも可)
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
        // elementNum++; CHECK 配列の長さではなく、足した数を記憶する場合 (どちらでも可)
      }
    }
    System.out.println(sum / elementNum);



  }
}
