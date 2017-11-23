import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Contato> contatos = new ArrayList<>();
		
		Contato c = new Contato();
		
		do{
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Atualizar Contato");
			System.out.println("3 - Pesquisar por nome");
			System.out.println("4 - Pesquisar por email");
			System.out.println("5 - Pesquisar por telefone");
			System.out.println("6 - Listar todos");
			System.out.println("7 - Deletar");
			System.out.println("0 - Sair");
			System.out.println("Digite sua opção");
			opcao = ler.nextInt();
			
			switch(opcao){
			case 1:
				c.setNome(c.getNome());
				c.setEmail(c.getEmail());
				c.setTelefone(c.getTelefone()); 
				contatos.add(c);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("Digite o nome do contato a ser atualizado");
				String nomeAtu = ler.nextLine();
				if(c.getNome().equals(nomeAtu)){
					c.setNome(c.getNome());
					c.setEmail(c.getEmail());
					c.setTelefone(c.getTelefone()); 
					contatos.add(c);
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("Digite o nome");
				String nome = ler.nextLine();
				for (int i = 0;i < contatos.size();i++){
					if(contatos.get(i).getNome().equals(nome)){
						System.out.println("Nome: " + c.getNome());
						System.out.println("Email: " + c.getEmail());
						System.out.println("Telefone: " + c.getTelefone());
					}
					
				}
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("Digite o email");
				String email = ler.nextLine();
				for (int i = 0;i < contatos.size();i++){
					if(contatos.get(i).getEmail().equals(email)){
						System.out.println("Nome: " + c.getNome());
						System.out.println("Email: " + c.getEmail());
						System.out.println("Telefone: " + c.getTelefone());
					}
					
				}
				break;
				
			case 5:
				ler.nextLine();
				System.out.println("Digite o telefone");
				String telefone = ler.nextLine();
				for (int i = 0;i < contatos.size();i++){
					if(contatos.get(i).getTelefone().equals(telefone)){
						System.out.println("Nome: " + c.getNome());
						System.out.println("Email: " + c.getEmail());
						System.out.println("Telefone: " + c.getTelefone());
					}
					
				}
				break;
				
			case 6:
				for (int i = 0; i < contatos.size();i++){
					System.out.println("Nome: " + c.getNome());
					System.out.println("Email: " + c.getEmail());
					System.out.println("Telefone: " + c.getTelefone());
				}
				break;
			
			case 7:
				ler.nextLine();
				System.out.println("Digite o nome do contato a ser excluido");
				String nomeDel = ler.nextLine();
				for (int i = 0;i < contatos.size();i++){
					if(contatos.get(i).getNome().equals(nomeDel)){
						contatos.remove(i);
					}
				}
				System.out.println("Contato removido");
				break;
			}
		}while(opcao != 0);

	}

}
