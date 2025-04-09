public class TestComplex 
{
    public static void main(String[] args) 
    {
        //costruttori
        Complex C0 = new Complex();
        Complex C1 = new Complex(1.0, -1.0);  
        Complex C2 = new Complex(2.0, 3.0);
        Complex C3 = new Complex(C2); //costruttore di copia

        System.out.printf("Test costruttori e funzione stampa():%n");
        System.out.printf("C0: "); 
        C0.stampa();
        System.out.printf("C1: "); 
        C1.stampa();
        System.out.print("C2: "); 
        C2.stampa();
        System.out.print("C3 (Copia do C2): "); 
        C3.stampa();

        //test setter/getter
        C3.setRe(5.0);
        C3.setImm(0.0);
        System.out.printf("%nTest dei metodi setter e getter:%n");
        System.out.printf("C1 modificato: Re = %.2f %nImm = %.2f", C3.getRe(), C3.getImm());

        //test operazioni
        Complex somma = C1.sommaComplex(C2);
        Complex prodotto = C1.prodottoComplex(C2);

        System.out.printf("%n%nTest operazioni:%n");

        System.out.printf("C1 + C2 = "); 
        somma.stampa();

        System.out.printf("C1 * C2 = "); 
        prodotto.stampa();

        //test modulo
        System.out.printf("%nTest modulo:%n");
        System.out.printf("Modulo di C1: %.2f", C1.moduloComplex());
        System.out.printf("Modulo di C2: %.2f", C2.moduloComplex());
        System.out.printf("Modulo di C3: %.2f", C3.moduloComplex());
    }
}
