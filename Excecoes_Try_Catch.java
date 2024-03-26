package excecoes_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Exceções: Erros que podem travar o programa, porém ao manipulá-los com TRY  e CATCH, faz com que o programa continue rodando e o problema seja resolvido.
        ERRO: STRING AO INVÉS DE INTEIRO "InputMismatchException"
        TRY: Bloco a ser testado, que poderá ou não ocorrer o erro
        CATCH: Resposta do programa ou implementação para "consertar" o erro*/ 
        
        Scanner in = new Scanner(System.in);
		Estudante aluno1 = new Estudante();

		System.out.println("Digite o nome do aluno");
		aluno1.setNome(in.nextLine());

		while (true) {
			try {
				System.out.println("Digite a nota da A1");
				aluno1.setA1(in.nextDouble());
				break;

			} catch (InputMismatchException exception) {
				in.next();
				System.out.println("Entrada inválida");
			}
		}

		while (true) {
			try {
				System.out.println("Digite a nota da A2");
				aluno1.setA2(in.nextDouble());
				break;

			} catch (InputMismatchException exception) {
				in.next();
				System.out.println("Entrada inválida");
			}
		}

		while (true) {
			try {
				System.out.println("Digite a nota da A3");
				aluno1.setA3(in.nextDouble());
				break;

			} catch (InputMismatchException exception) {
				in.next();
				System.out.println("Entrada inválida");
			}
		}
		System.out.println("A média final do aluno " + aluno1.getNome() + " é: " + aluno1.calcularMediaFinal());

	}
}
    
    

