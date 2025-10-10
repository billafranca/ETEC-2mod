class Animal:
    def __init__(self, raca, som, cor):
        self.raca = raca
        self.som = som
        self.cor = cor

    def exibir(self):
        print(f"Raça: {self.raca}\nSom: {self.som} \nCor: {self.cor}")


raca = input("insira a raça do animal: ")
som = input("insria o som que o animal faz: ")
cor = input("insira a cor do animal: ")


cachorro = Animal(raca, som, cor)


cachorro.exibir()
