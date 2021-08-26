/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.questao3;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Run {
  
  static Scanner input = new Scanner(System.in);
  
  
  public static void main(String[] args) {
    final int MENOR_NUMERO_INICIAL_POSSIVEL = 0;
    do {
      try {

        System.out.print("Numero Inicial: ");
        var inicial = input.nextInt();
        
        if(inicial <= MENOR_NUMERO_INICIAL_POSSIVEL) {
          throw new RuntimeException();
        }

        System.out.print("Numero Final: ");
        var _final = input.nextInt();
        
        if(_final <= inicial) {
          throw new RuntimeException();
        }
        
        System.out.printf("\nEntrada: %d - %d\n", inicial, _final);
        System.out.print("Saida: ");
        for(var i = inicial + 1; i <= _final; i++) {
          System.out.printf("%s", (i % 2 == 0) ? String.valueOf(i) : " " );
        }
        
        break;

      }
      catch(Exception e) {
        System.out.println(" * O numero incial e final dever ser inteiro e o incial dever ser maior que '0'(ZERO)");
        System.out.println(" * E numero incial < final");
      }
    } while(true);
  }
}
