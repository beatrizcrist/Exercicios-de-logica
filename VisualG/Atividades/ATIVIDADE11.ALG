Algoritmo "salarioVendedor"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : algoritmo que l� o n�mero de  carros vendidos pelo vendedor, o valor total de suas vendas, o sal�rio fixo e o valor que ele recebe por carro vendido
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Se��o de Declara��es das vari�veis 
carrosVendidos, totalVendas, salarioFixo, comissao, salario:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite o n�mero de carros vendidos pelo(a) vendedor(a):")
leia(carrosVendidos)
escreval("Digite o valor total das vendas feitas pelo(a) vendedor(a):")
leia(totalVendas)
escreval("Digite o valor do sal�rio fixo do(a) vendedor(a):")
leia(salarioFixo)
escreval("Digite o valor que o(a) vendedor(a) recebe por carro vendido:")
leia(comissao)

salario<-salarioFixo+carrosVendidos*comissao+totalVendas*5/100

escreval("O sal�rio final do vendedor ser�: ",salario)

Fimalgoritmo