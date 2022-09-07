""" 
2) Escreva um programa que lé o valor de uma mercadoria eo  valor pago pelo cliente. Em seguida, ele deve mostrar as notas/moedas a serem devolvidas 
como troco (considere notas de 2, 5 reais e moedas 0.01, 0.05, 0.10, 0.25, 0,50, 1). O troco 
deve ser obtido sempre priorizando as notas/moedas de maior valor.
OBS: O programa deverá mostrar o troco apenas se o mesmo existir. Se não houver troco deverá 
apenas exibir uma mensagem e se o valor recebido for inferior ao valor da mercadoria, 
deverá mostrar o valor faltante.

Exemplo 1:
Valor da mercadoria: R$3,70
Valor pago: R$ 5,00
Troco: R$ 1,30
1 Moeda(s) de R$1,00
1 Moeda(s) de R$0,25
1 Moeda(s) de R$0,05
Exemplo 2:
Valor da mercadoria: R$ 3,00
valor pago: R$3,00
Não existe troco!
Exemplo 3:
Valor da mercadoria: R$ 3,00
Valor pago: R$ 1,00
Faltam R$ 2,00!
"""
print("$imulador de compra")

nota2 = 0
nota5 = 0
nota10 = 0
nota20 = 0
nota50 = 0
nota100 = 0 
nota200 = 0 
moeda1 = 0
moeda50 = 0 
moeda25 = 0 
moeda10 = 0 
moeda5 = 0
moeda01 = 0
troco = 0

valorMercadoria = float(input("Digite o valor da mercadoria: "))
valorPago = float(input("Digite o valor a ser pago: "))

if valorPago > valorMercadoria:
    troco = valorPago - valorMercadoria
    while troco >= 200:
        troco -= 200
        nota200 += 1
    while troco >= 100:
        troco -= 100
        nota100 += 1
    while troco >= 50:
        troco -= 50
        nota50 += 1
    while troco >= 20:
        troco -= 20
        nota20 += 1
    while troco >= 10:
        troco -= 10
        nota10 += 1
    while troco >= 5:
        troco -= 5
        nota5 += 1
    while troco >= 2:
        troco -= 2
        nota2 += 1
    while troco >= 1:
        troco -= 1
        moeda1 += 1
    while troco >= 0.50:
        troco -= 0.50
        moeda50 += 1
    while troco >= 0.25:
        troco -= 0.25
        moeda25 += 1
    while troco >= 0.10:
        troco -= 0.10
        moeda10 += 1
    while troco >= 0.05:
        troco -= 0.05
        moeda5 += 1
    while troco >= 0.01:
        troco -= 0.01
        moeda01 += 1
    print("Valor da mercadoria: R$", valorMercadoria)
    print("Valor pago: R$", valorPago)
    print("Troco: R$", valorPago - valorMercadoria)
    if nota200 > 0:
        print(nota200, " Nota(s) de R$200,00 Reais")
    if nota100 > 0:
        print(nota100, " Nota(s) de R$100,00 Reais")
    if nota50 > 0:
        print(nota50, " Nota(s) de R$50,00 Reais")
    if nota20 > 0:
        print(nota20, " Nota(s) de R$20,00 Reais")
    if nota10 > 0:
        print(nota10, " Nota(s) de R$10,00 Reais")
    if nota5 > 0:
        print(nota5, " Nota(s) de R$5,00 Reais")
    if nota2 > 0:
        print(nota2, " Nota(s) de R$2,00 Reais")
    if moeda1 > 0:
        print(moeda1, " Moeda(s) de R$1,00 Real")
    if moeda50 > 0:
        print(moeda50, " Moeda(s) de R$0,50 Centávos")
    if moeda25 > 0:
        print(moeda25, " Moeda(s) de R$0,25 Centávos")
    if moeda10 > 0:
        print(moeda10, " Moeda(s) de R$0,10 Centávos")
    if moeda5 > 0:
        print(moeda5, " Moeda(s) de R$0,05 Centávos")
    if moeda01 > 0:
        print(moeda01, " Moeda(s) de R$0,01 Centávos")
elif valorPago == valorMercadoria:
    print("Valor da mercadoria: R$", valorMercadoria)
    print("Valor pago: R$", valorPago)
    print("Não existe troco!")
else:
    troco = valorMercadoria - valorPago
    print("Valor da mercadoria: R$", valorMercadoria)
    print("Valor pago: R$", valorPago)
    print("Faltam: R$", troco, "!")