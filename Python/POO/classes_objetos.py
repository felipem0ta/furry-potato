class ContaBancaria: 
    def __init__(self, nome, saldo):
        self.nome = nome
        self.saldo = saldo


""" 
conta_corrente = ContaBancaria()
conta_poupanca = ContaBancaria()
conta_conjunta = ContaBancaria() """


conta_corrente = ContaBancaria("Felipe", 1000)

print(conta_corrente.nome)