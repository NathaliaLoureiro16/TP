package ecommerce;

import org.junit.Assert;
import org.junit.Test;

public class TesteProduto {

	@Test
	public void deveCriarProduto() {
		Produto produto = new Produto("PC", 1500);
		produto.setDescricao("Show do Milhão 1500");
		Assert.assertEquals("PC", produto.getNome());
		Assert.assertEquals(new Double(1500), produto.getValor());
		Assert.assertEquals("Show do Milhão 1500", produto.getDescricao());

	}

	@Test(expected = RuntimeException.class)
	public void deveVerificarProdutoValorMaiorQueZero() {
		new Produto("camisa", 0.00);

	}

}
