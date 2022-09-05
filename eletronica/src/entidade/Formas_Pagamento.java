package entidade;

public class Formas_Pagamento {
	
	private int forma_pagamento;
	private String opcao;
	
	
	public Formas_Pagamento(int forma_pagamento, String opcao) {
		this.forma_pagamento = forma_pagamento;
		this.opcao = opcao;
	}

	public int getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(int forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}
	

}
