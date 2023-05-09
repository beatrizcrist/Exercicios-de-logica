function celsius(){
    let celsius = 10;
    let fahrenheit = 0
    while(celsius <= 100){
        fahrenheit = (9 * celsius + 160) / 5
        console.log(celsius+"° graus celsius = " +fahrenheit+"° graus fahrenheit")
        celsius+=10
    }
}