Algoritmo "atividade68"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : le a quantidade de produtos em estoque a o preço de cada um, e mostra o valor total dos produtos em estoque e a media dos precos dos produtos
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
// Seção de Declarações das variáveis 
mercadorias, contador:inteiro
media,preco, valorEstoque: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    escreval("Digite a quantidade de mercadorias em estoque:")
    leia(mercadorias)
    
    para contador de 1 ate mercadorias faca
    escreval("Digite o preço da unidade da mercadoria ",contador," :")
    leia(preco)
    
    valorEstoque<-valorEstoque+preco
    
    media<-valorEstoque/mercadorias
    
    fimpara
    
    escreval("O valor total em estoque da empresa: R$",valorEstoque)
    escreval("A média de valor das mercadorias em estoque: R$",media)

Fimalgoritmo