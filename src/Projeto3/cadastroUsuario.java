package Projeto3;
import java.util.Scanner;
public class cadastroUsuario {
	public static void main(String[] args) {
		informacoesUsuario info = new informacoesUsuario();
		Scanner leia = new Scanner (System.in);
		// Fazer a captura de informações do usuário
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras maiúsculas e minúsculas, sem símbolos ou números)");	
		info.setNomeUsuario(leia.nextLine()) ;
		System.out.println("Digite a sua idade: ");
		info.setIdadeUsuario(leia.nextInt());
		System.out.println("Digite o seu CPF(Cadastro de Pessoas Físicas): (Somente números)");
		info.setCpfUsuario(leia.next()); 
		
		System.out.println("\nNome: "+info.getNomeUsuario());
		System.out.println("Idade: "+info.getIdadeUsuario()+" anos");
		System.out.println("CPF: "+info.getCpfUsuario());
		leia.close();
	}
}
