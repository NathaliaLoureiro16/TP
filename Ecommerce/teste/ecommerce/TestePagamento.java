package ecommerce;

import org.junit.Assert;
import org.junit.Test;

public class TestePagamento {


	@Test
	public void deveCriarPagamento(){
		Pagamento pagamento = new Pagamento("Crebito");
		Assert.assertEquals("Crebito", pagamento.getPagamento());
		
	}

}
