#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <math.h>

float calJuros(float financimento, float taxaJuros, int periodo)
{
    float ptm;
    ptm = financimento * (taxaJuros * (pow((1 + taxaJuros), periodo)) / (pow((1 + taxaJuros), periodo) - 1));
    return ptm;
}
void main()
{
    float financimento, parcela, taxaJuros;
    int periodo;
    printf("Insira o valor total do Financiamento: ");
    scanf("%f", &financimento);
    printf("Favor inserir a taxa de Juros menais em decimal: ");
    scanf("%f", &taxaJuros);
    printf("Favor insira o periodo de periodo do Financiamento:");
    scanf("%d", &periodo);
    parcela = calJuros(financimento, taxaJuros, periodo);
    printf("A prestação mensal será de:  %.2f", parcela);
    getch();
};