Algoritmo "votaOuNao"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : L� o ano atual e a data de nascimeto, calcula a idade e diz se a pessoa pode ou n�o votar
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Se��o de Declara��es das vari�veis 
anoAtual, anoNascimento, idade: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite em que ano estamos agora: ")
leia(anoAtual)
escreval("Digite em que ano voc� nasceu: ")
leia(anoNascimento)

idade<-anoAtual-anoNascimento

se(idade >= 16)entao
escreval("Voc� j� pode votar, certifique-se de possuir t�tulo de eleitor!")
senao
escreval("Voc� ainda n�o pode votar.")
fimse

Fimalgoritmo