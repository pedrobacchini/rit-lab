package com.ritchie.formula;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormulaTest {

  @Test
  public void run() {
    Formula formula = new Formula("Hello", "World");
    String excpeted = "{user: Hello, token: World}";
    assertEquals(excpeted, formula.Run());
  }
}
