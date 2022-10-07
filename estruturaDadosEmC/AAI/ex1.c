#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <math.h>

float calculjuros (float capital, float taxa, int periodo) {
    float exp;
    exp = pow(1+taxa,periodo);
    return capital*exp;
}
void main() {
    float montante, capital, taxa, tx;
    int periodo;
    printf("Entre com o Capital em R$: \n");
    scanf("%f", &capital);
    printf("Entre com a taxa de juros: \n");
    scanf("%f", &taxa);
    printf("Entre com o periodo em meses: \n");
    scanf("%d", &periodo);
    tx = taxa/100;
    montante = calculjuros(capital, tx, periodo);
    printf("O montante sera de R% %.2f",montante);
    getch();
}