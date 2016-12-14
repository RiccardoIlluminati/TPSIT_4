/******************************************************************
Alunno: Riccardo Illuminati

Classe: 4 INA

Data: 14/12/2016

Testo del Problema:

******************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
int b, h;


void *area(void *arg){
     int A;
     A=b*h;
     printf("\n Il risultato dell'area calcolata e' il seguente: %d", A);
}
void *perimetro(void *arg){
     int P;
                           P=(b+h)*2;
     printf("\n Il risultato del perimetro calcolato e' il seguente: %d", P);
}
int main(void){
    pthread_t TID1;
    pthread_t TID2;
    printf("\n Inserire il valore della base: ");
    scanf("%d",&b);
    printf("\n Inserisci il valore dell'area: ");
    scanf("%d",&h);
    pthread_create(&TID1, NULL, &area, NULL);
    pthread_create(&TID2, NULL, &perimetro, NULL);
    sleep(5);
    return (0);
    }


