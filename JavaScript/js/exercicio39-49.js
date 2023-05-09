function exercicio39(){
    let A = "V"
    let B = "V"
    let C = "F"

    if((A && B) || (A || B)){
        alert("V ou F = V, porque a primeira parte já é verdadeira")
    } else if((A || B) && (A && C)){
        alert("V e F = F, porque a suegunda parte é falsa")
    } else{
        if(A || C && B || A && B){
            alert("V ou (F e V) xou (V e F) = V ou F xou F = V ou V = V, porque a primeira parte é verdadeira")
        }
    }
}



function exercicio40(){
    let nome = prompt("Digite a descrição ou o nome do produto")
    let quantidade = Number(prompt("Digite a quantidade adquirida"))
    let preco = Number(prompt("Digite o preço unitário do produto"))
    let total, desconto, precoTotal = 0

    total = quantidade * preco

    if(quantidade <= 5){
        desconto = total*0.02
        precoTotal = total-desconto
    } else if(quantidade > 5 && quantidade <= 10){
        desconto = total*0.03
        precoTotal = total-desconto
    } else{
        desconto = total*0.05
        precoTotal = total-desconto
    }

    alert(`Nome e descrição do produto: ${nome}`)
    alert(`Total (sem desconto): R$${total}`)
    alert(`Desconto: R$${desconto}`)
    alert(`Total a pagar: R$${precoTotal}`)
}



function exercicio41(){
    let nota1 = Number(prompt("Digite a primeira nota"))
    let nota2 = Number(prompt("Digite a segunda nota"))
    let nota3 = Number(prompt("Digite a terceira nota"))
    let mediaExercicio = Number(prompt("Digite a média dos exercícios que fazem parte da avaliação:"))
    
    let mediaAproveitamento = (((nota1+nota2)*2)+(nota3*3)+mediaExercicio)/7

    alert(`Média de aproveitamento: ${mediaAproveitamento}`)

    if(mediaAproveitamento >= 9){
        alert("O conceito do aluno é A")
    } else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0){
        alert("O conceito do aluno é B")
    } else if(mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5){
        alert("O conceito do aluno é C")
    } else{
        alert("O conceito do aluno é D")
    }
}



function exercicio42(){
    let codigo = Number(prompt("Digite o número do empregado (código):"))
    let anoNAscimento = Number(prompt("Digite o ano de nascimento do empregado:"))
    let anoEmpresa = Number(prompt("Digite o ano que o empregado ingresou na empresa:"))
    let idade = 2023 - anoNAscimento
    let tempoTrabalho = 2023 - anoEmpresa

    alert(`A idade do funcionário: ${idade} anos`)
    alert(`Tempo de trabalho do colaborador: ${tempoTrabalho} anos`)

    if(idade > 65 || tempoTrabalho > 30 || (idade > 60 && tempoTrabalho > 25)){
        alert("Requerer aposentadoria!")
    } else{
        alert("Não requerer aposentadoria!")
    }
}



function exercicio43(){
    let a = Number(prompt("Digite um valor para a"))
    let b = Number(prompt("Digite um valor para b"))
    let c = Number(prompt("Digite um valor para c"))
    let mens

    if(a < b+c && b < a+c && c < a+b){
        if(a == b && b == c){
            mens = "Triângulo Equilátero"
        } else if(a==b || b==c || a==c){
            mens = "Triângulo Isósceles"
        } else{
            mens = "Triângulo Escaleno"
        }
    } else{
        mens = "Não é possível formar um triângulo"
    }

    alert(mens)
}



function exercicio44(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2

    do{
    valor2 = Number(prompt("Digite o segundo valor"))
    }while(valor2 == 0)
    
    let divisao = valor1 / valor2

    alert(`A divisão de ${valor1} por ${valor2} é: ${divisao}`)
}



function exercicio45(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2 = 0

    while(valor2 == 0){
        valor2 = Number(prompt("Digite o segundo valor"))
    }
    
    let divisao = valor1 / valor2

    alert(`A divisão de ${valor1} por ${valor2} é: ${divisao}`)
}



function exercicio46(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2 = Number(prompt("Digite o segundo valor"))

    if(valor2 == 0){
        do{
        alert("VALOR INVÁLIDO!")
        valor2 = Number(prompt("Digite o segundo valor"))
        }while(valor2 == 0)
    }
    
    let divisao = valor1 / valor2

    alert(`A divisão de ${valor1} por ${valor2} é: ${divisao}`)
}



function exercicio47(){
    let valor1 = Number(prompt("Digite o primeiro valor"))
    let valor2 = Number(prompt("Digite o segundo valor"))

    if(valor2 == 0){
        while(valor2 == 0){
            alert("VALOR INVÁLIDO!")
            valor2 = Number(prompt("Digite o segundo valor"))
        }
    }
    
    let divisao = valor1 / valor2

    alert(`A divisão de ${valor1} por ${valor2} é: ${divisao}`)
}



function exercicio48(){
    let nota1 = Number(prompt("Digite a nota da primeira avaliação:"))
    let nota2 = Number(prompt("Digite a nota da segunda avaliação:"))

    while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10){
        alert("DIGITE SOMENTE VALORES VÁLIDOS, ENTRE 0 E 10!")
        nota1 = Number(prompt("Digite a nota da primeira avaliação:"))
        nota2 = Number(prompt("Digite a nota da segunda avaliação:"))
    }

    let media = (nota1 + nota2) / 2

    alert("A média das notas é: "+media)
}



function exercicio49(){
    let novo = "S"

    while(novo == "S"){

        let nota1 = Number(prompt("Digite a nota da primeira avaliação:"))
        let nota2 = Number(prompt("Digite a nota da segunda avaliação:"))
    
        while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10){
            alert("DIGITE SOMENTE VALORES VÁLIDOS, ENTRE 0 E 10!")
            nota1 = Number(prompt("Digite a nota da primeira avaliação:"))
            nota2 = Number(prompt("Digite a nota da segunda avaliação:"))
        }
    
        let media = (nota1 + nota2) / 2
    
        alert("A média das notas é: "+media)

        novo = prompt("Novo calculo? (S/N)")
    }

    alert("Tchau Tchau")
}