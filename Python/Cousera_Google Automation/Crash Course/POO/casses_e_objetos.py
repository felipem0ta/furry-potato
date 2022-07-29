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

"""class Apple:
    #Definindo o contrutor
    def __init__(self, color, flavor):
        self.color = color
        self.flavor = flavor

    def __str__(self):
        return "This is an {} apple and its flavor is {}.".format(self.color, self.flavor)

golden = Apple("Yellow", "Sweet")
print("golden.color: "+golden.color)
print("golden.flavor: "+golden.flavor)
print(golden)"""


#Herança

class Animal:
    """Classe pai, vai transmitir os comportamentos para as classes filhas"""
    som = ""
    def __init__(self, nome):
        self.nome = nome
    def fala(self):
        print("{som} Eu sou {nome}! {som}".format(nome=self.nome, som=self.som))


class Porquinho(Animal): #Herença é passada como um parâmetro da classe
    som = "Oink!"


class Vaca(Animal):
    som = "Moooo!"



hamlet = Porquinho("Hamlet")
mimosa = Vaca("Mimosa")

mimosa.fala()
hamlet.fala()



class Repository:
    def __init__(self):
        self.packages = {}

    def add_packages(self, package):
        self.packages[package.name] = package

    def total_size(self):
        result = 0
        for package in self.packages.values():
            result += package.size
        return result



class Clothing:
    stock = {'name': [], 'material': [], 'amount': []}

    def __init__(self, name):
        material = ""
        self.name = name

    def add_item(self, name, material, amount):
        Clothing.stock['name'].append(self.name)
        Clothing.stock['material'].append(self.material)
        Clothing.stock['amount'].append(amount)

    def Stock_by_Material(self, material):
        count = 0
        n = 0
        for item in Clothing.stock['material']:
            if item == material:
                count += Clothing.stock['amount'][n]
                n += 1
        return count


class shirt(Clothing):
    material = "Cotton"


class pants(Clothing):
    material = "Cotton"


polo = shirt("Polo")
sweatpants = pants("Sweatpants")
polo.add_item(polo.name, polo.material, 4)
sweatpants.add_item(sweatpants.name, sweatpants.material, 6)
current_stock = polo.Stock_by_Material("Cotton")
print(current_stock)

