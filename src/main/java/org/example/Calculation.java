package org.example;

public class Calculation {

  double num1;
  double num2;

  //コンストラクタでフィールドに値を設定
  public Calculation(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public double add() {
    return num1 + num2;
  }

  public double subtraction() {
    return num1 - num2;
  }

  public double multiplication() {
    return num1 * num2;
  }

  public double division() {
    if (num2 == 0) {
      System.out.println("0で割る事はできません");
      return 0;
    } else {
      return num1 / num2;

    }

  }
}


