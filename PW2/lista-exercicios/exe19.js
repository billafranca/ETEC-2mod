function verificarPalindromo(str) {
   
    const normalizada = str.toLowerCase().replace(/[^a-z0-9]/g, '');
  
   
    const invertida = normalizada.split('').reverse().join('');
  
    
    return normalizada === invertida;
  }

  console.log(verificarPalindromo("Arara"));      
console.log(verificarPalindromo("Luz azul"));    
console.log(verificarPalindromo("Olá Mundo"));   
console.log(verificarPalindromo("Ame a ema"));  

  