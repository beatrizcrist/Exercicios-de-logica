Algoritmo "idadeemdias"
// Disciplina   : [L�gica de Programa��o]
// Professor   : Obama
// Descri��o   : l� dia, mes e anos de idade do usuario e exibe quantod dias de vida ele tem
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Se��o de Declara��es das vari�veis 
 dias, meses, anos, idade: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite quantos anos de vida voc� possui:")
leia(anos)
escreval("Digite a quantidade de meses que passou do seu ultimo mesvers�rio:")
leia(meses)
escreval("Digite a quantidade de dias de vida voc� possui:")
leia(dias)

meses<-meses*30
anos<-anos*365

idade<-dias+meses+anos

escreval("Voc� tem ",idade," dias de vida")

Fimalgoritmo