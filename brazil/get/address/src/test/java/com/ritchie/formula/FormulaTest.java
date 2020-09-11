package com.ritchie.formula;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormulaTest {

  @Test
  public void run() throws Exception {
    Formula formula = new Formula("78850000");
    String excpeted = "{  \"cep\": \"78850-000\",  \"logradouro\": \"\",  \"complemento\": \"\",  \"bairro\": \"\",  \"localidade\": \"Primavera do Leste\",  \"uf\": \"MT\",  \"ibge\": \"5107040\",  \"gia\": \"\",  \"ddd\": \"66\",  \"siafi\": \"9871\"}";
    assertEquals(excpeted, formula.Run());
  }
}
