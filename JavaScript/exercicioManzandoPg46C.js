function somaPares(){
    let contador = 2
    let soma = 0
    while(contador <= 500){
        soma += contador
        contador +=2
    }

    // while(contador <= 500){
    //     if(contador%2==0){
    //         soma += contador
    //     }
    //     contador++
    // }

    document.getElementById("mostra").innerHTML = `A soma dos número pares de 1 ate 500 é ${soma}`
}