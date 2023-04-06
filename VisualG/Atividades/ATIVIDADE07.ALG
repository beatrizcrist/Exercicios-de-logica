Algoritmo "idadeemdias"
// Disciplina   : [Lógica de Programação]
// Professor   : Obama
// Descrição   : lê dia, mes e anos de idade do usuario e exibe quantod dias de vida ele tem
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Seção de Declarações das variáveis 
 dias, meses, anos, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite quantos anos de vida você possui:")
leia(anos)
escreval("Digite a quantidade de meses que passou do seu ultimo mesversário:")
leia(meses)
escreval("Digite a quantidade de dias de vida você possui:")
leia(dias)

meses<-meses*30
anos<-anos*365

idade<-dias+meses+anos

escreval("Você tem ",idade," dias de vida")

Fimalgoritmo