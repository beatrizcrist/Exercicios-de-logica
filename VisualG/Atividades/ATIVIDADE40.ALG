Algoritmo "atividade40"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� nome, preco por unidade e quantidades de produto, e mostra o total sem desconto, o desconto e o total a pagar pelo produto
// Autor(a)    : Beatriz
// Data atual  : 28/03/2023
Var
   // Se��o de Declara��es das vari�veis
   nome: caractere
   quantidade, preco, total, desconto,precoTotal: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite a descri��o ou o nome do produto:")
   leia(nome)
   escreval("Digite a quantidade adquirida:")
   leia(quantidade)
   escreval("Digite o pre�o unit�rio do produto:")
   leia(preco)

   total<-quantidade*preco

   se quantidade <= 5 entao
      desconto<-total*0.02
      precoTotal<-total-desconto
   senao
      se (quantidade > 5) e (quantidade <= 10)entao
         desconto<-total*0.03
         precoTotal<-total-desconto
      senao
         desconto<-total*0.05
         precoTotal<-total-desconto
      fimse
   fimse

   escreval("Nome e descri��o do produto:", nome)
   escreval("Total (sem desconto): R$",total)
   escreval("Desconto: R$",desconto)
   escreval("Total a pagar: R$",precoTotal)

Fimalgoritmo