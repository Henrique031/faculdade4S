""" 
Para uma lista de 10 inteiros, elaborar um programa em Python para ordenar os elementos na lista na ordem crescente
(PROIBIDO O USO DE QUALQUER RECURSO/BIBLIOTECA/MÉTODO PRONTO DA LINGUAGEM). O aluno deve elaborar ou utilizar um 
algoritmo para isso.
(Bolha, Inserção, Seleção, Quick, Merge....)
= Atividade individual
= Fazer o upload de um arquivo PY / TXT ou Colar o fonte do programa
"""

print("Programa de ordenação de dados\n")


lista = [5, 2, 10, 7, 3, 8, 4, 1, 6, 9]
# lista = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

c2 = 1
c = 1
i = 0   
while c2 < 20:
    while c <= 9:
        while lista[i] > lista[i + 1]:
            troca = lista[i]
            lista[i] = lista[i + 1]
            lista[i + 1] = troca
        i += 1
        c += 1
    i = 0
    c = 1
    c2 +=1
print(lista)
