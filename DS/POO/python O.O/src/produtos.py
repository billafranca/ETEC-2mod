import datetime

print("------CLASSE PRODUTOS--------")

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome  
        self.preco = preco 
        
    def exibir(self):
        print(f"Nome: {self.nome}\nPreço: R${self.preco:.2f}")

class Nota:
    def __init__(self, deseja_nota, produto):
        self.deseja_nota = deseja_nota.lower()
        self.produto = produto

    def exibir(self):
        if self.deseja_nota == "s":
            horario = datetime.datetime.now().strftime("%d/%m/%Y %H:%M:%S")
            print("=== NOTA FISCAL ===")
            print("Compra aprovada")
            print(f"\nProduto: {self.produto.nome}")
            print(f"\nPreço: R${self.produto.preco:.2f}")
            print("\nLocal da compra: São Paulo")
            print(f"\nHorário da compra: {horario}")
            print("===  ===")
        elif self.deseja_nota == "n":
            print("\nOpção escolhida: não desejo receber nota.")
        else:
            print("\nOpção inválida.")

nome_produto = input("Digite o nome do produto: ")
preco_produto = float(input("Digite o preço do produto: "))

produto1 = Produto(nome_produto, preco_produto)

deseja_nota = input("Deseja receber nota fiscal? (s/n): ")

nota_fiscal = Nota(deseja_nota, produto1)

produto1.exibir()
nota_fiscal.exibir()
