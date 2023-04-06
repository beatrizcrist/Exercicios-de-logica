Algoritmo "atividade40"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê nome, preco por unidade e quantidades de produto, e mostra o total sem desconto, o desconto e o total a pagar pelo produto
// Autor(a)    : Beatriz
// Data atual  : 28/03/2023
Var
   // Seção de Declarações das variáveis
   nome: caractere
   quantidade, preco, total, desconto,precoTotal: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite a descrição ou o nome do produto:")
   leia(nome)
   escreval("Digite a quantidade adquirida:")
   leia(quantidade)
   escreval("Digite o preço unitário do produto:")
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

   escreval("Nome e descrição do produto:", nome)
   escreval("Total (sem desconto): R$",total)
   escreval("Desconto: R$",desconto)
   escreval("Total a pagar: R$",precoTotal)

Fimalgoritmo