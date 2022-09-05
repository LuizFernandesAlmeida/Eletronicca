package entidade;

public class Orcamento {
	
	private int num_orcamento;
	private String diagnostico_defeito;
	private int valor_conserto;
	private int aprovacao_client;
	private int data_entrega;
	private int cod_equipamento;
	
	public Orcamento(int num_orcamento, String diagnostico_defeito, int valor_conserto, int aprovacao_cliente, int data_entrega, int cod_equipamento) {
		
		this.num_orcamento = num_orcamento;
		this.diagnostico_defeito = diagnostico_defeito;
		this.valor_conserto = valor_conserto;
		this.aprovacao_client = aprovacao_cliente;
		this.data_entrega = data_entrega;
		this.cod_equipamento = cod_equipamento;
	}

	public int getNum_orcamento() {
		return num_orcamento;
	}

	public void setNum_orcamento(int num_orcamento) {
		this.num_orcamento = num_orcamento;
	}

	public String getDiagnostico_defeito() {
		return diagnostico_defeito;
	}

	public void setDiagnostico_defeito(String diagnostico_defeito) {
		this.diagnostico_defeito = diagnostico_defeito;
	}

	public int getValor_conserto() {
		return valor_conserto;
	}

	public void setValor_conserto(int valor_conserto) {
		this.valor_conserto = valor_conserto;
	}

	public int getAprovacao_client() {
		return aprovacao_client;
	}

	public void setAprovacao_client(int aprovacao_client) {
		this.aprovacao_client = aprovacao_client;
	}

	public int getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(int data_entrega) {
		this.data_entrega = data_entrega;
	}

	public int getCod_equipamento() {
		return cod_equipamento;
	}

	public void setCod_equipamento(int cod_equipamento) {
		this.cod_equipamento = cod_equipamento;
	}
	
	

}
