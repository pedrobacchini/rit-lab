package com.ritchie.formula;

public class Formula {

    private String cep;

    public String Run() throws Exception {
      String padrao = "\\d{8}";
      if (cep.matches(padrao)) {
          return ServicoDeCep.buscaEnderecoPelo(cep);
      } else {
        return "cep inválido";
      }
    }

    public Formula(String input1) {
        this.cep = input1;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
