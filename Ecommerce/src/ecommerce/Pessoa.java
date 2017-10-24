package ecommerce;

public abstract class Pessoa {
	
	private Contato contato;

	public Pessoa(Contato contato) {
		this.contato = contato;
	}

	public Contato getContato() {
		return contato;
	}

}
