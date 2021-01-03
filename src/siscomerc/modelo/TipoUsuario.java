package siscomerc.modelo;

public enum TipoUsuario {
	
	ADMINISTRADOR("Administrador"),
	GERERENTE("Gerente"),
	ESTOQUISTA("Estoquista"),
	CAIXA("Caixa");
	
	private String label;
	
	
	private TipoUsuario(String label){
		this.label = label;
	}
		
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}



	
	

}
