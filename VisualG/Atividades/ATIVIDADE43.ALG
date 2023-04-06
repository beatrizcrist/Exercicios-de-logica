Algoritmo "atividade43"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê valores a, b e c e mostra que tivo de triangulo pode ser, ou se nao pode ser um triangulo
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
   // Seção de Declarações das variáveis
   a, b, c: real
   mens: caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("-----QUE TIPO DE TRIÂNGULO É?-----")
   escreval("Digite um valor para a:")
   leia(a)
   escreval("Digite um valor para b:")
   leia(b)
   escreval("Digite um valor para c:")
   leia(c)

   se(a < b+c) e (b < a+c) e (c < a+b)então
      se(a=b) e (b=c)então
         mens<-"Triângulo Equilátero"
      senão
         se(a=b) ou (b=c) ou (a=c)então
            mens<-"Triângulo Isósceles"
         senao
            mens<-"Triângulo Escaleno"
         fimse
      fimse

   senao
      mens<-"Não é possível formar um triângulo"
   fimse

   escreval(mens)


   //1-nao é possivel
   //2-escaleno
   //3- nao tem
   //4- equilatero
   //5-isosceles
Fimalgoritmo