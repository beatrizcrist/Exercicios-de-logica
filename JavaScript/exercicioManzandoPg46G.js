function fibonacci(){
    let contador = 1
    let numeroAtual = 1
    let numeroAtecessor = 0
    let soma = 0
    console.log(numeroAtual)
    while(contador < 15){
        soma = numeroAtual + numeroAtecessor
        console.log(soma)
        numeroAtecessor = numeroAtual
        numeroAtual = soma
        contador++
    }
}