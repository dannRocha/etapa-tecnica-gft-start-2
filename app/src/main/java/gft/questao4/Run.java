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
public class Run {
  public static void main(String[] args) {
    var salarioInicial = 1_000D;
    var aumento = 0.015D; // 1.5%
    var anoDeContratacao = 2018;
    
    var funcionario = new Funcionario(salarioInicial, aumento);
    funcionario.setNome("Astroildo Sandwich");
    funcionario.setRg("0000000000000-00");
    
    var calcularSalario = new CalcularSalario(funcionario, anoDeContratacao);
    
    funcionario.setSalarioTotal(calcularSalario.calcularSalarioAte(2021));
    
    
    System.out.println("---------------------------------------");
    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("RG: " + funcionario.getRg());
    System.out.printf("Salario em 2021 : R$ %.2f\n", funcionario.getSalarioTotal());
    System.out.println("---------------------------------------");
    
    
  }
}
