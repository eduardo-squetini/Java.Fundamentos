import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer número:");

        // Lê o número digitado pelo usuário
        int number = scanner.nextInt();

        // A instrução 'if' verifica se uma condição é verdadeira
        // Neste caso, verifica se o número digitado pelo usuário é maior que 10
        if (number > 10) {
            System.out.println("O número é maior que 10.");
        }
        // A instrução 'else' define o que acontece se a condição do 'if' não for verdadeira
        // Neste caso, se o número não for maior que 10, este bloco de código será executado
        else {
            System.out.println("O número não é maior que 10.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

