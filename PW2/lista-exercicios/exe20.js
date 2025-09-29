const numeros = [];

for (let i = 0; i < 10; i++) {
  const numeroAleatorio = Math.floor(Math.random() * 100) + 1;
  numeros.push(numeroAleatorio);
}

console.log(numeros);
