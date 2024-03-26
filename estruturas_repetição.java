package aula06_estruturas_repetição;
import java.util.Scanner;

public class estruturas_repetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //laços de repetição: while, do while, for
        
        // while - testa e executa a condição enquanto ela for verdadeira, infinitamente. Testa e executa até a condição for falsa.
        
        // while - testa primeiro e depois executa
        // do while - executa primeiro e depois testa a condiçao
        
        
        int a = 0;
        
        while(a < 20){
            System.out.println(a); //inicia printando com 0
            a = a + 1; // soma +1 ao valor anterior
            //nesse caso o programa rodará até 19
        }
        
        
        
        int b = 200;
        
        do{
            System.out.println(b);
            b*=2;
        }while (b <=20);
        
        //do faz primeiro e depois testa e aqui ele viu que o b não atende a condicao então apenas printa o 200
        
        
        
        for(double r = 1; r <= 256; r*=2){
            System.out.println(r);
        }
        
        
            
            //for: declaração da variavel, teste da condicao e o incremento da variavel no parenteses
            
            
            Scanner leitor = new Scanner(System.in);
            
            boolean querFechar = false;
            
            while(true){
                System.out.println("digite um numero(-1para sair)");
                int z = leitor.nextInt();
                
                if(z==-1){
                break;
                }else{
                    System.out.println(z*3);
                }
            }
            
            System.out.println("Programa fechando");
        
        
        
                
        
        
        // TODO code application logic here
    }
    
}
