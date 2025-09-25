class Produto {
    constructor() {
        this.nome = prompt("Digite o nome do produto:");
        this.preco = parseFloat(prompt("Digite o preço do produto:"));
    }

    exibir() {
        console.log("Nome do produto:", this.nome);
        console.log("Preço do produto:", this.preco.toFixed(2));
    }
}

class Nota {
    constructor(produto) {
        this.nota = prompt("Deseja receber nota fiscal? (s/n): ");
        this.produto = produto;
        this.dataAtual = new Date();
    }

    exibir() {
        if (this.nota === "s") {
            const dataCompra = new Date(2025, 8, 24, 21, 14, 0, 0); 
            const dia = dataCompra.getDate().toString().padStart(2, '0');
            const mes = (dataCompra.getMonth() + 1).toString().padStart(2, '0');
            const ano = dataCompra.getFullYear();
            const hora = dataCompra.getHours().toString().padStart(2, '0');
            const minuto = dataCompra.getMinutes().toString().padStart(2, '0');

            console.log("=== NOTA FISCAL ===");
            console.log("Compra aprovada.");
            console.log(`Data: ${dia}/${mes}/${ano} às ${hora}:${minuto}\n`);

            console.log(`Produto: ${this.produto.nome}`);
            console.log(`Preço: R$ ${this.produto.preco.toFixed(2)}\n`);

            console.log("====================");
        } else {
            console.log("Nota não autorizada.");
        }
    }
}


let produto1 = new Produto();
produto1.exibir();


let nota1 = new Nota(produto1);
nota1.exibir();
