package aula08_vetor01;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        
        //fazer um software que receba tres notas e faça a media aritmetica
        
        //Sem o vetor:
        /*double A1 = 0;
        double A2 = 0;
        double A3 = 0;
        double notaFinal = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite A1");
        A1 = leitor.nextDouble();
        System.out.println("Digite A2");
        A2 = leitor.nextDouble();
        System.out.println("Digite A3");
        A3 = leitor.nextDouble();
        notaFinal = 0.3*A1+0.3*A2+0.4*A3;
        System.out.println("Nota Final= " + notaFinal);*/
        //Vetor: Armazena mais de uma valor para um determinado tipo, sem precisar criar várias variáveis do mesmo tipo, mas com valores diferentes.
        //com o Vetor: definir tipo;definir nome; definir tamanho ou posições; Vetor sempre começa na posição 0;
        //for manipula as posições que eu desejo ler no vetor que nesse caso são: 0;1;2. A 3 é a nota final que eu preciso só printar.
        double[] notas = new double [4];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Digite A" + (i+1));
            notas[i] = leitor.nextDouble();
        }
        
        notas[3] = notas[0]*0.3+notas[1]*0.3+notas[2]*0.4;
        System.out.println("Nota Final= " + notas[3]);
        

    }
    
}
