package Projeto3;
import java.util.Scanner;
import java.util.ArrayList;
public class cadastroUsuario {
	public static void main(String[] args) {
		informacoesUsuario info = new informacoesUsuario();
		Scanner leia = new Scanner (System.in);
		ArrayList<String> lista = new ArrayList<String>();
		int resposta;
			    lista.add("\nAciclovir");
		        lista.add("\nÁcido valpróico");
		        lista.add("\nAlbendazol");
		        lista.add("\nAmitriptilina");
		        lista.add("\nAmoxicilina");
		        lista.add("\nAnlodipino");
		        lista.add("\nBenzilpenicilina benzatina");
		        lista.add("\nBenzilpenicilina procaína + benzilpenicilina potássica");
		        lista.add("\nBiperideno");
		        lista.add("\nCaptopril");
		        lista.add("\nCarbamazepina");
		        lista.add("\nCarbonato de Lítio");
		        lista.add("\nCefalexina");
		        lista.add("\nClomipramina");
		        lista.add("\nClonazepam");
		        lista.add("\nClorpromazina");
		        lista.add("\nDexametasona");
		        lista.add("\nDiazepam");
		        lista.add("\nDigoxina");
		        lista.add("\nDipirona");
		        lista.add("\nEnalapril");
		        lista.add("\nFenitoína");
		        lista.add("\nFenobarbital");
		        lista.add("\nFurosemida");
		        lista.add("\nFluoxetina");
		        lista.add("\nGlibenclamida");
		        lista.add("\nHaloperidol");
		        lista.add("\nHidroclorotiaziada");
		        lista.add("\nHidróxido de Alumínio");
		        lista.add("\nIbuprofeno");
		        lista.add("\nLoratadina");
		        lista.add("\nMetformina");
		        lista.add("\nMetildopa");
		        lista.add("\nMetronidazol");
		        lista.add("\nMiconazol");
		        lista.add("\nNitrofutantoína");
		        lista.add("\nOmeprazol");
		        lista.add("\nParacetamol");
		        lista.add("\nPrometazina");
		        lista.add("\nPropranolol");
		        lista.add("\nRivotril");
		        lista.add("\nSais para reidratação oral");
		        lista.add("\nSalbutamol");
		        lista.add("\nSertralina");
		        lista.add("\nSulfanetoxazol + Trimetroprima");
		        lista.add("\nSertralina");
		// Fazer a captura de informações do usuário
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras maiúsculas e minúsculas, sem símbolos ou números)");	
		info.setNomeUsuario(leia.nextLine()) ;
		System.out.println("Digite a sua idade: ");
		info.setIdadeUsuario(leia.nextInt());
		
		System.out.println("Digite o seu CPF(Cadastro de Pessoas Físicas): (Somente números)");
		info.setCpfUsuario(leia.next());
		 while(cpfUsuario.length() != 11) {
		        	
		        	System.out.println("Por favor, digite o CPF corretamente");
		        
		        	System.out.println("Digite o seu CPF(Cadastro de Pessoas Físicas):"  + "\n(Somente números)");
			        cpfUsuario = leia.next();
			        
			      		        
		        }
		       
		
		System.out.println("\nNome: "+info.getNomeUsuario());
		System.out.println("Idade: "+info.getIdadeUsuario()+" anos");
		System.out.println("CPF: "+info.getCpfUsuario());
		
		System.out.println("\nOs remédios disponíveis são: ");
		        
		System.out.println(lista);
		        
		System.out.println("\n\nSeu remédio encontra-se na lista?"
		+ "\n(Caso sim digite 1, caso não digite 2) ");
		resposta = leia.nextInt();
		
		leia.close();
	}
}
