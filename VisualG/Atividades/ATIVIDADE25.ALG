Algoritmo "contaBancaria"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê o numero da conta, o saldo, o debito e o credito, e mostrar o saldo atual da conta e mostrar se é positivo e negativo
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Seção de Declarações das variáveis 
numeroConta, saldo, debito, credito, saldoAtual:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o número de sua conta:")
leia(numeroConta)
escreval("Digite o saldo disponivel em sua conta:")
leia(saldo)
escreval("Digite o valor que deseja debitar de sua conta:")
leia(debito)
escreval("Digite o valor que deseja creditar á sua conta:")
leia(credito)

saldoAtual<-saldo - debito + credito

escreval("O saldo aual disponivel em sua conta é: R$",saldoAtual)

se(saldoAtual >= 0) entao
escreval("Saldo Positivo!")
senao
escreval("Saldo Negativo!")
fimse

Fimalgoritmo