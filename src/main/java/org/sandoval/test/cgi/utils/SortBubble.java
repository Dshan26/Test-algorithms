package org.sandoval.test.cgi.utils;

public class SortBubble {

  // method to sort an array using bubble sort
  public static void ordenarArreglo(int[] arreglo) {
    int n = arreglo.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arreglo[j] > arreglo[j + 1]) {

          int temp = arreglo[j];
          arreglo[j] = arreglo[j + 1];
          arreglo[j + 1] = temp;
        }
      }
    }
  }
}
