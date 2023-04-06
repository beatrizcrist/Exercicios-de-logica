Algoritmo "xadrez"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê a hora de início e a hora de fim de um jogo de Xadrez e mostra quanto tempoo jogo durou
// Autor(a)    : Beatriz
// Data atual  : 20/03/2023
Var
// Seção de Declarações das variáveis 
horaInicio, horaFim, duracao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a hora que foi iniciado o jogo de xadrez:")
leia(horaInicio)
escreval("Digite a hora que terminou o jogo de xadrez:")
leia(horaFim)

se(horaFim <= horaInicio) entao
duracao<- 24 - horaInicio + horaFim
escreval("O jogo de xadrez durou ",duracao," horas")
senao
duracao<- horaFim - horaInicio
escreval("O jogo de xadrez durou ",duracao," horas")
fimse

Fimalgoritmo