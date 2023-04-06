Algoritmo "atividade39"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Beatriz
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis 
A, B, C: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
A<-"V"
B<-"V"
C<-"F"

se(A e B) ou (A xou B) entao
escreval("V ou F = V, porque a primeira parte já é verdadeira")
senao
se (A ou B) e (A e C) entao
escreval("V e F = F, porque a suegunda parte é falsa")
senao
se A  ou  C  e  B  xou  A  e não  B entao
escreval("V ou (F e V) xou (V e F) = V ou F xou F = V ou V = V, porque a primeira parte é verdadeira")
fimse

Fimalgoritmo
