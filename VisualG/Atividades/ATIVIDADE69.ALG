Algoritmo "atividade69"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : le o pre�o de produtos, e mostra o valor total dos produtos em estoque e a media dos precos dos produtos
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
   // Se��o de Declara��es das vari�veis
   mercadorias, contador:inteiro
   media,preco, valorEstoque: real
   continuar: caractere

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   continuar<-"S"

   enquanto continuar = "S" faca
      escreval("Digite o pre�o da mercadoria:")
      leia(preco)

      escreval("MAIS MERCADORIAS (S/N)?")
      leia(continuar)

      contador<-contador+1
      valorEstoque<-valorEstoque+preco
      media<-valorEstoque/contador
   fimenquanto


   escreval("O valor total em estoque da empresa: R$",valorEstoque)
   escreval("A m�dia de valor das mercadorias em estoque: R$",media)

Fimalgoritmo