/* 
posições. O programa deverá ter 8 funções:
- Uma para preencher todas as posições do vetor (V)
- Uma para exibir os valores armazenados no vetor (V)
- Uma para determinar o maior valor armazenado no vetor (V)
- Uma para determinar o menor valor armazenado no vetor (V)
- Uma para determinar a média dos valores armazenados no vetor (V)
- Uma para determinar o desvio padrão dos valores armazenados no vetor
- Uma para buscar no vetor um valor real digitado pelo usuário via console 
 (utilizandoa busca sequencial ou linear).
OBS 2: Desvio Padrão (consulte algum material de Estatística Básica). */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define TAM 10

void preencherVetor(int *vetor) 
{
    
    
    int i;
    for(i = 0; i < TAM; i++)
    {
       vetor[i] = i + 1;
        //printf("%d",i);
    }
    //getchar();
}

void mostrarVetor(int *vetor)
{
    int j;
   
    for(j = 0; j < TAM; j++)
    {
        printf("%d\t",vetor[j]);
    }
        //getchar();
    
}

void maiorValor (int *vetor)
{
    printf("\nMenor valor: %d",vetor[0]);
}

void menorValor (int *vetor) 
{
    printf("\nMaior Valor: %d",vetor[9]);
}

float mediaArray(int *vetor) 
{
    int i, soma, soma2;
    float media;

    for (i = 0; i < TAM; i++) 
    {
        soma = vetor[i] + vetor[i + 1];
        soma2 = soma + vetor[i + 2];

        i += 2;
    }
        media = soma / 10;
        return media;
}

void main() 
{
    int i;
    int soma;
    float media;
    int vetor[TAM];
    preencherVetor(vetor);
    mostrarVetor(vetor);
    maiorValor(vetor);   
    menorValor(vetor); 
    mediaArray(vetor);
}