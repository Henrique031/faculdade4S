#include <stdio.h>
#include <stdlib.h>
//Vetor de 5 temperaturas. Determinar e média e a maior temperatura
void main () {
    float temp [5];
    float soma, media, maior;
    int i;
    soma = 0;
    for (i = 0; i<5; i++)
    {
        printf("DIgite uma temperatura: ");
        scanf("%f", &temp[i]);
    }
    maior = temp[0];
    for (i = 0; i < 5; i++) {
        soma = soma + temp[i];
        if (temp[i] > maior)
            maior = temp[i];
    }
    media = soma/5;
    printf("\n A media das temperaturas e igual a %.2f\n", media);
    printf("\n A maior temperatura e igual a %.2f\n", maior);

    getchar();
}
