package Projeto3;
import java.util.Scanner;
public class cadastroUsuario {
	public static void main(String[] args) {
		informacoesUsuario info = new informacoesUsuario();
		Scanner leia = new Scanner (System.in);
		// Fazer a captura de informa��es do usu�rio
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras mai�sculas e min�sculas, sem s�mbolos ou n�meros)");	
		info.setNomeUsuario(leia.nextLine()) ;
		System.out.println("Digite a sua idade: ");
		info.setIdadeUsuario(leia.nextInt());
		System.out.println("Digite o seu CPF(Cadastro de Pessoas F�sicas): (Somente n�meros)");
		info.setCpfUsuario(leia.next()); 
		
		System.out.println("\nNome: "+info.getNomeUsuario());
		System.out.println("Idade: "+info.getIdadeUsuario()+" anos");
		System.out.println("CPF: "+info.getCpfUsuario());
		leia.close();
	}
}
