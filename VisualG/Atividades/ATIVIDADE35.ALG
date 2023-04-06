Algoritmo "atividade35"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê quantos litros de combustivel forakm vendidos, qual tipo de combustivel e mostra o preço que o cliente deve pagar
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Seção de Declarações das variáveis
   litros, desconto, alcool, gasolina, total: real
   combustivel: caractere


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Quantos litros de combustivel foram vendidos: ")
   leia(litros)
   escreval("Tipo de combustivel vendido (A para álcool ou G para gasolina):")
   leia(combustivel)

   alcool<-2.90
   gasolina <- 3.30
   
   se(combustivel = "A")entao
      se(litros <= 20)entao
         desconto<-alcool*0.03
         total<-(alcool * litros) - (desconto * litros)
         escreval("O total a ser pago pelo combustivel é: ",total)
      senao
         desconto<-alcool*0.05
         total<-(alcool * litros) - (desconto * litros)
         escreval("O total a ser pago pelo combustivel é: ",total)
      fimse

   senao
      se(litros <= 20)entao
         desconto<-gasolina*0.04
         total<-(gasolina * litros) - (desconto * litros)
         escreval("O total a ser pago pelo combustivel é: ",total)
      senao
         desconto<-gasolina*0.06
         total<-(gasolina * litros) - (desconto * litros)
         escreval("O total a ser pago pelo combustivel é: ",total)
      fimse

   fimse

Fimalgoritmo
