package aula02;

public class variaveis {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Variáveis: tipo identificador = valor;
        //Camel Case é o tipo de escrita do identificador meuInteiro
        int meuInteiro = 2;
        System.out.println(meuInteiro);
        
        meuInteiro = 5;
        
        System.out.println(meuInteiro);
        
        float meuReal = 2.5f;
        System.out.println(meuReal);
        
        //Letra ou 1 caracter
        char letra = 'A';
        
        // Tipo Lógico, condições: True or False
        boolean bool = false;
                
        //Inteiros
        byte b = 25; //8bits
        short s = 250;//16bits
        int i = 2500;//32bits
        long l = 2500L;//64bits
        
        //Ponto flutuante ou Reais
        float f = 2.7f;//32bits
       
        double d = 32.4; //64bits
        
        //Representação de cadeia de caracteres
        String str = "Minha String";
        
        int intA = 15;
        int intB  = 2;
        
        //soma:
        System.out.println(intA+intB);
        
        //multiplicação
        System.out.println(intA*intB);
        
        //divisão
        // ele não mostra ou ignora a casa decimal pq está no tipo inteiro
        System.out.println(intA/intB);
        
        //String com int fica tudo String
        System.out.println( intA +""+ intB);
               
        //resto da divisão ou mod
        System.out.println(intA%intB);
        
        //abreviação de operações exemplos
        i+=50; 
        
        System.out.println(i);
        
        i-=50;
       
        System.out.println(i);
        
        //Adicionar ou diminuir 1 no valor original
        i++;
        System.out.println(i);
        
        i--;
        System.out.println(i);
        
        //Comparação de valores <,>,<=,>=,==,!=(boolean - false or true)
        
       System.out.println(intA==intB);
       
       /*operadores lógicos de valores booleans: &&(AND)- duas condições válidas, || (OR)- apenas uma válida, 
       !(NOT)- nenhuma válida, ^(XOR) - exige exclusivamente um ou outro*/
       
       //condições prévias para executar o que vem depois
       
       
        int z = 15;
        
        z*=2;
        
        System.out.println(z==30);

        
        // TODO code application logic here
    }
    
}
