/*
 * PTra04_04.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;
import java.util.Scanner;

public class PTra04_04 {
  public static void main(String[] args) {
		// 以下は双六のプログラムです。TODO の指示に従って完成させてください。

		// 入力を読み取るための記述です。
		Scanner scanner = new Scanner(System.in);

		// ランダムな値を生成するための記述です。
		Random random = new Random();

		// TODO 双六の総コマ数としてint型の変数mapを宣言し、50を代入してください。
        int map = 50;

		// TODO 現在までの進んだコマ数としてint型の変数progressを宣言し、0を代入してください。
        int progress = 0;

		System.out.println("===== START =====");

		// TODO 変数mapとprogressを用いて、ゴールするまで繰り返すようにwhile文の条件を記述してください。
        while (progress <= 50) {
			// 入力を促すメッセージを出力し、エンターキーが押されるのを待ちます。
			System.out.println("Enterキーを押してください。さいころをふります。");
			scanner.nextLine();

			// 1~6のランダムな値を生成してさいころの目とします。
			int dice = random.nextInt(6) + 1;

			// TODO 変数diceを用いて、"#の目が出ました。"というメッセージを出力してください。
			// ※ #には変数diceの値が入ります。
            System.out.println(dice + "の目が出ました。");

			// TODO 変数progressに変数diceの値を加算してください。
            progress = progress + dice;

			// TODO まだゴールしていない場合は"残りのマスは#マスです。"というメッセージを出力してください。
			// ※ #には双六の残りのマス数が入ります。
            System.out.println("残りのマスは" + (map - progress) + "マスです。");

		}

		System.out.println("===== GOAL =====");
	}
}
