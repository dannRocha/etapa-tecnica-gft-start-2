/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.questao1;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Run {
  
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    Integer opcao = null;
    
    
    final int SOM = 1;
    final int SUB = 2;
    final int MUL = 3;
    final int DIV = 4;
    final int SAIR = 5;

    do {

      
      try {
        System.out.println("=== Operacoes=====");
        System.out.println(" 1 =  Soma ");
        System.out.println(" 2 =  Subtracao ");
        System.out.println(" 3 =  Multiplicacao ");
        System.out.println(" 4 =  Divisao ");
        System.out.println(" 5 =  Sair ");
        System.out.println("=================");
        System.out.println("opcao: ");
        
        opcao = input.nextInt();
        
        switch(opcao) {
          case SOM: {
            System.out.print("Numero A: ");
            var a = input.nextInt();
            
            System.out.print("Numero B: ");
            var b = input.nextInt();
            
            System.out.printf("Soma de %d + %d = %d\n", a, b, Calculo.sum(a, b));
            continue;
          }
          case SUB: {
            System.out.print("Numero A: ");
            var a = input.nextInt();
            
            System.out.print("Numero B: ");
            var b = input.nextInt();
            
            System.out.printf("Subtracao de %d - %d = %d\n", a, b, Calculo.sub(a, b));
            continue;
          }
          case MUL: {
            System.out.print("Numero A: ");
            var a = input.nextInt();
            
            System.out.print("Numero B: ");
            var b = input.nextInt();
            
            System.out.printf("Mutiplicacao de %d * %d = %d\n", a, b, Calculo.mult(a, b));
            continue;
          }
          case DIV: {
            System.out.print("Numero A: ");
            var a = input.nextInt();
            
            System.out.print("Numero B: ");
            var b = input.nextInt();
            
            System.out.printf("Divisao inteira de %d / %d = %d\n", a, b, Calculo.div(a, b));
            continue;
          }
          default: {
            if(opcao == SAIR) {
              System.out.println("SAINDO");
            }
            else {
              throw new RuntimeException();
            }
          }
        }
        
        
      }
      catch(Exception e) {
        System.out.println("Opcao invalida | Error tente novamente");
        // input.next();
      }
    }
    while(opcao != SAIR);
      
  }
}

