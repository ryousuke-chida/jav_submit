/*
 * PTra07_07.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_07 {
  public static void main(String[] args) {
    // 以下の変数schedule一週間の時間割を2次元配列で表したものです
    String[][] schedule = {
      //             月      火      水      木     金
      /* 1時間目 */ {"国語", "社会", "国語", "理科", "社会"},
      /* 2時間目 */ {"英語", "数学", "英語", "数学", "国語"},
      /* 3時間目 */ {"理科", "国語", "理科", "国語", "理科"},
      /* 4時間目 */ {"社会", "社会", "数学", "社会", "数学"},
      /* 5時間目 */ {"数学", "英語", "英語", "理科", "英語"}
    };

    // TODO ① 変数scheduleから金曜日の2時間目の科目を取得して出力してください
    // CHECK 国語が表示されたら正解です。
    System.out.println(schedule[1][4]);

    // TODO ② 変数scheduleから水曜日の5時間目の科目を取得して出力して下さい
    // CHECK 英語が表示されたら正解です。
    System.out.println(schedule[4][2]);

    // TODO ③ 変数scheduleから水曜日の5時間目の科目を"体育"に変更して下さい ※ 代入する
    schedule[4][2] = "体育";


    // TODO ②で書いたコードを貼り付けて下さい
    // CHECK 体育が表示されたら正解です。
    System.out.println(schedule[4][2]);
  }
}
