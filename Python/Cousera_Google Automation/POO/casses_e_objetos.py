# dir imprime as funções de uma classe
#   print(dir(""))

#help imprime a documentação da classe
#   print(help(""))
#   print(help(1))

#definindo classes
"""class Apple:
    #pass #palavra chave para indicar um bloco de código vazio
    color = ""
    flavor = ""

jonagold = Apple()
jonagold.color = 'red'
jonagold.flavor = 'sweet'

print(jonagold.color +'. '+jonagold.flavor)

golden = Apple
golden.color = 'yellow'
golden.flavor = "soft"
"""

"""#definindo métodos
class Porquinho:
    name = 'porquinho'
    idade = 0
    def falar(self):
        print("Oink! Eu sou o {}! Oink!".format(self.name))

    def idade_porquinho(self):
        return self.idade*3


hamlet = Porquinho()
hamlet.name = "Hamlet"
hamlet.idade = 5
hamlet.falar()
print(hamlet.idade_porquinho())
"""

#Construtores

class Apple:
    #Definindo o contrutor
    def __init__(self, color, flavor):
        self.color = color
        self.flavor = flavor

    def __str__(self):
        return "This is an {} apple and its flavor is {}.".format(self.color, self.flavor)

golden = Apple("Yellow", "Sweet")
print("golden.color: "+golden.color)
print("golden.flavor: "+golden.flavor)
print(golden)




