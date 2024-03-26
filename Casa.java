package orientacao_a_objeto_01;

/*
public: se refere ao tipo de acesso(publico)
class: se refere que a implementação é uma abstração(classe)
Casa: nome da classe
- o nome do arquivo deve ser o mesmo da classe
*/

public class Casa {
    
    //atributos - são as características
    //private: acesso exclusivo interno à classe - encapsulamento - só o dono pode mexer.
    private String porta = "sem descricao";
    private String corPorta;
    private int numPortas;
    
    //teste
    public double alturaTeto;
    
    //metodos acessores - get e set: permitem acesso
    /*
    public: acesso publico
    String: tipo de retorno
    getPorta: nome do metodo
    (): local dos argumentos de entrada
    return: comando que indica o valor de saída do método
    this: indica que o atributo indicado é desta classe
    */
    
    public String getPorta(){
        return this.porta;
    }
    
    /*
    public: acesso
    void: tipo de retorno (retorno nada)
    setPorta: nome do metodo
    String descricao: indica que o argumento de entrada é uma string chamada descricao
    */
    
    public void setPorta(String descricao){
        this.porta = descricao;
    }
}
