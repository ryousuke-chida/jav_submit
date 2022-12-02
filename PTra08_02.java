/*
 * PTra08_02.java 作成 Rhizome ------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra08_02 {
  public static void main(String[] args) {
    // TODO 引数に 山田 を渡してhelloメソッドを呼び出してください。
    String hello = "山田";
    hello(hello);
  }

  public static void hello(String name) {
    System.out.println("こんにちは。" + name + "です");
  }
}
