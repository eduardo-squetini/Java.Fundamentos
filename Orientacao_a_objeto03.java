/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacao_a_objeto03;

/**
 *
 * @author Eduardo
 */
public class POO_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Teste tst = new Teste();
        
        Teste tst2 = new Teste((double)5);
        
        Teste tst3 = new Teste((int)5.0);
        
        Teste tst4 = new Teste("5");
        
        Teste tst5 = new Teste("5.0");
        
        Teste tst6 = new Teste(1234567890); */
       
       Formas a  = new Formas(5);
       
       System.out.println(a.getArea());
       System.out.println(a.getPerimetro());
       System.out.println(a.getDefinicao());
       
        Formas b  = new Formas(5,1);
       
       System.out.println("\n" + b.getArea());
       System.out.println(b.getPerimetro());
       System.out.println(b.getDefinicao());
        
        
        
        
        // TODO code application logic here
    }
    
}
