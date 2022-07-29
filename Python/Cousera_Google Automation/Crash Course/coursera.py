"""
função que conta quantas vezes uma letra aparece em um texto.

"""

def count_letters(text):
    result = {} #incializando um dicionario vazio
    for letter in text: #percorre o texto passado
        if letter not in result:
            result[letter] = 0 #inicializa a contagem da letra com 0 se não estiver no dicionário
        result[letter] +=1 #acrescenta a contagem à letra
    return result


print(count_letters("Quantas vezes cada letra desse texto aparece nele"))


#Dicionario de roupas por cor.
wardrobe = {"shirt":["red","blue","white"], "jeans":["blue","black"]}
for keys, values in wardrobe.items(): #Percorre todos os itens do dicionário
	for value in values: #Imprime cada "key" cor por cor (value)
		print("{} {}".format(value, keys))


print(wardrobe["shirt"])