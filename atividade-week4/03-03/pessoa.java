package heranca;

public class pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public pessoa(String nome, String endereco, String telefone) {
		
		this.endereco = endereco ;
		this.nome = nome ;
		this.telefone = telefone ;
		
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
