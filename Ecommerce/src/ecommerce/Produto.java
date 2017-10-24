package ecommerce;

public class Produto {

	private String nome;

	private String descricao;

	private Double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		validarValorMaiorQueZero();
		

	}

	private void validarValorMaiorQueZero() {
		if(valor <= 0){
			throw new RuntimeException("Compra com valor 0");
		}
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
		
	}
	
	

}
