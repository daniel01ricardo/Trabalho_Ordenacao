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

public class ordenacaoString {

    public static void main(String[] args) {
        int MAX = 1000;
        
        String[] nome = new String[MAX];
        for (int i = 0; i < MAX; i++) {
            nome[i] = "Nome " + (MAX - i);
        }
        String[] aux = new String[MAX];
        
        
        long soma_tempos = 0;
        for (int i = 0; i < 10; i++) {
            
            long t_ini = System.nanoTime(); 
            
            System.arraycopy(nome, 0, aux, 0, nome.length);
            
            selectionSort(aux);
            
            long t_fim = System.nanoTime(); 
            
            long tempo = t_fim - t_ini;
            soma_tempos += tempo;
        }
        
        long media_tempos = soma_tempos / 10;
        System.out.println("Tempo medio decorrido: " +  media_tempos + " ns");
    }
    
    
    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            
            int posMenor = menor(array, i, array.length);
            
            String aux = array[i];
            array[i] = array[posMenor];
            array[posMenor] = aux;
        }
    }
    
    public static int menor(String[] array, int ini, int fim) {
        int posMenor = ini;
        for (int i = posMenor+1; i < fim; i++) {
            
            if (array[posMenor].compareTo(array[i]) > 0) {
                posMenor = i; 
            }
        }
        return posMenor;
    }
}
