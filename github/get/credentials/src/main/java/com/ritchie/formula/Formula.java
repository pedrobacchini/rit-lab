package com.ritchie.formula;

public class Formula {

  private String input1;
  private String input2;

  public String Run() {
    return String.format("{user: %s, token: %s}", input1, input2);
  }

  public Formula(String input1, String input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  public String getInput1() {
    return input1;
  }

  public void setInput1(String input1) {
    this.input1 = input1;
  }

  public String getInput2() {
    return input2;
  }

  public void setInput2(String input2) {
    this.input2 = input2;
  }
}
