package org.sandoval.test.cgi.utils;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.sandoval.test.cgi.utils.SortBubble;

public class MainSortBubbleTest {

  @Test
  public void testOrdenarArreglo() {
    int[] arreglo = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};

    int[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    SortBubble.ordenarArreglo(arreglo);
    assertArrayEquals(esperado, arreglo);
  }

}