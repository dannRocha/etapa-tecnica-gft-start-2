/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.questao2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Run {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    var rand = new Random();
    
    var lista = new ArrayList<Integer>();
    var jogada = new ArrayList<Integer>();
    
    final int TAMANHO_MAX_LISTA_SORTEADA = 4;
    final int MAIOR_NUMERO_SORTEADO_NAO_INCLUSO = 20;
    final int MENOR_NUMERO_SORTEADO_NAO_INCLUSO = 0;
    
    do {
      var numero = rand.nextInt(MAIOR_NUMERO_SORTEADO_NAO_INCLUSO);
      if(numero == MENOR_NUMERO_SORTEADO_NAO_INCLUSO) numero++;
      
      if(!lista.contains(numero)) {
        lista.add(numero);
      }
    }while(lista.size() < TAMANHO_MAX_LISTA_SORTEADA);

    
    do {
       try {
         System.out.println("Adicione sua jogada : numeros restantes: " + (TAMANHO_MAX_LISTA_SORTEADA - jogada.size()) + " <->: ");
         
         var numero = input.nextInt();
         if(numero <= MENOR_NUMERO_SORTEADO_NAO_INCLUSO || numero >= MAIOR_NUMERO_SORTEADO_NAO_INCLUSO) {
           throw new RuntimeException();
         }
         
         jogada.add(numero);
       }
       catch(Exception e) {
         System.out.println("Digite numeros válidos de 0 a 20");
       }
    }
    while(jogada.size() != TAMANHO_MAX_LISTA_SORTEADA);
    
    int acertos = 0;
    for(var numero : jogada) {
      if(lista.contains(numero)) {
        acertos++;
      }
    }
    
    if(acertos == TAMANHO_MAX_LISTA_SORTEADA) {
      System.out.println("Você acertou todos os numeros: " + lista );
    }
    else {
      System.out.println("Não foi dessa vez numeros sorteados: " + lista);
    }
    
  }
   
}
