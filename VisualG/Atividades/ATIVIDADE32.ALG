Algoritmo "atividade32"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê o nome de dois times e o numero de gols marcados, e diz quem ganhou ou se deu empate
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
// Seção de Declarações das variáveis 
time1, time2: caractere
golsTime1, golsTime2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o nome do time 1: ")
leia(time1)
escreval("Digite o nome do time 2: ")
leia(time2)
escreval("Digite quantos gols o primeiro time marcou: ")
leia(golsTime1)
escreval("Digite quantos gols o segundo time marcou: ")
leia(golsTime2)

se(golsTime1 = golsTime2)entao
escreval("O jogo deu EMPATE!")
senao
se(golsTime1 > golsTime2)entao
escreval("O time vencedor é o ",time1)
senao
escreval("O time vencedor é o ",time2)
fimse
fimse

Fimalgoritmo