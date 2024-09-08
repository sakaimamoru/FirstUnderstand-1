package org.example;

public class calculation {

  double num1;
  double num2;

  public static double add(double num1, double num2) {
    return num1 + num2;
  }

  public static double subtraction(double num1, double num2) {
    return num1 - num2;
  }

  public static double multiplication(double num1, double num2) {
    return num1 * num2;
  }

  public static double division(double num1, double num2) {
    if (num2 == 0) {
      System.out.println("0で割る事はできません");
      return 0;
    } else {
      return num1 / num2;

    }

  }
}


