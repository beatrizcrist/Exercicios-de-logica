function exercicio57(){
    let contador=1
    do{
        alert(contador)
        contador++
    }while(contador !== 11)
}



function exercicio58(){
    let contador = 10
    while(contador >= 1){
        alert(contador)
        contador--
    }
}



function exercicio59(){
    let negativos = 0
    for(let contador = 1; contador <= 10; contador++){
        let valores = Number(prompt(`Digite o ${contador}° número`))

        if(valores < 0){
            negativos = negativos + 1
        }
    }

    alert(`Quatidade de valores negativos digitados: ${negativos}`)
}



function exercicio60(){
    let intervalo = 0
    let foraIntervalo = 0
    for(let contador = 1; contador <= 10; contador++){
        let valores = Number(prompt(`Digite o ${contador}° número`))

        if(valores >= 10 && valores <= 20){
            intervalo++
        } else{
            foraIntervalo++
        }
    }

    alert(`Números no intervalo de 10 a 20: ${intervalo}`)
    alert(`Números que não estão no intervalo de 10 a 20: ${intervalo}`)
}



function exercicio61(){
    let soma = 0, media 
    for(let contador = 1; contador <= 10; contador++){
        let valores = Number(prompt(`Digite o ${contador}° número`))
         
        soma = Number(soma + valores)
        media = soma / contador
    }

    alert(`Média aritimética dos valores: ${media}`)
}



function exercicio62(){
    let alunos = Number(prompt("Digite a quantidade de alunos da turma"))
    let soma = 0, media 
    
    for(let contador = 1; contador <= alunos; contador++){
        let notas = Number(prompt(`Digite a nota do ${contador}° aluno`))
        soma += notas
        media = soma / alunos
    }

    alert("A media de todas as notas dos alunos é: "+media)
}



function exercicio63(){
    let soma = 0
    for(let contador = 1; contador <= 10; contador++){
        let valores = Number(prompt(`Digite o ${contador}° número`))

        soma += valores
    }

    alert(`A soma dos 10 números lidos é ${soma}`)
}



function exercicio64(){
    let soma = 0
    for(let contador = 1; contador <= 10; contador++){
        let valores = Number(prompt(`Digite o ${contador}° número`))

        if(valores < 40){
            soma += valores
        }
    }

    alert(`A soma dos números inferiores a 40 é ${soma}`)
}



function exercicio65(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2 = Number(prompt("Digite o segundo valor"))
    let soma = 0

    for(let contador = valor1; contador <= valor2; contador++){
        soma += contador
    }

    alert(`A soma dos números existentes entre ${valor1} e ${valor2} é: ${soma}`)

}



function exercicio66(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2 = Number(prompt("Digite o segundo valor"))
    let soma = 0

    if(valor2 < valor1){
        for(let contador = valor2; contador <= valor1; contador++){
            soma += contador
        }
    } else{
        for(let contador = valor1; contador <= valor2; contador++){
            soma += contador
        }
    }

alert(`A soma dos números existentes entre ${valor1} e ${valor2} é: ${soma}`)
}



function exercicio67(){
    let soma = 0, media
    for(let contador = 15; contador <= 100; contador++){
        soma += contador
        media = soma / 85
    }

    alert(`A soma dos números existentes entre 15 e 100 é: ${soma}`)
    alert(`A média aritmética dos números existentes entre 15 e 100 é: ${media}`)


}



function exercicio68(){
    let mercadorias = Number(prompt("Digite a quantidade de mercadorias em estoque"))
    let valorEstoque = 0, media
    for(let contador = 1; contador <= mercadorias; contador++){
        let preco = Number(prompt(`Digite o preço da unidade da ${contador}° mercadoria`))

        valorEstoque += preco
        media = valorEstoque / mercadorias
    }

    alert(`O valor total em estoque da empresa: R$${valorEstoque}`)
    alert(`A média do valor das mercadorias em estoque: R$${media}`)
}



function exercicio69(){
    let continuar = "S"
    let valorEstoque = 0, contador = 0, media

    while(continuar == "S"){
        let preco = Number(prompt("Digite o preço da mercadoria"))

        continuar = prompt("MAIS MERCADORIAS (S/N)?")

        contador++
        valorEstoque += preco
        media = valorEstoque / contador
    }

    alert(`O valor total em estoque da empresa: R$${valorEstoque}`)
    alert(`A média do valor das mercadorias em estoque: R$${media}`)
}