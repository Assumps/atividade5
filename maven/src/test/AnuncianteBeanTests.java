package br.unicamp.atividade4.maven;

import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
public class AnuncianteBeanTests {

	public void
	DeveRetornarMediaIgualAZeroParaAnunciosComTodosOsAnunciosComCemPorcentoDeDesconto() throws MalformedURLException {
		//Arrange
		ProdutoBean produto1 = new ProdutoBean("1", "iphone13", "Apple",
				2.000, "Sao paulo");
		ProdutoBean produto2 = new ProdutoBean("1", "iphone14", "Apple",
				3.000, "Sao paulo");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL Url1 = new URL("HTTPS", "unicamp.com.br", 443, "apple");
		fotosUrl.add(Url1);
		AnuncioBean anuncio1 = new AnuncioBean();
		anuncio1.setProduto(produto1);
		anuncio1.setFotosUrl(fotosUrl);
		anuncio1.setDesconto(1.0);
		AnuncioBean anuncio2 = new AnuncioBean();
		anuncio1.setProduto(produto2);
		anuncio1.setFotosUrl(fotosUrl);
		anuncio1.setDesconto(1.0);
		AnuncianteBean anunciante1 = new AnuncianteBean();
		anunciante1.setNome("Joao");
		anunciante1.setCPF("487.695.888.21");
		anunciante1.addAnuncio(anuncio1);
		anunciante1.addAnuncio(anuncio2);
		Double valorEsperado = 0.0;
		//Act
		Double retornoValorMedioAnuncios = anunciante1.valorMedioAnuncios();
		//Assert
		Assert.assertEquals(valorEsperado,retornoValorMedioAnuncios);
	}
	@Test
	public void
	DeveRetornarMediaIgualADoisMilEQuinhentosParaAnunciosSemDescontoNesteCasoEs
	pecifico() throws MalformedURLException {
		//Arrange
		ProdutoBean produto1 = new ProdutoBean("1", "iphone13", "Apple",
				2.000, "Sao paulo");
		ProdutoBean produto2 = new ProdutoBean("1", "iphone14", "Apple",
				3.000, "Sao paulo");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL Url1 = new URL("HTTPS", "unicamp.com.br", 443, "apple");
		fotosUrl.add(Url1);
		AnuncioBean anuncio1 = new AnuncioBean();
		anuncio1.setProduto(produto1);
		anuncio1.setFotosUrl(fotosUrl);
		anuncio1.setDesconto(0.0);
		AnuncioBean anuncio2 = new AnuncioBean();
		anuncio2.setProduto(produto2);
		anuncio2.setFotosUrl(fotosUrl);
		anuncio2.setDesconto(0.0);
		AnuncianteBean anunciante1 = new AnuncianteBean();
		anunciante1.setNome("Joao");
		anunciante1.setCPF("487.695.888.21");
		anunciante1.addAnuncio(anuncio1);
		anunciante1.addAnuncio(anuncio2);
		Double valorEsperado = 2.500;
		//Act
		Double retornoValorMedioAnuncios = anunciante1.valorMedioAnuncios();
		//Assert
		Assert.assertEquals(valorEsperado,retornoValorMedioAnuncios);
	}
}
