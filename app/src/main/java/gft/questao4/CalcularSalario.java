package gft.questao4;


import gft.questao4.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class CalcularSalario {
  
  private Funcionario funcionario;
  private Integer anoDeContrato;
  
  public CalcularSalario(Funcionario funcionario, Integer anoDeContrato) {
    this.funcionario = funcionario;
    this.anoDeContrato = anoDeContrato;
  }
  
  public Double calcularSalarioAte(Integer ano) {
    var anosTrabalhados = ano - anoDeContrato;
    var salarioAtual = funcionario.getSalarioInicial();
    
    for(var i = 0; i < anosTrabalhados; i++) {
      salarioAtual += salarioAtual * funcionario.getPercentual();
    }
    
    return salarioAtual;
  }
}
