Algoritmo "comissaoVendedor"
// Disciplina   : [Lógica de Programação com javaScript]
// Professor   : obama
// Descrição   : Lê o salario fixo e o valor de vendas, e mostra o salario com comissao
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Seção de Declarações das variáveis
salarioFixo, valorVendas, salarioTotal, comissao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Digite o valor do salário fixo do vendedor:")
leia(salarioFixo)
escreval("Digite o valor total das vendas efetuadas pelo vendedor:")
leia(valorVendas)

comissao<-valorVendas * 0.03

se(valorVendas > 1500)entao
salarioTotal<-(((valorVendas-1500)*0.05)+(1500 * 0.03))+salarioFixo
escreval("O salário total do vendedor com comissão inclusa é: ",salarioTotal)
senao
salarioTotal<-comissao+salarioFixo
escreval("O salário total do vendedor com comissão inclusa é: ",salarioTotal)
fimse

Fimalgoritmo