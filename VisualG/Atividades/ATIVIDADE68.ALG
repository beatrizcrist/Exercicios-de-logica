Algoritmo "atividade68"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : le a quantidade de produtos em estoque a o pre�o de cada um, e mostra o valor total dos produtos em estoque e a media dos precos dos produtos
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
// Se��o de Declara��es das vari�veis 
mercadorias, contador:inteiro
media,preco, valorEstoque: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
    escreval("Digite a quantidade de mercadorias em estoque:")
    leia(mercadorias)
    
    para contador de 1 ate mercadorias faca
    escreval("Digite o pre�o da unidade da mercadoria ",contador," :")
    leia(preco)
    
    valorEstoque<-valorEstoque+preco
    
    media<-valorEstoque/mercadorias
    
    fimpara
    
    escreval("O valor total em estoque da empresa: R$",valorEstoque)
    escreval("A m�dia de valor das mercadorias em estoque: R$",media)

Fimalgoritmo