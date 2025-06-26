/* Specifica:
 * Si sviluppi un programma che consenta di effettuare operazioni su un vettore di numeri complessi. 
 * Un numero complesso è una coppia ordinata di numeri reali rappresentato mediante un record contenente due campi di tipo double: 
 * un campo Re (rappresentante il coefficiente reale), un campo Imm (rappresentante il coefficiente dell’immaginario). 
 * Si definisca (utilizzando il typedef) il tipo “Complesso”.
 * 
 * Il programma deve consentire l'inserimento da tastiera dei numeri complessi del vettore e la stampa dello stesso
 * Si sviluppi inoltre la seguente funzione che opera sul tipo “Complesso” e sul tipo  “Vettore”: 
 * bool ricerca (const Complesso [], int, int *, Complesso);
 * Funzione di ricerca che stabilisce se l'elemento fornito in ingresso è presente nell'array, fornisce al programma chiamante
 * la posizione della prima occorrenza dell'elemento cercato se presente, altrimenti
 * restituisce -1. 
 */

 #include <stdio.h>
 #include <stdbool.h>

 struct RecordComplesso {
     float Re;
     float Imm;
 };
 

 typedef struct RecordComplesso Complesso;
 
 const int DIM = 10;
 
 bool ricerca (const Complesso [], int, int*, Complesso);
 
 int main(int argc, char** argv) {
     //definiamo un array di complessi di cardinalità massima pari a DIM
     Complesso arrayComplessi [DIM];
     //Definiamo il riempimento dell'array 
     int riemp; 
     //Inseirmento da tastiere e controllato del riempimento
     do  {
         printf("Inserisci il numero di elementi del vettore: ");
         scanf("%d", &riemp);
     } while (riemp<0 || riemp >DIM);
     
     //inseriamo i 5 numeri complessi
     for (int i=0; i<riemp; i++) {
         printf("Inserisci la parte reale del numero complesso di indice %d :\n", i);
         scanf("%f", &arrayComplessi[i].Re);
         printf("Inserisci la parte immaginaria del numero complesso di indice %d :\n", i);
         scanf("%f", &arrayComplessi[i].Imm);
     }
     //stampiamo i numeri complessi inseriti
     printf("I numeri complessi inseriti sono:\n");
     for (int i=0; i<riemp; i++) {
         printf("%f %f\n", arrayComplessi[i].Re , arrayComplessi[i].Imm);
     }
     //Chiediamo all'utente di inserire del numero complesso "c" da cercare nell'array.
     Complesso c;
     printf("Inserisci la parte reale dell'elemento da cercare: ");
     scanf("%f", &c.Re);
     printf("Inserisci la parte immaginaria dell'elemento da cercare: ");
     scanf("%f", &c.Imm);
     //definiamo le variabili in cui memorizzeremo i risultati delle'esecuzione della funzione di ricerca
     bool esito;
     int pos;
     esito=ricerca(arrayComplessi, riemp, &pos, c);
     if (esito) {
         printf("La prima occorrenza del numero complesso inserito si trova in posizione %d \n", pos);
     } else {
          printf("Il numero complesso inserito non è presente nel vettore \n");
     }
     printf("Programma Terminato\n");
     return 0;
 }
 
 /* Funzione di ricerca che stabilisce se l'elemento fornito in ingresso è presente nell'array. 
    Fornisce al programma chiamante la posizione della prima occorrenza dell'elemento cercato 
    altrimenti restituisce -1. */
     
 bool ricerca (const Complesso vettore[], int riemp, int * posizione, Complesso elementoDaCercare){
     *posizione = -1;
     int indice = 0;
     bool trovato = false;
     while (indice<riemp && !trovato){
         if(vettore[indice].Re==elementoDaCercare.Re && vettore[indice].Imm==elementoDaCercare.Imm){
             trovato=true;
             *posizione = indice;
         } else {
             indice++;
         }
     }
     return trovato;
 }