Algoritmo "contaBancaria"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : L� o numero da conta, o saldo, o debito e o credito, e mostrar o saldo atual da conta e mostrar se � positivo e negativo
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Se��o de Declara��es das vari�veis 
numeroConta, saldo, debito, credito, saldoAtual:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite o n�mero de sua conta:")
leia(numeroConta)
escreval("Digite o saldo disponivel em sua conta:")
leia(saldo)
escreval("Digite o valor que deseja debitar de sua conta:")
leia(debito)
escreval("Digite o valor que deseja creditar � sua conta:")
leia(credito)

saldoAtual<-saldo - debito + credito

escreval("O saldo aual disponivel em sua conta �: R$",saldoAtual)

se(saldoAtual >= 0) entao
escreval("Saldo Positivo!")
senao
escreval("Saldo Negativo!")
fimse

Fimalgoritmo