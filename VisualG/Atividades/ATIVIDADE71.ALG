Algoritmo "atividade71"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� a quantidade de n�meros a serem lidos e mostra quel deles � o maior e a media deles
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
// Se��o de Declara��es das vari�veis 
valores, soma, quantidade, contador, maior: inteiro
 media:real
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
     escreval("Digite a quatidade de n�meros a serem lidos:")
     leia(quantidade)
     
     para contador de 1 ate quantidade faca
     escreval("Digite o",contador,"� n�mero:")
     leia(valores)
     
     se valores > maior entao
     maior<-valores
     fimse
     
     soma<-soma+valores
     media<-soma/quantidade
     fimpara
     
     escreval("O maior n�mero digitado foi:",maior)
     escreval("A m�dia dos n�meros digitado foi:",media)

Fimalgoritmo