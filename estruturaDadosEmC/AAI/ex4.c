/*
posições. O programa deverá ter 8 funções:
- Uma para preencher todas as posições do vetor (V)
- Uma para exibir os valores armazenados no vetor (V)
- Uma para determinar o maior valor armazenado no vetor (V)
- Uma para determinar o menor valor armazenado no vetor (V)
- Uma para determinar a média dos valores armazenados no vetor (V)
- Uma para determinar o desvio padrão dos valores armazenados no vetor (V)
- Uma para buscar no vetor um valor real digitado pelo usuário via console (utilizandoa busca sequencial ou linear). (V)
OBS 2: Desvio Padrão (consulte algum material de Estatística Básica). */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <math.h>
#define TAM 10

void preencherVetor(int *vetor)
{

    int i;
    for (i = 0; i < TAM; i++)
    {
        vetor[i] = i + 1;
        // printf("%d",i);
    }
    // getchar();
}

void mostrarVetor(int *vetor)
{
    int j;
    printf("Vetores\n");
    for (j = 0; j < TAM; j++)
    {
        printf("%d\t", vetor[j]);
    }
    // getchar();
}

void maiorValor(int *vetor)
{
    printf("\nMenor valor: %d", vetor[0]);
}

void menorValor(int *vetor)
{
    printf("\nMaior Valor: %d", vetor[9]);
}

float mediaArray(int *vetor)
{
    int i, soma = 0;
    float media = 0;

    soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8] + vetor[9];
    // printf("\n%d",soma);
    /* for (i = 0; i < TAM; i++)
    {
        soma = vetor[i] + vetor[i + 1];
        soma2 = soma + vetor[i + 2];
        i += 2;
    } */
    media = soma / 10;
    printf("\nMedia: %.1f", media);
    return media;
}

float desvioPadrao(int *vetor){
    float desvioP = 0, valid = 0, media;
    int i;
    
    for(i = 0; i < TAM; i++){
        media = media + vetor[i];
    }
    
    media = media / 10;
    
    for(i = 0; i < 10; i++){
        valid = valid + pow((vetor[i] - media) , 2.0);
    }
    
    desvioP = sqrt(valid/(10 - 1));
    printf("\nDesvio padrao: %.2f", desvioP);
    
    return desvioP;
}

void escolherVetor(int *vetor)
{
    int i, escolha, erro = 0;
    printf("\nDigite um numero de 1 a 10: ");
    scanf("%d", &escolha);
    for (i = 0; i < TAM; i++)
    {
        if (escolha == vetor[i])
            printf("\nValor encontrado: %d", escolha);
        else if(escolha <= 0 || escolha >= 11)
            erro = 1;
    }
    if(erro == 1)
        printf("\nNenhum valor encontrado");
}

void main()
{
    int vetor[TAM];
    preencherVetor(vetor);
    mostrarVetor(vetor);
    maiorValor(vetor);
    menorValor(vetor);
    mediaArray(vetor);
    desvioPadrao(vetor);
    escolherVetor(vetor);
}