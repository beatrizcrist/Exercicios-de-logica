Algoritmo "salarioNovo"
// Disciplina   : [L�gica de Programa��o]
// Professor   : Obama
// Descri��o   : l� o sal�rio mensal atual de um funcion�rio e o percentual de reajuste e exibir o valor do novo sal�rio.
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Se��o de Declara��es das vari�veis 
salarioAtual, salarioNovo, reajuste: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite seu sal�rio atual:")
leia(salarioAtual)
escreval("Digite o porcentual de reajuste")
leia(reajuste)

salarioNovo<- salarioAtual-(-reajuste * salarioAtual)/100

escreval("Sal�rio com reajuste: ",salarioNovo)

Fimalgoritmo