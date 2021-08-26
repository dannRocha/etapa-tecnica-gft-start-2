/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.questao4;

/**
 *
 * @author daniel
 */
public class Funcionario extends Pessoa {
  
  private Double salarioInicial;
  private Double percentual;
  private Double salarioTotal;

  public Funcionario() {}
  
   public Funcionario(Double salarioInicial, Double percentual) {
    this.salarioInicial = salarioInicial;
    this.percentual = percentual;
  }

  public Funcionario(Double salarioInicial, Double percentual, Double salarioTotal) {
    this.salarioInicial = salarioInicial;
    this.percentual = percentual;
    this.salarioTotal = salarioTotal;
  }

  public Double getSalarioInicial() {
    return salarioInicial;
  }

  public void setSalarioInicial(Double salarioInicial) {
    this.salarioInicial = salarioInicial;
  }

  public Double getPercentual() {
    return percentual;
  }

  public void setPercentual(Double percentual) {
    this.percentual = percentual;
  }

  public Double getSalarioTotal() {
    return salarioTotal;
  }

  public void setSalarioTotal(Double salarioTotal) {
    this.salarioTotal = salarioTotal;
  }
  
}
