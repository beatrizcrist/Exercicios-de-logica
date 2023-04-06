Algoritmo "votaOuNao"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê o ano atual e a data de nascimeto, calcula a idade e diz se a pessoa pode ou não votar
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
anoAtual, anoNascimento, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite em que ano estamos agora: ")
leia(anoAtual)
escreval("Digite em que ano você nasceu: ")
leia(anoNascimento)

idade<-anoAtual-anoNascimento

se(idade >= 16)entao
escreval("Você já pode votar, certifique-se de possuir título de eleitor!")
senao
escreval("Você ainda não pode votar.")
fimse

Fimalgoritmo