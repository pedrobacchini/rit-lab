package com.ritchie;

import com.ritchie.formula.Formula;

public class Main {

  public static void main(String[] args) {
    String input1 = System.getenv("NUMBER_1");
    String input2 = System.getenv("NUMBER_2");
    Formula formula = new Formula(input1, input2);
    System.out.println(formula.Run());
  }
}
