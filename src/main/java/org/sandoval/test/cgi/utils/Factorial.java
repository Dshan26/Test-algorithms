package org.sandoval.test.cgi.utils;


/*haz este con programacion funcional:b)	Diseñar un algoritmo que, dado un numero n
(positivo) permita calcular el factorial del mismo (entiéndase por factorial una multiplicación sucesiva
de números empezando de atrás hacia adelante, llegando hasta el final del número – Ej: Factorial de 6 es
igual a 1 x 2 x 3 x 4 x 5 x 6. Factorial de n es igual a 1 x 2 x …… x n -).*/
public class Factorial {
  public static int calcularFactorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("El número debe ser positivo");
    }
    if (n == 0) {
      return 1;
    } else {
      return n * calcularFactorial(n - 1);
    }
  }
}
