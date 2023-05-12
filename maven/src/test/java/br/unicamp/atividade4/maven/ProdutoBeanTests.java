package br.unicamp.atividade4.maven;

import org.junit.Assert;
import org.junit.Test;



public class ProdutoBeanTests {

	@Test
	public void
	DeveRetornarMenosUmSeOValorDoProdutoPassadoForMaiorQueOInstanciado(){
		//Arrange
		ProdutoBean produto1 = new ProdutoBean("1", "iphone13", "Apple",
				2.000, "Sao paulo");
		ProdutoBean produto2 = new ProdutoBean("1", "iphone14", "Apple",
				3.000, "Sao paulo");
		//Act
		int retornoCompareTo = produto1.compareTo(produto2);
		//Assert
		Assert.assertEquals(-1,retornoCompareTo);
	}
	@Test
	public void
	DeveRetornarUmSeOValorDoProdutoPassadoForMenorQueOInstanciado(){
		//Arrange
		ProdutoBean produto1 = new ProdutoBean("1", "iphone13", "Apple",
				4.000, "Sao paulo");
		ProdutoBean produto2 = new ProdutoBean("1", "iphone14", "Apple",
				3.000, "Sao paulo");
		//Act
		int retornoCompareTo = produto1.compareTo(produto2);
		//Assert
		Assert.assertEquals(1,retornoCompareTo);
	}
	@Test
	public void
	DeveRetornarZeroSeOValorDoProdutoPassadoForIgualQueOInstanciado(){
		//Arrange
		ProdutoBean produto1 = new ProdutoBean("1", "iphone13", "Apple",
				4.000, "Sao paulo");
		ProdutoBean produto2 = new ProdutoBean("1", "iphone14", "Apple",
				4.000, "Sao paulo");
		//Act
		int retornoCompareTo = produto1.compareTo(produto2);
		//Assert
		Assert.assertEquals(0,retornoCompareTo);
	}

}
