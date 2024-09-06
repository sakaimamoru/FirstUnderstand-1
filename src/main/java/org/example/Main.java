package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1番目の数値を入力してください");

    double num1 = scanner.nextDouble();

    System.out.println("1番目の数値が入力されました");
    System.out.println("+, -, *, /いずれかの演算子を入力してください");
    String operator = scanner.next();

    System.out.println("2番目の数値を入力してください");
    double num2 = scanner.nextDouble();

    double result;
    switch (operator) {
      case "+":
        result = calculation.add(num1, num2);
        break;
      case "-":
        result = calculation.subtraction(num1, num2);
        break;
      case "*":
        result = calculation.multiplication(num1, num2);
        break;
      case "/":
        result = calculation.division(num1, num2);
        break;
      default:
        System.out.println("対応していない演算子です");
        return;
    }

    System.out.println("計算結果" + result);


  }
}