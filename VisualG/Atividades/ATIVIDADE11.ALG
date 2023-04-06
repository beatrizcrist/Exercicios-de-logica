Algoritmo "salarioVendedor"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : algoritmo que lê o número de  carros vendidos pelo vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
carrosVendidos, totalVendas, salarioFixo, comissao, salario:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o número de carros vendidos pelo(a) vendedor(a):")
leia(carrosVendidos)
escreval("Digite o valor total das vendas feitas pelo(a) vendedor(a):")
leia(totalVendas)
escreval("Digite o valor do salário fixo do(a) vendedor(a):")
leia(salarioFixo)
escreval("Digite o valor que o(a) vendedor(a) recebe por carro vendido:")
leia(comissao)

salario<-salarioFixo+carrosVendidos*comissao+totalVendas*5/100

escreval("O salário final do vendedor será: ",salario)

Fimalgoritmo