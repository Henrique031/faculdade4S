notasAlunos = {
    'Henrique': 10,
    'Vinicius': 3,
    'Guibao': 7,
    'Gabriel': 4,
    'Lucas': 9,
}

soma=0
for nota in notasAlunos.values():
    soma = soma + nota
media = soma/len(notasAlunos)
print("Média = %.2f" % media)