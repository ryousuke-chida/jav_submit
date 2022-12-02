/*
 * PTra07_04.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_04 {
  public static void main(String[] args) {
    int[] array = new int[20];

    // TODO 配列arrayに1から20までの整数を順に入れてください
    // ※ for文を用いて代入を行うこと
    for (int i = 0; i < array.length; i++) {
    	// ここに追記する
        array[i] = i + 1;

      }

    // TODO 配列arrayの全要素を順番に出力してください
    for (int i : array) {
    	// ここに追記する
        System.out.println(i);
      }
  }

}