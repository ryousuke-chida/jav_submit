import java.util.Random;

/*
 * PTra03_07.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_07 {

  public static void main(String[] args) {
    /*
     * 数当てゲームを作ります。
     * ① コンソールに「1〜5の数字を入力して下さい」が表示される
     * ② コンソールに 1~5、もしくはそれ意外の半角数字を入力する
     *    もし入力値が1~5ではない場合は、コンソールに「◎ は1〜5ではないためゲームを終了します」と表示される ※ ◎は入力した数字
     * ③ コンソールに「対象の数字は●です」が表示される ※ ● は1~5の数字がランダムで表示される
     * ④ 「********************」が表示される
     * ⑤ 入力した数字と対象の数字が同じであれば「あたり！」
     *    入力した数字より対象の数字が大きければ「入力値の方が大きい数である」
     *    入力した数字より対象の数字が小さければ「入力値の方が小さい数である」
     * ⑥ 「********************」が表示される
     */

    // TODO このクラスを実行し、処理の内容を確認して下さい。
    System.out.println("1〜5の数字を入力して下さい");
    int inputNumber = new java.util.Scanner(System.in).nextInt();

    // TODO 1,2,3,4,5以外の数字が入力された場合、return;で処理を終了して下さい
    if (false) {
      System.out.println(inputNumber + " は1〜5ではないためゲームを終了します");
      return; // 以降の処理は実行せず、処理は終了する。
    }

    Random random = new Random();
    int randomNumber = random.nextInt(5) + 1; // ランダムに1~5の数を生成する
    System.out.println("対象の数字は " + randomNumber + " です");
    System.out.println("********************");

    // TODO 以下の条件式をネスト(if文のなかにif文があることをネストという)がなくなるように修正して下さい。
    // 「!」で条件を反転していますが「!」を使わず条件式を作ってください。
    if ((inputNumber > randomNumber)) {
      // ifのなかにifがあり、ネストしている
        System.out.println("入力値の方が大きい数である");
    } else if ((inputNumber < randomNumber)) {
      System.out.println("入力値の方が小さい数である");
      } else {
      System.out.println("あたり！");
    }

    // 以下は修正しない
    System.out.println("********************");
  }
}
