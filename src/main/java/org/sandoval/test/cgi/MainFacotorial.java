package org.sandoval.test.cgi;

import java.util.Random;

import static org.sandoval.test.cgi.utils.Factorial.calcularFactorial;

public class MainFacotorial {

  public static void main(String[] args) {
    Random random = new Random();
    int n = (-10) + random.nextInt(25);
    System.out.println("Número: " + n);

    try {
      if (n >= 0) {
        int resultado = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
      } else {
        System.out.println("Error al calcular el factorial de " + n + ". El número debe ser positivo.");
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Excepción: " + e.getMessage());
    }
  }
}