package Testes;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ValidaPesquisaTest {
	
	ValidaPesquisaPage ValidaPesquisa = new ValidaPesquisaPage();

	@Dado("^que eu esteja no Google$")
	public void que_eu_esteja_no_Google() throws Throwable {
	ValidaPesquisa.abrirsite();
	}

	// Pesquisa Escola 
	
	@Quando("^eu informo o nome pesquisado$")
	public void eu_informo_o_nome_pesquisado() throws Throwable {
		ValidaPesquisa.pesquisaescola();
	}

	@Então("^minha pesquisa retorna com sucesso$")
	public void minha_pesquisa_retorna_com_sucesso() throws Throwable {
		ValidaPesquisa.validapesquisaescola();
	}
	
	// Pesquisa Carro 
	@Quando("^eu informo o nome  do carro a ser pesquisado$")
	public void eu_informo_o_nome_do_carro_a_ser_pesquisado() throws Throwable {
		ValidaPesquisa.pesquisacarro();
	}

	@Então("^minha pesquisa retorna a pesuisa do carro com sucesso$")
	public void minha_pesquisa_retorna_a_pesuisa_do_carro_com_sucesso() throws Throwable {
		ValidaPesquisa.validapesquisacarro();
	}

}

