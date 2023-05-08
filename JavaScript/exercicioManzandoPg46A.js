function tabuada(){
    let valor = parseInt(document.getElementById("valor").value)
    // let mostra = document.getElementById("mostra")
    let contador = 1;
    
    while(contador <= 10){
        let tabuada = valor * contador
        document.getElementById(`${contador}`).innerHTML = valor+" X "+contador+" = "+tabuada+"<br>"
        contador++
    }
}