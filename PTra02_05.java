/*
 * PTra02_05.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra02_05 {
  public static void main(String args[]) {
    // 以下のプログラムを実行すると、
    /*
     * 山田さんは20歳です。 5年後には205歳になります。
     */
    // と表示されます。

    // TODO 5年後には25歳になりますと表示されるように修正してください。
    // ※ ただし行数を増やしてはいけません。
    int age = 20;
    int diff = 5;

    System.out.println("山田さんは" + age + "歳です。");
    System.out.println(diff + "年後には" + (age + diff) + "歳になります。");
  }
}


// [変数を()で括って数値として計算する]
