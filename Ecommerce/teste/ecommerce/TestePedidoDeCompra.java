package ecommerce;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;


public class TestePedidoDeCompra {

	@Test
	public void deveCriarPedidoDeCompra() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Contato contato = new Contato("fulano@javamail.com", "55517070-6070");
		Endereco endereco = new Endereco("Av ipiranga", "Jardim Botanico", "Residencial", "91000", cidade);
		Fornecedor fornecedor = new Fornecedor("0202558", "javaneixon", "852025", "987456", endereco, contato);
		Calendar nascimento = Calendar.getInstance();
		nascimento.add(Calendar.YEAR, -10);
		Cliente cliente = new Cliente("Java da Silva", "000.123.456-00", contato, nascimento, endereco);
		Pagamento pagamento = new Pagamento("Crebito");
		Produto produto = new Produto("Camisa", 80.00);
		Compra compra = new Compra(cliente, fornecedor, endereco, pagamento,produto);
		
		Assert.assertEquals(cliente, compra.getCliente());
		Assert.assertEquals(fornecedor, compra.getFornecedor());
		Assert.assertEquals(endereco, compra.getEndereco());
		Assert.assertEquals(pagamento, compra.getPagamento());
		Assert.assertEquals(produto, compra.getProdutos());
		
	}
	

}
