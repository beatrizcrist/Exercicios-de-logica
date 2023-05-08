function podeVotar(){
    let mostrar = document.getElementById('mostra')
    let mostrar1 = document.getElementById('mostra1')
    let anoAtual = document.getElementById("anoAtual").value
    let anoNascimento = document.getElementById("anoNascimento").value

    let idade = Number(anoAtual - anoNascimento)

    mostrar.innerHTML = "Você tem "+idade+" anos"
    if(idade < 16){
        mostrar1.innerHTML = "Você ainda não pode votar"
    } else{
        mostrar1.innerHTML = "Você já pode votar"
    }

}