package org.sandoval.test.cgi;

import static org.sandoval.test.cgi.utils.SortBubble.ordenarArreglo;

public class MainSortBubble {
  public static void main(String[] args) {
    //Array the numbers to sort
    int[] arreglo = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};

    // cal the method to sort the vector
    ordenarArreglo(arreglo);


    System.out.println("Sorted array in ascending order:");
    for (int num : arreglo) {
      System.out.print(num + " ");
    }
  }
}