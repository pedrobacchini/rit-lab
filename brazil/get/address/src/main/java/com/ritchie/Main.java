package com.ritchie;

import com.ritchie.formula.Formula;

public class Main {

  public static void main(String[] args) throws Exception {
    String input1 = System.getenv("CEP");
    Formula formula = new Formula(input1);
    System.out.println(formula.Run());
  }
}
