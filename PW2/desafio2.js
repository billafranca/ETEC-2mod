document.addEventListener("DOMContentLoaded", function(){
    let btn = document.getElementById("sum");

    btn.addEventListener("click", function(){
        let numUm = document.getElementById("numeroUm");
        let numDois = document.getElementById("numeroDois");
        let n1 = Number(numUm.value);
        let n2 = Number(numDois.value);
       
        let soma = n1 + n2;
        

        document.getElementById("res").textContent = soma;
    })
})