package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Cliente cliente;

	private Fornecedor fornecedor;

	private Endereco endereco;

	private Pagamento pagamento;

	private String DataCompra;

	private String frete;

	private String total;

	private String itens;

	private List<Produto> produtos;

	public Compra(Cliente cliente, Fornecedor fornecedor, Endereco endereco, Pagamento pagamento, Produto produtos) {
		this.cliente = cliente;
		this.fornecedor = fornecedor;
		this.endereco = endereco;
		this.pagamento = pagamento;
		this.produtos = new ArrayList<>();
		validadorInformacoesObrigatorias();

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	public String getDataCompra() {
		return DataCompra;
	}

	public String getFrete() {
		return frete;
	}

	public String getTotal() {
		return total;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void validadorInformacoesObrigatorias() {
		if (cliente == null || fornecedor == null) {
			throw new RuntimeException("informaçoes Obrigatorias");
		}

	}
}