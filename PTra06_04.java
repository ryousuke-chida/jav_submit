/*
 * PTra06_04.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra06_04 {
  public static void main(String[] args) {
    // TODO 下記のfor文の中で、変数iの値を条件に以下のような挙動をするプログラムを作成してください。

    //    ① iが3で割り切れる場合はfizzと出力する
    //    ② iが5で割り切れる場合はbuzzと出力する
    //    ③ iが3でも5でも割り切れる場合はfizzbuzzと出力する
    //    ④ 上記のいずれにも当てはまらない場合はiの値をそのまま出力する
    // ヒント： 割り切れる は余剰（％）を使います。
    // 「10 % 2 == 0」 →  「10 を 2 で割ったらあまりは0ですか？(この場合、あまりは0なのでこの条件判定はtrueを返す)」

    for (int i = 1; i <= 20; i++) { // ※このfor文を使ってください
    
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("fizzbuzz");
      } else if (i % 3 == 0) {
      System.out.println("fizz");
    } else if (i % 5 == 0){
      System.out.println("buzz");
    } else {
      System.out.println(i);
    }
  }

    // CHECK 出力結果は以下と同じになっているか確認する。
    // 特に15の前後(14,fizzbuzz,16と出る)を良く確認してください。
    /*
    1
    2
    fizz
    4
    buzz
    fizz
    7
    8
    fizz
    buzz
    11
    fizz
    13
    14
    fizzbuzz
    16
    17
    fizz
    19
    buzz
    */
  }
}
