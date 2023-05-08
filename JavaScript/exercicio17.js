function media(){
    let nota1 = Number(prompt("Digite a primeira nota:"))
    let nota2 = Number(prompt("Digite a segunda nota:"))

    let media = (nota1 + nota2) / 2

    alert("A média das duas notas é: "+media)

    document.getElementById("mostra").innerHTML = "Nota 1: "+nota1
    document.getElementById("mostra1").innerHTML = "Nota 2: "+nota2
    document.getElementById("mostra2").innerHTML = "Media: "+media

    if(media > 6){
        alert("Aluno aprovado")
       document.getElementById("mostra3").innerHTML = "Aluno aprovado" 
    } else{
        alert("Aluno reprovado")
        document.getElementById("mostra3").innerHTML = "Aluno reprovado"
    }

    document.querySelector("#btn").innerHTML = "Calcular outra média"
    
}