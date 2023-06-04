function exercicioA(){
    let quadrado = 0

    for(let contador = 15; contador <= 200; contador++){
        quadrado = contador * contador
        console.log(contador + "² = " + quadrado);
    }

}

function exercicioB(){
    let numero = Number(prompt("Digite um número:"))
    let tabuada = 0
    
    for(let contador = 0; contador <= 10; contador++){
        tabuada = numero*contador
        alert(numero+" X "+contador+" = "+tabuada)
    }
}

function exercicioC(){
    let soma = 0

    for(let contador = 0; contador <= 100; contador++){
        soma += contador
    }

    alert("A soma de 1 ate 100 é: "+soma)
}

function exercicioD(){
    let soma = 0

    for(let contador = 0; contador <= 500; contador++){
        if(contador % 2 == 0){
            soma += contador
        }
    }
   
   alert("A soma dos números pares de 1 até 500 é: "+soma)
}

function exercicioE(){
    for(let contador = 0; contador <= 20; contador++){
        if(contador % 2 !== 0){
            alert(contador)
        }
    }
}

function exercicioF(){
    for(let contador = 0; contador <= 200; contador++){
        if(contador % 4 == 0){
            alert(contador)
        }
    }
}

function exercicioG(){
    let numero = 3
    let potencia = 1
    alert("3 elevado a 0 = 1 ")

    for(let contador = 1; contador <= 15; contador++){
        potencia *= numero
        alert("3 elevado a "+contador+" = "+potencia)
    }

}

function exercicioH(){
    let base = Number(prompt("Digite o valor da base:"))
    let expoente = Number(prompt("Digite o valor do expoente:"))
    let potencia = 1

    for(let contador = 1; contador <= expoente; contador++){
        potencia = base * potencia
    }

   alert(base+" elevado a "+expoente+" é igual a "+potencia)
}

function exercicioI(){
   alert(1)
   let contador = 1
   let atual = 1
   let fibonacci = 0
   let anterior = 0 

   for(let contador = 1; contador <= 14; contador++){
       fibonacci = anterior + atual
       alert(fibonacci)
       anterior = atual
       atual = fibonacci
   }

}

function exercicioJ(){
    let fahrenheit = 0
    for(let celsius = 10; celsius <= 100; celsius++){
        fahrenheit = 1.8 * celsius + 32
        console.log(celsius+" graus celsius é igual a "+fahrenheit+" graus fahrenheit")
    }
}

function exercicioK(){
    let fatorial = 0;
    let numero = 0;
    let soma = 0;

    for (let contador = 1; contador <= 10; contador++) {
        if (contador % 2 !== 0) {
            fatorial = 1;
            numero = contador;

            for (numero = contador; numero >= 1; numero--) {
                fatorial *= numero;
            }

            alert(fatorial);

            soma += fatorial;
        }
    }

    alert("O somatório das fatoriais é: " + soma);

}