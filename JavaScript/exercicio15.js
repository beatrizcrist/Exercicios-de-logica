function positivoNegativo(){
    let valor = document.getElementById("valor").value

    if(valor < 0){
        document.getElementById("mostra").innerHTML = "Valor negativo!"
    } else if(valor == 0){
        document.getElementById("mostra").innerHTML = "Valor igual a zero!"
    } else{
        document.getElementById("mostra").innerHTML = "Valor positivo!"
    }
}