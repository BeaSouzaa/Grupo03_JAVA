package Projeto3;
import java.util.Scanner;
public class cadastroUsuario {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nomeUsuario, cpfUsuario;
		int idadeUsuario;
		// Fazer a captura de informações do usuário
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras maiúsculas e minúsculas, sem símbolos ou números)");	
		nomeUsuario = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idadeUsuario= leia.nextInt();
		System.out.println("Digite o seu CPF(Cadastro de Pessoas Físicas): (Somente números)");
		cpfUsuario = leia.next();
		
		System.out.println("\nNome: "+nomeUsuario);
		System.out.println("Idade: "+idadeUsuario+" anos");
		System.out.println("CPF: "+cpfUsuario);
		leia.close();
	}
}
