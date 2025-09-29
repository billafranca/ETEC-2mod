let diasSemana = parseInt(prompt("selecione um dia da semana! ex: 1- segunda-feira, 2 - terça-feira..."));


switch(diasSemana){
    case 1: {
        console.log("segunda-feira");
        break;
    }case 2: {
        console.log("terça-feira")
        break
    }case 3: {
        console.log("quarta-feira")
        break
    }case 4: {
        console.log("quinta-feira")
        break
    }case 5: {
        console.log("sexta-feira")
        break
    }case 6: {
        console.log("sábado")
        break
    }case 7: {
        console.log("domingo")
        break
    }default: {
        console.log("erro")
    }
}