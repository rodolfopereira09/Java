package Testes;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ValidaMenuFormularioTest {
	
	ValidaMenuFormularioPage ValidaMenu = new ValidaMenuFormularioPage();
	
	
	@Dado("^que eu esteja no site do Bruno$")
	public void que_eu_esteja_no_site_do_Bruno() throws Throwable {
		ValidaMenu.abrirsite();
	}

	@Dado("^acesse a pagina de formulario$")
	public void acesse_a_pagina_de_formulario() throws Throwable {
		ValidaMenu.paginaformulario();
	}

	@Quando("^eu clico no botao Criar$")
	public void eu_clico_no_botao_Criar() throws Throwable {
		ValidaMenu.botaocriar();
	   
	}

	@Então("^o site retorna mensagem com os campos obrigatorios a serem preenchidos$")
	public void o_site_retorna_mensagem_com_os_campos_obrigatorios_a_serem_preenchidos() throws Throwable {
		ValidaMenu.validaobrigatoriedadecampos("3 errors proibiu que este usuário fosse salvo:");
	}

	@Quando("^eu clico no botao Voltar$")
	public void eu_clico_no_botao_Voltar() throws Throwable {
		ValidaMenu.botaovoltar();
	}

	@Então("^o site retorna para a pagina home do site$")
	public void o_site_retorna_para_a_pagina_home_do_site() throws Throwable {
		ValidaMenu.validapaginahome("Bem vindo ao Site de Automação do Batista.");
	}

	@Quando("^eu preencho os campos do formulario$")
	public void eu_preencho_os_campos_do_formulario() throws Throwable {
		ValidaMenu.preencheformulario("Rodolfo", "Pereira", "teste@gmail.com");
	}

	@Então("^o usuario e cadastrado com sucesso$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {
		ValidaMenu.validausuariocadastrado("Usuário Criado com sucesso");
	}

	@Dado("^que eu tenha finalizado o cadastro$")
	public void que_eu_tenha_finalizado_o_cadastro() throws Throwable {
		ValidaMenu.abrirsite();
		ValidaMenu.paginaformulario();
		ValidaMenu.preencheformulario("Paulo", "Joao", "teste@teste.com.br");
		ValidaMenu.botaocriar();
	}

	@Quando("^eu clico no botao editar$")
	public void eu_clico_no_botao_editar() throws Throwable {
		ValidaMenu.botaoeditar();
	}

	@Então("^o site retorna para a tela de formulario/cadastro$")
	public void o_site_retorna_para_a_tela_de_formulario_cadastro() throws Throwable {
		ValidaMenu.validapaginaformulario("Lista de Funcionalidades");
	}

	@Quando("^eu acesso pagina de lista de usuarios$")
	public void eu_acesso_pagina_de_lista_de_usuarios() throws Throwable {
		ValidaMenu.paginalistarusuario();
	}

	@Quando("^clico na pesquisa de usuario$")
	public void clico_na_pesquisa_de_usuario() throws Throwable {
		ValidaMenu.botaopesquisalistauser();
	}

	@Então("^o site retonar o usuario pesquisado$")
	public void o_site_retonar_o_usuario_pesquisado() throws Throwable {
		ValidaMenu.botaopesquisalistauser();
	}

	@Quando("^eu acesso a pagina de lista de usuarios$")
	public void eu_acesso_a_pagina_de_lista_de_usuarios() throws Throwable {
	    
	}

	@Quando("^clico na lixeira de exclusao$")
	public void clico_na_lixeira_de_exclusao() throws Throwable {
	   
	}

	@Então("^o site exibe janela com mensagem confirmando a exclusao$")
	public void o_site_exibe_janela_com_mensagem_confirmando_a_exclusao() throws Throwable {
	    
	}	

}
