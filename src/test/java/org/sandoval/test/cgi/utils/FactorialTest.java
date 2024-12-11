package org.sandoval.test.cgi.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

  @Test
  public void testFactorialDeCero() {
    int resultado = Factorial.calcularFactorial(0);
    assertEquals(1, resultado, "El factorial de 0 debe ser 1");
  }

  @Test
  public void testFactorialDePositivo() {
    int resultado = Factorial.calcularFactorial(5);
    assertEquals(120, resultado, "El factorial de 5 debe ser 120");
  }

  @Test
  public void testFactorialDeNegativoLanzaExcepcion() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      Factorial.calcularFactorial(-5);
    });
    assertEquals("El número debe ser positivo", exception.getMessage(),
            "El mensaje de excepción debe indicar que el número debe ser positivo");
  }

}