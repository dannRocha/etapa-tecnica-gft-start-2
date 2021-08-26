/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft.questao1;

/**
 *
 * @author daniel
 */
public class Calculo {
  private static Integer ZERO = 0;
  
  public static Integer sum(Integer a, Integer b) {
    return a + b;
  }
  
  public static Integer sub(Integer a , Integer b) {
    return a - b;
  }
  
 
  public static Integer mult(Integer a , Integer b) {
    return a * b;
  }
  
  public static Integer div(Integer a , Integer b) throws RuntimeException {
    if( b.equals(ZERO)) {
      throw new RuntimeException();
    }
    
    return a / b;
  }
  
  
}
