Algoritmo "atividade72"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê o codigo e o preco do produto, e mostra o maior preco e a media
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
// Seção de Declarações das variáveis 
codigo, contador: inteiro
media, soma, maior, preco:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    para contador de 1 ate 15 faca
    escreval("Digite o código do produto:")
    leia(codigo)
    escreval("Digite o preço do produto:")
    leia(preco)
    
    se preco > maior entao
    maior<-preco
    fimse
    
    soma<-soma+preco
    media<-soma/contador
    fimpara
    
    escreval("O maior preço digitado foi:",maior)
    escreval("A média dos preços digitados foi:",media)

Fimalgoritmo