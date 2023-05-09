function mes(){
    let mes = parseInt(document.getElementById("mes").value)
    let mostra = document.getElementById("mostra")

    switch(mes){
        case 1:
            mostra.innerHTML = "Janeiro";
            break;
        case 2:
            mostra.innerHTML = "Fevereiro";
            break;
        case 3:
            mostra.innerHTML = "Março";
            break;
        case 4:
            mostra.innerHTML = "Abril";
            break;
        case 5:
            mostra.innerHTML = "Maio";
            break;
        case 6:
            mostra.innerHTML = "Junho";
            break;
        case 7:
            mostra.innerHTML = "Julho";
            break;
        case 8:
            mostra.innerHTML = "Agosto";
            break;
        case 9:
            mostra.innerHTML = "Setembro";
            break;
        case 10:
            mostra.innerHTML = "Outubro";
            break;
        case 11:
            mostra.innerHTML = "Novembro";
            break;
        case 12:
            mostra.innerHTML = "Dezembro";
            break;
        default:
            mostra.innerHTML = "O número digitado não corresponde a nenhum mês do ano"
            break;
    }
}