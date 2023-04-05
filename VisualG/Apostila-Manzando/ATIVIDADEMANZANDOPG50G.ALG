Algoritmo "AtividadeManzandoPg50G"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : mostra o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10
// Autor(a)    : Beatriz
// Data atual  : 03/04/2023
Var
// Seção de Declarações das variáveis 
contador, numero, fatorial:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

    repita
    contador<-contador+1
    se contador mod 2 <> 0 entao
    fatorial <- 1
      para numero de contador ate 1 passo -1 faca
        fatorial <- fatorial * numero
      fimpara
      escreval("Fatorial de ", contador, " = ", fatorial)
    fimse
    contador<-contador+1
    ate contador = 10

Fimalgoritmo