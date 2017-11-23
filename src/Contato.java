import java.util.Scanner;

public class Contato {
	private String nome;
	private String email;
	private String telefone;
	
	Scanner ler = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("Digite o nome");
		this.nome = ler.nextLine();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Digite o email");
		this.email = ler.nextLine();
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		System.out.println("Digite o telefone");
		this.telefone = ler.nextLine();
	}
	
	
}
