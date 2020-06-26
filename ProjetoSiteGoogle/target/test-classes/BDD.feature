# language: pt

Funcionalidade: Eu Como usuário da Internet gostaria de realizar uma pesquisa no Google
								Para encontrar o quero

@teste1
Cenário:  Pesquisa escola E2E
 Dado que eu esteja no Google 
 Quando eu informo o nome pesquisado
 Então minha pesquisa retorna com sucesso 

 @teste2
Cenário:  Pesquisa carro Ferrari
 Dado que eu esteja no Google
 Quando eu informo o nome  do carro a ser pesquisado
 Então minha pesquisa retorna a pesuisa do carro com sucesso