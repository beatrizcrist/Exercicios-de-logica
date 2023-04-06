Algoritmo "atividade34"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
// Seção de Declarações das variáveis 
x,y,z: real
resposta:caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o valor para x:")
leia(x)
escreval("Digite o valor para y:")
leia(y)

z<-(x*y) + 5

se(z <= 0)entao
resposta<-"A"
senao
se(z <= 100)entao
resposta<-"B"
senao
resposta<-"C"
fimse
fimse

escreval("Z = ",z,"   resposta = ",resposta)

Fimalgoritmo