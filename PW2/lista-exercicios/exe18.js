function pares() {
    let numeros = ["11", "17", "44", "10", "8", "2", "12"];
    
    for (let i = 0; i < numeros.length; i++) {
        let numero = parseInt(numeros[i]); 

        if (numero % 2 === 0) {
            console.log(numero + " é par");
        } else {
            console.log(numero + " é ímpar");
        }
    }
}
pares(); 
