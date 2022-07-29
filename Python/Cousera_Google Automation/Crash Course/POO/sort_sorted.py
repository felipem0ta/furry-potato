numbers = [1, 4, 7, 5, 2, 3, 8, 5, 9, 6]
names = ['Maria', 'Jose', 'Felipe', 'Alberto', 'Samuel', 'Zacarias', 'Bernadete']

print(numbers) #Lista original
print(sorted(numbers)) #Função sorted() retorna uma nova lista ordenada
print(numbers) #Não altera a lista original

print(names) # Lista Original
names.sort() # Método sort() altera a lista tornando-a ordenada
print(names) # Lista ordenada

# Função sorted pode receber parâmetros para ordenar a lista
print('Lista ordenada por tamanho:')
print(sorted(names, key=len))
