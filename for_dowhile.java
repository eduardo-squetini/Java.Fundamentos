/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_07;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class for_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //for testa primeiro antes de executar portanto AQUI nn rodará nada
        //inicia / testa condição / realiza o bloco se a expressão for verdadeira / faz expressão automática / volta pra testar a condição:
        
       /* for(int i = 0; i< 0;i++){
            System.out.println(i);
        }*/
        
        //while testa a condição/ realiza o bloco / testa a condição novamente:
        
        /*while(condiçao){
            //bloco
        }
        
        //***quando não sei as condições exatas uso o while, se eu sei as condições uso o for
        
        */
        
        /*do...while executa primeiro ou realiza o bloco / testa a condiçao:
        
        do{ //bloco}
        whil(cond)
        
        */
        //faça um sistema com 10 alunos e suas respectivas notas com estrutura de repetição EM DO WHILE, invalidando notas incorretas:
         double nota = 0;
         int i = 1;
         Scanner leitor = new Scanner(System.in);
         
        do{
            do{
                System.out.println("Digite a nota do aluno"+i);
                nota = leitor.nextDouble();
                if((nota<0)||(nota>10)){System.out.println("ERRO" + "\n");}
                
            }while((nota<0) || (nota>10));
            System.out.println("A nota do aluno e:" + nota +"\n\n");
            i++;
            
        }while(i<=10);
        // TODO code application logic here
        
       
    }
    
}
