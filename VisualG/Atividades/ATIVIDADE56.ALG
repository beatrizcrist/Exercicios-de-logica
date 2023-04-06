Algoritmo "atividade56"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : obama
// Descrição   : lê um valor de 1 ate 10 e mostra a tabuada dele
// Autor(a)    : Beatriz
// Data atual  : 30/03/2023
Var
// Seção de Declarações das variáveis 
valor, tabuada, contador: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("-----TABUADA-----")
escreval("Digite um múmero:")
leia(valor)

se (valor < 0) ou (valor > 10)entao
escreval("NÚMERO INVÁLIDO, digite apenas números entre 1 e 10")
escreval("Digite um múmero:")
leia(valor)
fimse

para contador de 1 ate 10 faca
tabuada<-valor*contador
escreval(valor," X ",contador," = ",tabuada)
fimpara

Fimalgoritmo