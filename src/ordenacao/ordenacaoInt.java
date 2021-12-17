/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//
// PARA QUICKSORT FOI UTILIZADO O Arrays.sort da propria bilbioteca java.
//
package ordenacao;


import java.io.IOException;
import java.util.Arrays;

public class ordenacaoInt {
public static void main(String[] args) throws IOException {
   int tamanho = 500000;
   int[] vetor = new int[tamanho];
   for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random()*tamanho);
   }

   int[] aux = new int[tamanho];
        
        
        long soma_tempos = 0;
        for (int i = 0; i < 10; i++) {
            
            long t_ini = System.nanoTime(); 
            
            System.arraycopy(vetor, 0, aux, 0, vetor.length);
            
            selectionSort(aux);
            
            long t_fim = System.nanoTime(); 
            
            long tempo = t_fim - t_ini;
            soma_tempos += tempo;
        }
        
        long media_tempos = soma_tempos / 10;
        System.out.println("Tempo medio decorrido: " +  media_tempos + " ns");

 }

 public static void selectionSort(int[] array) {
  for (int fixo = 0; fixo < array.length - 1; fixo++) {
    int menor = fixo;

    for (int i = menor + 1; i < array.length; i++) {
       if (array[i] < array[menor]) {
          menor = i;
       }
    }
    if (menor != fixo) {
      int t = array[fixo];
      array[fixo] = array[menor];
      array[menor] = t;
    }
  }
}
}
