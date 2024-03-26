/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 15;
        
        a*=2;
        //Resultado certo é 30
        
        // IF Utilizado quando existe a necessidade de verificar condições:
        // Else caso a alternativa If não for atendida
        // == é comparação "igual a"
        if (a==20) {
            System.out.println("a = 20");
            
        } else if(a==40) {
            System.out.println("a = 40");
        } else if(a==50){
            System.out.println("a = 50");
        } else {
            System.out.println("Nenhum dos valores");
        }
        
        System.out.println("Restante do codigo");
        
        //switch utilizado para condições também, mas é pelo valor da variável e não por true or false 
        // break é para o programa para de rodar quando achar o valor certo
        
        int b = 77;
        
        switch (b){
            case 10:
                System.out.println("caso = 10");
                break;
            case 77:
                System.out.println("switch funcionou = 77");
                
        }
        
        //Faça um algoritmo que leia um número inteiro.–  Se o número for maior que 20. . .–  calcular e imprimir a metade dele.
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Coloque um numero inteiro");
        int p = leitor.nextInt();
        
        
        if(p>20){
            System.out.println("a metade do numero e: " + p/2);
        }
        
       
        
        
        
        
        // TODO code application logic here
    }
    
}
