function maiorQueDez(){
    let numero = document.getElementById("numero").value
    if(numero > 10){
        document.getElementById('mostra').innerHTML = "Numero maior que 10!"
    } else if(numero == 10){
        document.getElementById('mostra').innerHTML = "Numero igual a 10!"
    } else{
        document.getElementById('mostra').innerHTML = "Numero menor que 10!"
    }
}