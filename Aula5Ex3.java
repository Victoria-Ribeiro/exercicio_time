/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5ex3;

import java.util.Scanner;

/**
 *
 * @author Nê
 */
public class Aula5Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, idade1, peso1, idade2=0, mediaidade=0, peso2=0;
        double altura1,porct, somaaltura=0;
        
        Scanner dado= new Scanner (System.in);
        
        for (i=1;i<=3;i++){
            mediaidade=0;
            System.out.println("Time"+i);            
            for(j=1;j<=5;j++){
                System.out.println("Jogador "+j);
                System.out.println("Digite sua idade ");
                idade1= dado.nextInt();
                System.out.println("Digite seu peso ");
                peso1= dado.nextInt();
                System.out.println("Digite sua altura");
                altura1= dado.nextDouble();
                mediaidade= mediaidade + idade1;    
                somaaltura= somaaltura+altura1;
                
                    if(idade1>=18){
                        idade2++;}
                               
                    if(peso1>=80){
                       peso2++; }    
                    
                   
            }
            System.out.println("A média de idade do time "+i+" é de "+mediaidade/5);    
          
            
        }
        somaaltura= somaaltura/15;
        porct= 100*peso2/15;
       
        System.out.println("A quantidade de jogadores com +18 é "+idade2);
        System.out.println("A média da altura dos jogadores é "+somaaltura);
        System.out.println("A porcentagem com jogadores com mais de 80kg é de "+porct+"%");
        
    }
    
}
