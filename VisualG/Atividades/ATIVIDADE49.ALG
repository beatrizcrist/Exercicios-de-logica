Algoritmo "atividade49"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : Acrescenta uma mensagem 'NOVO C�LCULO(S/N)?' ao final do exerc�cio [48].
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Se��o de Declara��es das vari�veis
nota1, nota2, media: real
novo: caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Digite a nota da primeira avalia��o:")
leia(nota1)
escreval("Digite a nota da segunda avalia��o:")
leia(nota2)

enquanto (nota1 < 0) ou (nota2 < 0) ou (nota1 > 10) ou (nota2 > 10) faca
escreval("DIGITE SOMENTE VALORES V�LIDOS, ENTRE 0 E 10!")
escreval("Digite a nota da primeira avalia��o:")
leia(nota1)
escreval("Digite a nota da segunda avalia��o:")
leia(nota2)
fimenquanto

media<-(nota1+nota2)/2

escreval("A m�dia das duas notas tiradas nas avalia��es �:",media)

escreval("Novo calculo? (S/N)")
leia(novo)

se(novo = "S")entao
escreval("Digite a nota da primeira avalia��o:")
leia(nota1)
escreval("Digite a nota da segunda avalia��o:")
leia(nota2)

enquanto (nota1 < 0) ou (nota2 < 0) ou (nota1 > 10) ou (nota2 > 10) faca
escreval("DIGITE SOMENTE VALORES V�LIDOS, ENTRE 0 E 10!")
escreval("Digite a nota da primeira avalia��o:")
leia(nota1)
escreval("Digite a nota da segunda avalia��o:")
leia(nota2)
fimenquanto

media<-(nota1+nota2)/2

escreval("A m�dia das duas notas tiradas nas avalia��es �:",media)
senao
Escreval("Tchau tchau")
fimse

Fimalgoritmo