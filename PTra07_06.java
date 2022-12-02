/*
 * PTra07_06.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_06 {
  public static void main(String[] args) {
    // 要素数100の配列を作成する
    String[] studentNumbers = new String[100];

    // for文を使って、配列の0番目に「学籍番号1234」、1番目に「学籍番号1235」・・・と格納し最後は「学籍番号1333」となるように値をセットして下さい。
    // ※ 学籍番号は1ずつカウントアップしていきます
    // なお、以下の変数strStudentNumberを利用すること
    final String strStudentNumber = "学籍番号";
    for (int i = 0; i < studentNumbers.length; i++) {
      // TODO ここに記述する
      // for (int j = 1234; j < studentNumbers.length; j++) {
      // studentNumbers[i] = strStudentNumber + j;

      studentNumbers[i] = strStudentNumber + (i + 1234);

    }


    // CHECK 配列の中身を出力する
    for (String studentNumber : studentNumbers) {
      System.out.println(studentNumber);
    }


  }
}
