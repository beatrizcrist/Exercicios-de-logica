Algoritmo "atividadeManzandoPg50J"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : mostra resultado inteiro da divisão de dois números
// Autor(a)    : Beatriz
// Data atual  : 03/04/2023
Var
// Seção de Declarações das variáveis 
divisor, dividendo, quociente:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreval("Digite um numero para se dividir:")
   leia(dividendo)
   escreval("Digite um numero para ser dividor:")
   leia(divisor)
   
   repita
   dividendo<-dividendo-divisor
   quociente<-quociente+1
   ate dividendo <= divisor
   
   escreval("O resultado inteiro da divisão é:", quociente)

Fimalgoritmo