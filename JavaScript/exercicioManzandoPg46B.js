function somaInteiros(){
    let contador = 1
    let soma = 0
    
    while(contador <= 100){
      soma = Number(soma + contador)
      contador++
    } 

    document.getElementById("mostra").innerHTML="O resultado da soma dos números inteiro de 1 ate 100 é "+soma
}