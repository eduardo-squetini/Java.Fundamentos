/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_a_objeto03;

/**
 *
 * @author Eduardo
 */
public class Formas {
    
    private double area;
    private double perimetro;
    private String forma;
   
    
    
    public Formas (double raio){
        setArea(raio);
        setPerimetro(raio);
        setDefinicao(raio);
    }
    
    public Formas (double base,double altura){
        setArea(base,altura);
        setPerimetro(base,altura);
        setDefinicao(base,altura);
    }
    
    public void setArea(double raio){
        this.area = Math.PI+raio*raio;
    }
    
     public void setArea(double base,double altura){
        this.area = base*altura;
    }
    
    public void setPerimetro(double raio){
        this.perimetro = 2*Math.PI*raio;
    }
    
    public void setPerimetro(double base,double altura){
        this.perimetro = (2*base) + (2*altura);
    }
    
    public void setFormas(double raio){
        setArea(raio);
        setPerimetro(raio);
        setDefinicao(raio);
    }
    
     public void setFormas(double base,double altura){
        setArea(base,altura);
        setPerimetro(base,altura);
        setDefinicao(base,altura);
    }
    
    public void setDefinicao(double raio){
        this.forma= "circulo";
    }
    
     public void setDefinicao(double base,double altura){
        this.forma= "retangulo";
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public String getDefinicao() {
        return this.forma;
    }
    
    
    
    
    
    
    
}
