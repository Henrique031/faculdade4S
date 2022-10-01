#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_ALUNOS 4

struct TipoAluno
{
    char nome[30];
    int faltas;
    float nota;
    int bolsista;
}

main()
{
    struct TipoAluno alunos[MAX_ALUNOS];
    
    int i;
    FILE *arq;
    
    for(i = 0; i < MAX_ALUNOS; i++) {
        printf("\nDigite o nome: ");
        fflush(stdin);
        fgets(alunos.nome, 30,  stdin);
        printf("\nDigite a qtde de faltas: ");
        scanf("%d", &alunos[i].faltas);
        printf("\nDigite a nota: ");
        scanf("%f", &alunos[i].nota);
        printf("\nbolsista (0/1): ");
        scanf("%d", &alunos[i].bolsista);
    }
    
arq = fopen("alunos.txt", "w"); //fopen = abrir pasta // "w" = Escrita
printf("\n\nExibição e gravacao dos dadso digitados: \n");

for(i = 0; i<MAX_ALUNOS; i++) {
    printf("\nNome: %s \n", alunos[i].nome);
    printf("\nFaltas: %d \n", alunos[i].faltas);
    printf("\nNota: %.2f \n", alunos[i].nota);
    printf("\nBolsista: %d \n", alunos[i].bolsista);
    fprintf(arq, "%s;%d;%.2f;%d\n", alunos[i].nome, alunos[i].faltas,alunos[i].nota,alunos[i].bolsista);
}
fclose(arq);
system("pause");

}