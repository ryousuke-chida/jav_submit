/*
 * PTra03_03.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra03_03 {
  public static void main(String[] args) {
		int num = 10;

		// TODO numが 2で割り切れる かつ 5で割り切れるという条件式を記述してください
        if (num % 2 == 0 && num % 5 == 0) {
			System.out.println(num  + "は2でも5でも割り切れます。");
		}
	}
}
