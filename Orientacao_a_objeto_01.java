package orientacao_a_objeto_01;

public class POO_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*1º Casa: Tipo da classe
        minhaCasa: objeto, instancia
        new: criar instancias 
        2º Casa(): construtor
        */
        Casa minha1Casa = new Casa();
        
      //minhaCasa.numPortas = 2; não é possível o acesso pois é privado
        minha1Casa.alturaTeto = 3.0; //possível porque é público - efeito colateral
        
        /*
        minhaCasa: é o objeto
        setPorta é o método dentro da minhaCasa
        ("grande") é o valor passado para o setPorta
        ------ todo método precisa dos () - parenteses
        ------ todo atributo não precisa de () - parenteses
        */
        minha1Casa.setPorta("grande");
        System.out.println(minha1Casa.alturaTeto);
        System.out.println(minha1Casa.getPorta());
        
        Casa minha2Casa = new Casa();
        System.out.println(minha2Casa.alturaTeto);
        System.out.println(minha2Casa.getPorta());
        
    }
    
}
