""" print ("hello")
print ("world")

def escrever():
    print("hello, world")

escrever() """

#builtins
#print(type (15))
#print(dir())

""" lista_numero = [10, 20 ,30]
nova_lista = filter(lambda n: n>=20, lista_numero)
print(list(nova_lista)) """

""" catalogo = [
    {'produto': 'Controle', 'preco': 300 },
    {'produto': 'Jogo', 'preco': 250 },
    {'produto': 'Fone', 'preco': 100 }

]

funcao = lambda p: p['preco'] >=150
nova_lista = filter(funcao, catalogo)
print(list(nova_lista)) """

from functools import reduce


#lista_numero = [10, 20 ,30]

""" acumula = 0
for item in lista_numero:
    acumula = acumula+item

print(acumula)
 """
""" funcao = lambda acumulador, item: acumulador + item
resultado = reduce(funcao, lista_numero, 0)

print(resultado) """

lista = [10, 20, 30]
#List Comprehension como MAP
nova_lista = [item *2  for item in lista]
print(nova_lista)

#List Comprehension como FILTER
nova_lista2 = [item for item in lista if item >= 20]
print(nova_lista2)

dicionario = {f'chave{i}': i for i in lista if i > 20}
print(dicionario)