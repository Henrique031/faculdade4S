""" 
1) Em uma eleição presidencial existem 3 candidados. Os votos são informados através de códigos. Os dados utilizados
 para a contagem dos votos obdecerem á seguindo condição:

 1 - Eymael
 2 - Levy Fidelix
 3 - Cabo Daciolo
 4 - Voto nulo
 5 - Voto em branco

Elabore um programa que leia o código de cada voto, calcule e escreva:
* total e a % de votos para cada candidato;
* total e a % de votos nulos;
* total e o % de votos em branco;
Como finalizador da votação, tem-se qualquer valor diferente de "s".
"""
print("Escolha um número do seu voto na tabela abaixo")
print("1 - Eymael\n2 - LevyFidelix\n3 - Cabo Daciolo\n4 - Voto nulo\n5 - Voto em branco")

cod1 = 0 
cod2 = 0
cod3 = 0
cod4 = 0
cod5 = 0

finalizador = "S"
while finalizador == "S":
    i = 0
    while i < 5: 
        voto = str(input("Insira o código: "))
        if voto == "1":
            cod1 = cod1 + 1
        elif voto == "2":
            cod2 = cod2 + 1
        elif voto == "3":
            cod3 = cod3 + 1
        elif voto == "4":
            cod4 = cod4 + 1
        elif voto == "5":
            cod5 = cod5 + 1
        else:
            print("Código inválido ")
        i = i + 1
    finalizador = str(input("Digite S para continuar votando: ")).upper()

totalVotos = (cod1 + cod2 + cod3 + cod4 + cod5)

print("       Resultado final das Eleições 2022 1° Turno       ")
print("   |Candidatos                |  Votos  |   Percentagem   |")
print("1° |Eymael                    |   ",cod1,"   |      %",(cod1 / totalVotos) * 100, "     |")
print("2° |Levy Fidelix              |   ",cod2,"   |      %",(cod2 / totalVotos) * 100, "     |")
print("3° |Cabo Daciolo              |   ",cod3,"   |      %",(cod3 / totalVotos) * 100, "     |")
print("   |                          |         |                ", "|")
print("   |Votos em Nulo ", "           |   ",cod4,"   |      %",(cod4 / totalVotos) * 100, "     |")
print("   |Votos em Branco ", "         |   ",cod5,"   |      %",(cod5 / totalVotos) * 100, "     |")
print("   |Total de Votos ","          |   ",totalVotos,"   |                 |")

