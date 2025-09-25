class Animal:
    def __init__(self, raca, som):
        self.raca = raca
        self.som = som

    def exibir(self):
        print(f"Raça: {self.raca}\nSom: {self.som}")


raca = input("Digite a raça do animal: ")
som = input("Digite o som que o animal faz: ")


cachorro = Animal(raca, som)


cachorro.exibir()
