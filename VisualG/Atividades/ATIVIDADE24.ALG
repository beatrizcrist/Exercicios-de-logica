Algoritmo "comissaoVendedor"
// Disciplina   : [L�gica de Programa��o com javaScript]
// Professor   : obama
// Descri��o   : L� o salario fixo e o valor de vendas, e mostra o salario com comissao
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Se��o de Declara��es das vari�veis
salarioFixo, valorVendas, salarioTotal, comissao: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Digite o valor do sal�rio fixo do vendedor:")
leia(salarioFixo)
escreval("Digite o valor total das vendas efetuadas pelo vendedor:")
leia(valorVendas)

comissao<-valorVendas * 0.03

se(valorVendas > 1500)entao
salarioTotal<-(((valorVendas-1500)*0.05)+(1500 * 0.03))+salarioFixo
escreval("O sal�rio total do vendedor com comiss�o inclusa �: ",salarioTotal)
senao
salarioTotal<-comissao+salarioFixo
escreval("O sal�rio total do vendedor com comiss�o inclusa �: ",salarioTotal)
fimse

Fimalgoritmo