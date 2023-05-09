function mediaPares(){
    let contador = 50
    let soma = 0;
    let pares = 0
    // while(contador <= 70){
    //     soma += contador
    //     media = soma / 11 
    //     contador += 2
    // } 

    while(contador <= 70){
        if(contador%2==0){
            soma += contador
            pares++
        }
        contador++
    }
    let media = soma / pares
    
    document.getElementById("mostra").innerHTML= "A soma dos valores pares de 50 ate 70 é "+soma+"<br> A média dos números é "+media
}