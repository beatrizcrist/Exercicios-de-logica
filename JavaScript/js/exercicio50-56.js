function exercicio50(){
    for(let contador = 1; contador <= 10; contador++){
        alert(contador)
    }
}



function exercicio51(){
    for(let contador = 10; contador >= 1; contador--){
        alert(contador)
    }
}



function exercicio52(){
    for(let contador = 100; contador <= 110; contador++){
        alert(contador)
    }
}



function exercicio53(){
    let valor = Number(prompt("Digite um valor"))
    for(let contador = 1; contador <= valor; contador++){
        alert(contador)
    }
}



function exercicio54(){
    let valor = Number(prompt("Digite um valor"))

    while(valor <= 0){
        alert("VALOR INVÁLIDO!")
        valor = Number(prompt("Digite um valor"))
    }

    for(let contador = 1; contador <= valor; contador++){
        alert(contador)
    }
}



function exercicio55(){
    for(let contador = 1; contador <= 10; contador++){
        alert(`8 * ${contador} = ${8 * contador}`) 
    }
}



function exercicio56(){
    let valor = Number(prompt("Digite um valor"))

    while(valor < 0 || valor > 10){
        alert("VALOR INVÁLIDO!")
        valor = Number(prompt("Digite um valor"))
    }

    for(let contador = 1; contador <= 10; contador++){
        alert(`${valor} * ${contador} = ${valor * contador}`) 
    }
}