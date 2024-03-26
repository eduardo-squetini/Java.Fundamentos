/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_a_objeto02;

/**
 *
 * @author Eduardo
 */
public class Aluno {
    private double A1;
    private double A2;
    private double A3;
    private String nome;
    private double media;
    
    //construtor - método
    
    public Aluno(){};
    
    public Aluno(String nome){
        this.nome=nome;
    }
    
    public Aluno(String nome,double A1,double A2,double A3){
        this.nome=nome;
        this.A1=A1;
        this.A2=A2;
        this.A3=A3;
    }

    //SET muda valores
    public void setA1(double A1) {
        if((A1>=0)&&(A1<=10)){
            this.A1 = A1;
        }
        Media();
        
    }
    
     private void Media(){
          this.media=(this.A1+this.A2+this.A3)/3;
      }
    
    
    
    
    
    
    
    
    
    
}
