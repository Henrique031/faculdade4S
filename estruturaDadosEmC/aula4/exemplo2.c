int soma (int a, int b)
{
    return a + b;
}
main()
{
int a = 0, b = 0, result = 0;
printf("Vamos semar 2 valore \n");
printf("Digite o primeiro valor da soma: ");
scanf("%d", &a);
printf("Digite o segundo valor da soma: ");
scanf("%d", &b);
result = soma(a, b);
printf("O resultado da soma eh: %d", result);
getchar();
}