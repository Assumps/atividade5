package br.unicamp.atividade4.maven;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
public class AnuncioBeanTests {
	@Test
	public void
	DeveCalcularOValorECasoODescontoFor1EquivaleAoAnuncioDeGraca() throws
	MalformedURLException {
		
		//Arrange
		ProdutoBean produto = new ProdutoBean("1", "iphone", "Apple", 2.000,
				"Sao paulo");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL Url1 = new URL("HTTPS", "unicamp.com.br", 443, "apple");
		fotosUrl.add(Url1);
		AnuncioBean anuncioTest = new AnuncioBean(produto, fotosUrl, 1.0);
		Double retornoEsperado = 0.0;
		
		//Act
		Double valorAnuncio = anuncioTest.getValor();
		
		//Assert
		Assert.assertEquals(retornoEsperado,valorAnuncio);
	}
	@Test
	public void
	DeveCalcularOValorECasoODescontoFor1EquivaleAoAnuncioSemDesconto() throws
	MalformedURLException {
		//Arrange
		ProdutoBean produto = new ProdutoBean("1", "iphone", "Apple", 2.000,
				"Sao paulo");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL Url1 = new URL("HTTPS", "unicamp.com.br", 443, "apple");
		fotosUrl.add(Url1);
		AnuncioBean anuncioTest = new AnuncioBean(produto, fotosUrl, 0.0);
		Double retornoEsperado = 2.000;
		
		//Act
		Double valorAnuncio = anuncioTest.getValor();
		
		//Assert
		Assert.assertEquals(retornoEsperado,valorAnuncio);
	}
}

