Algoritmo "pesoideal"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
   // Se��o de Declara��es das vari�veis
   nome, sexo: caractere
   altura, pesoIdeal:real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite o seu nome: ")
   leia(nome)
   escreval("Digite sua altura: ")
   leia(altura)
   escreval("Digite o seu sexo (F para feminino e M para masculino): ")
   leia(sexo)

   se(sexo = "M")entao
      pesoIdeal<- (72.7 * altura) - 58
      escreval(nome," seu peso ideal �",pesoIdeal)
   senao
      pesoIdeal<- (62.1 * altura) - 44.7
      escreval(nome," seu peso ideal �",pesoIdeal)
   fimse

Fimalgoritmo