package ecommerce;

import org.junit.Assert;
import org.junit.Test;

import ecommerce.Cidade;
import ecommerce.Contato;
import ecommerce.Endereco;
import ecommerce.Estado;
import ecommerce.Fornecedor;

public class TesteFornecedor {

	@Test
	public void deveCriarFornecedor() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Contato contato = new Contato("fulano@javamail.com", "55517070-6070");
		Endereco endereco = new Endereco("Av ipiranga","Jardim Botanico","Residencial", "91000",cidade);
		Fornecedor fornecedor = new Fornecedor("0202558", "javaneixon", "852025", "987456", endereco, contato);
		Assert.assertEquals("0202558", fornecedor.getRazaoSocial());
		Assert.assertEquals("javaneixon", fornecedor.getNomeFantasia());
		Assert.assertEquals("852025", fornecedor.getCnpj());
		Assert.assertEquals("987456", fornecedor.getInscricaoEstadual());
		Assert.assertEquals(endereco, fornecedor.getEndereco());
		Assert.assertEquals(contato, fornecedor.getContato());
		

	}

}
