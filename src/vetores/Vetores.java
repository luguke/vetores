/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author luguq
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public void maior(int vetor[]){
        int maior = vetor[0];
        int menor = vetor[0];
        for(int i = 0; i< vetor.length; i++){
        if(vetor[i] > maior){
        maior = vetor[i];
        }
    }
        for(int j = 0; j < vetor.length; j++){
    if(vetor[j] < menor){
    menor = vetor[j];
        }
    }
    System.out.println("Maior valor:" + maior);
    System.out.println("Menor valor:"+ menor);
}
}
    
