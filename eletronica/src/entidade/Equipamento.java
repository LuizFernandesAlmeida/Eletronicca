package entidade;

public class Equipamento {

	
	private int cod_equipamento;
	private int data_entrada;
	private String fabricante;
	private int imei;
	private String defeito_relatado;
	private int cod_cliente;
	private int cod_pagamento;
	
	public Equipamento(int cod_equipamento,int data_entrada, String fabricante, int imei, String defeito_relatado, int cod_cliente, int cod_pagamento ) {
		this.cod_equipamento = cod_equipamento;
		this.data_entrada = data_entrada;
		this.fabricante = fabricante;
		this.imei = imei;
		this.defeito_relatado = defeito_relatado;
		this.cod_cliente = cod_cliente;
		this.cod_pagamento = cod_pagamento;
	}

	public int getCod_equipamento() {
		return cod_equipamento;
	}

	public void setCod_equipamento(int cod_equipamento) {
		this.cod_equipamento = cod_equipamento;
	}

	public int getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(int data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getDefeito_relatado() {
		return defeito_relatado;
	}

	public void setDefeito_relatado(String defeito_relatado) {
		this.defeito_relatado = defeito_relatado;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCod_pagamento() {
		return cod_pagamento;
	}

	public void setCod_pagamento(int cod_pagamento) {
		this.cod_pagamento = cod_pagamento;
	}
	
}
