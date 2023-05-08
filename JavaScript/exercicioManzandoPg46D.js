function impares(){
    let contador = 0

    while(contador <= 20){
        if(contador%2 != 0){
            alert(contador)
            document.getElementById(`${contador}`).innerHTML = contador
        }
        contador++
    }
}