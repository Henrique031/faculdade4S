'''  
2- Crie um dicionário vazio filmes = {}. Utilize o nome de um filme como chave. E, como valor, outro
dicionário contendo o protagonista e o ano em que o filme foi lançado. Preencha 5 filmes.
'''

filme1 = ['Piratas do Caribe', 'Capitao Jack Sparrow']
filme2 = ['Assassins Creed', 'Aguilar/Collum Lynch']
filme3 = ['Jogo da Imitacao', 'Alan Turing']
filme4 = ['Missao Impossivel', 'Com Cruise']
filme5 = ['Titanic', 'Jack Dowson']

listaFilmes = [filme1, filme2, filme3, filme4, filme5]

filmes = dict(listaFilmes)

print(filmes)