Algoritmo "salarioNovo"
// Disciplina   : [Lógica de Programação]
// Professor   : Obama
// Descrição   : lê o salário mensal atual de um funcionário e o percentual de reajuste e exibir o valor do novo salário.
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Seção de Declarações das variáveis 
salarioAtual, salarioNovo, reajuste: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite seu salário atual:")
leia(salarioAtual)
escreval("Digite o porcentual de reajuste")
leia(reajuste)

salarioNovo<- salarioAtual-(-reajuste * salarioAtual)/100

escreval("Salário com reajuste: ",salarioNovo)

Fimalgoritmo