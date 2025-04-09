import java.util.Scanner;

public class ArrayComplex 
{
    public static void main(String[] args) 
    {
        final int DIM; //dimensione del vettore (costante)
        Complex[] array;
        int[] pos; //array delle posizioni del numero complesso da trovare
        Complex e = new Complex(); //numero complesso da cercare
        int userChoice;

        Scanner userImput = new Scanner(System.in);//Scanner per input da terminale

        //prende in input da terminale un valore intero e lo assegna a DIM
        System.out.printf("Inserisci la dimensione del vettore: ");
        DIM = userImput.nextInt(); //essendo final si può eseguire l'assegnazione una volta sola

        //creazione di un array di tipo complex di dimensine DIM
        array = new Complex[DIM];

        //creazione del vettore dell posizioni
        pos = new int[DIM]; //inizializzato a DIM dato che è la dimensione massima che può assumere

        //riempimento del vettore
        InsertComplexFromTerminal(array, DIM);

        //stampa del menu
        PrintMenu();

        //input utente per scegliere operazione
        System.out.printf("Inserisci l'operazione che vuoi svolgere: ");
        userChoice = userImput.nextInt();

        switch(userChoice)
        {
            case 1: //stampa vettore
                PrintAll(array, DIM);
            break;

            case 2: //ordinamento
                BubbleSort(array, DIM);
            break;

            case 3: //ricerca
                System.out.printf("Inserisci il numero complesso che vuoi cercare%nInserisci la componente reale: ");
                e.setRe(userImput.nextDouble());
                System.out.printf("Inserisci la componente immaginaria: ");
                e.setImm(userImput.nextDouble());

                Search(array, DIM, e, pos);

                System.out.printf("Il numero complesso ");

                if(e.getImm() >= 0)
                    System.out.printf("%.2f + %.2fi%n", e.getRe(), e.getImm());
                else
                    System.out.printf("%.2f - %.2fi%n", e.getRe(), -e.getImm());

                System.out.printf("è stato trovato alle seguenti posizioni: ");

                for(int i = 0; i < DIM; i++)
                {
                    if(pos[i] == 1)
                    System.out.printf("%d", i + 1);
                }

            break;

            case 4: //stampa dei moduli
                PrintAllModules(array, DIM);
            break;

            case 5: //esci

            break;

            default:
                System.out.printf("Errore!");
            break;
        }

        userImput.close();
    }

    //funzione che riempe il vettore con valori presi da terminale
    public static void InsertComplexFromTerminal(Complex[] array, int DIM)
    {
        Scanner terminalInput = new Scanner(System.in);
        double tmpRe;
        double tmpImm;

        for(int i = 0; i < DIM; i++)
        {
            System.out.printf("%n%d° elemento%nInserisci la componente reale: ", i+1);
            tmpRe = terminalInput.nextDouble();

            System.out.printf("Inserisci la componente immaginaria: ");
            tmpImm = terminalInput.nextDouble();

            array[i] = new Complex(tmpRe, tmpImm);
        }

        terminalInput.close();
    }

    //funzione che stampa i valori degli elementi del vettore
    public static void PrintAll(Complex[] array, int DIM)
    {
        System.out.printf("Vettore:%n");

        for (Complex num : array) 
        {
            if(num.getImm() >= 0)
                System.out.printf("%.2f + %.2fi%n", num.getRe(), num.getImm());
            else
                System.out.printf("%.2f - %.2fi%n", num.getRe(), -num.getImm());
        }
    }

    //funzione che ordina il gli elementi del vettore utilizzando come criterio il modulo del numero complesso
    public static void BubbleSort(Complex[] array, int DIM)
    {
        Complex tmp; //variabile temporanea

        //ripete il ciclo di confronto ad ogni iterazione si ferma una posizione prima
        for(int i = 0; i < DIM - 1; i++)
        {
            //ciclo che confronta l'elemento j-esimo con il successivo
            for(int j = 0; j < DIM - i - 1; j++)
            {
                //confronta il valore dei moduli
                if(array[j].moduloComplex() > array[j + 1].moduloComplex())
                {
                    //se il valore scambio di variabile
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j] = tmp;
                }
            }
        }
    }

    /*
    funzione che scorre il vettore e cerca il numero e, se il valore viene trovato torna true
    altrimenti ritorna false. salva le posizioni in un vettore di interi
    */
    public static boolean Search(Complex[] array, int DIM, Complex e, int[] pos)
    {
        boolean trovato = false;

        for(int i = 0; i < DIM; i++) //ho usato un for dato che dobbiamo scorrere tutto il vettore per cercare tutte le occorrenze
        {
            if(array[i].equals(e))
            {
                trovato = true;
                pos[i] = 1;
                /*avendo creato un vettore con la stessa dimensione dell'array di numeri complessi possiamo utilizzare 
                la posizione del vettore pos per riferirci alla posizione del array di complessi e impostiamo valore 1 se
                il valore è stato trovato in quella posione e valore zero ne non è stato trovato*/
            }
        }
        return trovato;
    }

    //funzione che stampa i valori dei moduli degli elementi del vettore
    public static void PrintAllModules(Complex[] array, int DIM)
    {
        System.out.printf("Moduli:%n");

        for(Complex num : array)
            System.out.printf("%.2f%n", num.moduloComplex());

    }

    //funzione che stampa le operazioni disponibili
    public static void PrintMenu()
    {
        System.out.printf("%n%nMenu%n1) Stanpa Vettore%n2) Ordinamento%n3) Ricerca%n4) Stampa Moduli%n5) Esci%n%n");
    }
}
