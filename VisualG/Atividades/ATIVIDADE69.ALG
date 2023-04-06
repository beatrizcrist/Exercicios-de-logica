Algoritmo "atividade69"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : le o preço de produtos, e mostra o valor total dos produtos em estoque e a media dos precos dos produtos
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
   // Seção de Declarações das variáveis
   mercadorias, contador:inteiro
   media,preco, valorEstoque: real
   continuar: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   continuar<-"S"

   enquanto continuar = "S" faca
      escreval("Digite o preço da mercadoria:")
      leia(preco)

      escreval("MAIS MERCADORIAS (S/N)?")
      leia(continuar)

      contador<-contador+1
      valorEstoque<-valorEstoque+preco
      media<-valorEstoque/contador
   fimenquanto


   escreval("O valor total em estoque da empresa: R$",valorEstoque)
   escreval("A média de valor das mercadorias em estoque: R$",media)

Fimalgoritmo