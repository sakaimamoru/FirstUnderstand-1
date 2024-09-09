package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("1番目の数値を入力してください");

      double num1 = scanner.nextDouble();

      System.out.println("1番目の数値が入力されました");
      System.out.println("+, -, *, /いずれかの演算子を入力してください");
      String operator = scanner.next();

      System.out.println("2番目の数値を入力してください");
      double num2 = scanner.nextDouble();

      //Calculationクラスのインスタンスを生成し、フィールドに数値を設定
      Calculation calc = new Calculation(num1, num2);

      double result;
      switch (operator) {
        case "+":
          result = calc.add();
          break;
        case "-":
          result = calc.subtraction();
          break;
        case "*":
          result = calc.multiplication();
          break;
        case "/":
          result = calc.division();
          break;
        default:
          System.out.println("対応していない演算子です");
          return;
      }
      System.out.println("計算結果" + result);

      //計算の続行確認
      boolean validInput = false;
      while (!validInput) {
        System.out.println("計算を続けますか？（Y/N）");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) {
          System.out.println("計算を継続します");
          validInput = true;
        } else if (answer.equalsIgnoreCase("N")) {
          System.out.println("計算を終了します");
          running = false;
          validInput = true;
        } else {
          //YかN以外が入力された場合の処理
          System.out.println("無効な入力です、'Y'か'N'を入力してください。");

        }
      }
    }
    scanner.close();
  }
}
