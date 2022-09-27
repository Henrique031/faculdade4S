import random

def selection_sort(vetor):
    i = 0
    while i < len(vetor) - 1:
        menor = i
        j = i + 1
        while j < len(vetor):
            if vetor[j] < vetor[menor]:
                menor = j
            j += 1
        if menor != i:
            temp = vetor[i]
            vetor[i] = vetor[menor]
            vetor[menor] = temp
            i +=1
        elif (vetor[0] < vetor[1] and vetor[2] < vetor[3] and vetor[4] < vetor[5] and vetor[6] < vetor[7] and vetor[7] < vetor[8]): 
            exit()
        
            
vetor = list(range(0,10))
random.shuffle(vetor)
selection_sort(vetor) 
print(vetor)

