# language: pt
Funcionalidade: Validar Menu Formulario.

  @teste1
  Cenario: Validar obrigatoriedade dos campos.
    Dado que eu esteja no site do Bruno
    E acesse a pagina de formulario 
    Quando eu clico no botao Criar
    Então o site retorna mensagem com os campos obrigatorios a serem preenchidos

  @teste2
  Cenario: Validar botao Voltar.
    Dado que eu esteja no site do Bruno
    E acesse a pagina de formulario
    Quando eu clico no botao Voltar
    Então o site retorna para a pagina home do site

  @teste3
  Cenario: Validar criacao de um novo usuario.
    Dado que eu esteja no site do Bruno
    E acesse a pagina de formulario
    Quando eu preencho os campos do formulario
    E eu clico no botao Criar
    Então o usuario e cadastrado com sucesso

  @teste4
  Cenario: Validar botao de editar logo apos criacao usuario
    Dado que eu tenha finalizado o cadastro
    Quando eu clico no botao editar
    Então o site retorna para a tela de formulario/cadastro

  @teste5
  Cenario: Validar pesquisa de usuario.
    Dado que eu esteja no site do Bruno
    Quando eu acesso pagina de lista de usuarios
    E clico na pesquisa de usuario
    Então o site retonar o usuario pesquisado

  @teste6
  Cenario: Validar excluir usuario.
    Dado que eu esteja no site do Bruno
    Quando eu acesso a pagina de lista de usuarios
    E clico na lixeira de exclusao
    Então o site exibe janela com mensagem confirmando a exclusao
