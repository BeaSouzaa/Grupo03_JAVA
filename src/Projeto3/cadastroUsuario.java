package Projeto3;
import java.util.Scanner;
public class cadastroUsuario {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nomeUsuario, cpfUsuario;
		int idadeUsuario;
		// Fazer a captura de informa��es do usu�rio
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras mai�sculas e min�sculas, sem s�mbolos ou n�meros)");	
		nomeUsuario = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idadeUsuario= leia.nextInt();
		System.out.println("Digite o seu CPF(Cadastro de Pessoas F�sicas): (Somente n�meros)");
		cpfUsuario = leia.next();
		
		System.out.println("\nNome: "+nomeUsuario);
		System.out.println("Idade: "+idadeUsuario+" anos");
		System.out.println("CPF: "+cpfUsuario);
		leia.close();
	}
}
