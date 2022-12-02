/*
 * PTra07_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;

public class PTra07_05 {
  public static void main(String[] args) {
    String[] array = new String[5];
    array[0] = "森";
    array[1] = "山";
    array[2] = "沼";
    array[3] = "島";
    array[4] = "平地";

    // 0~4のランダムな整数を作成します
    int index = new Random().nextInt(5);

    // TODO 配列arrayのindex番目の文字列を出力して下さい。
    // 例）indexが4だった場合、「平地」が出力できるようにする。
    System.out.println(array[index]);

  }
}
