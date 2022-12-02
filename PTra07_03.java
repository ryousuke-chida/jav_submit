/*
 * PTra07_03.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_03 {
  public static void main(String[] args) {
    String[] array = new String[5]; // 要素数5の配列を生成
    array[0] = "森";
    array[1] = "山";
    array[2] = "沼";
    array[3] = "島";
    array[4] = "平地";

    // TODO ① 配列arrayの全要素をfor文を使用して順番に出力してください
    // CHECK 以下が出力されたら正解です。
    /*
    森
    山
    沼
    島
    平地
    */
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    System.out.println(); // 改行を出力

    // TODO ② 配列arrayの2番目(現在は沼が格納されている)に「川」を代入し値を上書きして下さい
    array[2] = "川";

    // TODO ③ 拡張for文を使用して配列arrayの全要素を順番に出力してください
    // CHECK 以下が出力されたら正解です。
    for (String value : array) {
      System.out.println(value);
    }
    /*
    森
    山
    川
    島
    平地
    */

  }
}
