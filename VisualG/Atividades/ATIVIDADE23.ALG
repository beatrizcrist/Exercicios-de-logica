Algoritmo "pesoideal"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
   // Seção de Declarações das variáveis
   nome, sexo: caractere
   altura, pesoIdeal:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o seu nome: ")
   leia(nome)
   escreval("Digite sua altura: ")
   leia(altura)
   escreval("Digite o seu sexo (F para feminino e M para masculino): ")
   leia(sexo)

   se(sexo = "M")entao
      pesoIdeal<- (72.7 * altura) - 58
      escreval(nome," seu peso ideal é",pesoIdeal)
   senao
      pesoIdeal<- (62.1 * altura) - 44.7
      escreval(nome," seu peso ideal é",pesoIdeal)
   fimse

Fimalgoritmo