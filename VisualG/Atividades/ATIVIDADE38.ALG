Algoritmo "atividade38"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Se��o de Declara��es das vari�veis
   codigo,senha: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite o c�digo de usu�rio:")
   leia(codigo)

   se(codigo = 1234)entao
      escreval("Digite a senha de acesso:")
      leia(senha)
      se(senha = 9999)entao
         escreval("Acesso permitido")
      senao
         escreval("Senha incorreta!")
      fimse
   senao
      escreval("Usu�rio inv�lido!")
   fimse

Fimalgoritmo