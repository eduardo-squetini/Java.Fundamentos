import java.util.Scanner;

public class Introducao {

    public static void main(String[] args) {
        exibirMensagemDeBoasVindas();
        exibirEntradaDoUsuario();
    }

    private static void exibirMensagemDeBoasVindas() {
        int numero = 5;
        String texto = "aula inicial";
        
        System.out.println("Hello world");
        System.out.println(numero + " " + texto);
    }

    private static void exibirEntradaDoUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite algo");
            String entrada = scanner.nextLine();
            
            System.out.println("Você digitou: " + entrada);
        }
    }
}
