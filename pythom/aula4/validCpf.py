
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

#Meu
cpf = str(input("Informe seu cpf para a validação: "))
# cpf = "51247727866"
# cpf = "52998224725"

if len(cpf) < 11 or len(cpf) > 11:
    print("CPF INVÁLIDO! DIGITE NOVAMENTE ")
    exit()

num1 = int(cpf[0])
num2 = int(cpf[1])
num3 = int(cpf[2])
num4 = int(cpf[3])
num5 = int(cpf[4])
num6 = int(cpf[5])
num7 = int(cpf[6])
num8 = int(cpf[7])
num9 = int(cpf[8])
num10 = int(cpf[9])
num11 = int(cpf[10])

calculo1 = num1*10 + num2*9 + num3*8 + num4*7 + num5*6 + num6*5 + num7*4 + num8*3 + num9*2
primeiroDigitoVerificador = (calculo1 * 10) % 11
if primeiroDigitoVerificador == 10:
    primeiroDigitoVerificador = 0

print("Primeiro digito vericador: ", primeiroDigitoVerificador)

calculo2 = num1*11 + num2*10 + num3*9 + num4*8 + num5*7 + num6*6 + num7*5 + num8*4 + num9*3 + primeiroDigitoVerificador*2
segundoDigitoVerificador = (calculo2 * 10) % 11
if segundoDigitoVerificador == 10:
    segundoDigitoVerificador = 0

print("Segundo Numero Verificador: ", segundoDigitoVerificador)

if primeiroDigitoVerificador == num10 and segundoDigitoVerificador == num11:
    print("Válidação feita com sucesso! ")

""" lucas
if __name__ == '__main__':
    print('Informe o CPF')
    cpf = input()

    cpf = cpf.replace('.', '').replace('-', '')

    if len(cpf) < 11:
        print(f'CPF inválido. Documento deve conter 11 digitos')
        exit()

    # conversão sem tratamento de erro intencional.
    int(cpf)

    num1 = int(cpf[0])
    num2 = int(cpf[1])
    num3 = int(cpf[2])
    num4 = int(cpf[3])
    num5 = int(cpf[4])
    num6 = int(cpf[5])
    num7 = int(cpf[6])
    num8 = int(cpf[7])
    num9 = int(cpf[8])
    num10 = int(cpf[9])
    num11 = int(cpf[10])

    if num1 == num2 == num3 == num4 == num5 == num6 == num7 == num8 == num9 == num10 == num11:
        print('CPF inválido')
        exit()

    primeira_soma = num1 * 10 + num2 * 9 + num3 * 8 + num4 * \
        7 + num5 * 6 + num6 * 5 + num7 * 4 + num8 * 3 + num9 * 2

    primeiro_digito_verificador = (primeira_soma * 10) % 11

    if primeiro_digito_verificador == 10:
        primeiro_digito_verificador = 0

    print(primeiro_digito_verificador)

    # print(primeira_soma)
    # print(primeiro_digito_verificador)

    segunda_soma = num1 * 11 + num2 * 10 + num3 * 9 + num4 * 8 + num5 * 7 + \
        num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3 + primeiro_digito_verificador * 2
    segundo_digito_verificador = (segunda_soma * 10) % 11

    if segundo_digito_verificador == 10:
        segundo_digito_verificador = 0

    print(segundo_digito_verificador)

    # print(segunda_soma)
    # print(segundo_digito_verificador)

    if (primeiro_digito_verificador == num10 and segundo_digito_verificador == num11):
        print('CPF é válido.')
    print('Validação concluída.')
     """