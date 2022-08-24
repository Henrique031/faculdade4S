
""" 
#nome = "Ronaldo"
print(nome[0]) #R
print(nome[4]) #l
print(nome[4]) #Erro de sintaxe
print(nome[-1]) #o
print(nome[-3]) #l
print(nome.upper()) #RONALDO
print(nome.lower()) #ronaldo
print(nome.capitalize()) # Ronaldo

nome = nome.lower() #Convertendo para minúsculo
print(nome)

nome = nome.upper() #Convertendo para maiúsculo
print(nome)
"""
""" 
#tiozao = " João " 
tiozao = tiozao.strip() #remove os espaços em braco em uma string(esquerda ou direita)
print(tiozao) 
print(len(tiozao)) #Pra saber o comprimento da string
"""
""" 
x = 33
if x % 5 != 0: #true
    print("x não é multiplo de 5")
else:
    print("x é múltiplo de 5")
"""

"""
salario = float(input("Digite o salario: "))

if salario < 2000:
    salario = salario * 1.20
else:
    salario = salario * 1.10

print("Salário = R$", salario)

"""

""" 
num = int(input("Digite um valor inteiro: "))

if num < 0:
    print("Negativo")
elif num == 0:
    print("Zero")
else:
    print("Positivo")
"""
"""  

nota = float(input("Digite uma nota: "))

if nota > 9:
    print("Você foi muito bem")
elif nota > 6:
    print("Passou mais estude mais:")
elif nota <= 5:
    print("Reprovado")
else:
    print("Digite um valor abaixo de 10")
"""
"""  
import math

a = float(input("Digite A: "))
b = float(input("Digite A: "))
c = float(input("Digite A: "))
delta = b**2-4*a*c

if delta <0:
    print("Não tem raiz Real")
elif delta == 0:
    raiz1 = (-b)/(2*a)
    print("Raiz x = ", raiz1)
else:
    rai1 = (-b+match.sqrt(delta))/(2*a)
"""

cpf = "52998224725"
#verificacao = int(cpf[0] * 10 + cpf[1] * 9 + cpf[2] * 8 + cpf[3] * 7 + cpf[4] * 6 + cpf[5] * 5 + cpf[6] * 4 + cpf[7] * 3 + cpf[8] * 2)
c1 = int(5 * 10)
c2 = cpf[1] * 9
c3 = cpf[2] * 8
c4 = cpf[3] * 7
c5 = cpf[4] * 6
c6 = cpf[5] * 5
c7 = cpf[6] * 4
c8 = cpf[7] * 3
c9 = cpf[8] * 2

print(cpf[0])
""" result = 5 * 10 + 2 * 9 + 9 * 8 + 9 * 7 + 8 * 6 + 2 * 5 + 2 * 4 + 4 * 3 + 7 * 2
print(result) """