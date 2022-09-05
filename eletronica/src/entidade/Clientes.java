package entidade;


 
public class Clientes {
	
	  private int cod_cliente;
	  private String nome;
	  private String endereco;
	  private int telefone;
	  private Equipamento equipamento;
	  
	  public Clientes(int cod_cliente, String nome, String endereco, int telefone, Equipamento equipamento) {
		  this.cod_cliente = cod_cliente;
		  this.nome = nome;
		  this.endereco = endereco;
		  this.telefone = telefone;
		  this.equipamento = equipamento;
	  }
	  public Clientes( String nome, String endereco, int telefone) {
		  this.nome = nome;
		  this.endereco = endereco;
		  this.telefone = telefone;
	  } 
		

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	 

}
