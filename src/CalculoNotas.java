import java.util.Scanner;

public class CalculoNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o nome do Aluno(a):");
		String nome=teclado.nextLine();
		
		System.out.println("Informe a 1ª Nota:");
		int nota1=teclado.nextInt();
		System.out.println("Informe a 2ª Nota:");
		int nota2=teclado.nextInt();
		
		int media=(nota1+nota2)/2;
		
		if(media<=5) {
			System.out.println("O Aluno(a) "+nome+", obteve a média de "+media+" e está REPROVADO!");
		}else {
			System.out.println("O Aluno(a) "+nome+", obteve a média de "+media+" e está APROVADO!");
			
		teclado.close();
		
		}
	}
}
