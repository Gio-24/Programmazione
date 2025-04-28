
public class Complex 
{
    private double Re;
    private double Imm;

    //builder
    public Complex()
    {
        this.Re = 0.0;
        this.Imm = 0.0;
    }

    public Complex(double Re, double Imm)
    {
        this.Re = Re;
        this.Imm = Imm;
    }

    //copy builder
    public Complex(Complex C)
    {
        this.Re = C.Re;
        this.Imm = C.Imm;
    }

    //setter methods
    public void setRe(double Re)
    {
        this.Re = Re;
    }

    public void setImm(double Imm)
    {
        this.Imm = Imm;
    }

    //getter methods
    public double getRe()
    {
        return this.Re;
    }

    public double getImm()
    {
        return this.Imm;
    }

    //funzione che stampa nel terminale il valore del numero complesso
    public void stampa()
    {
        if(this.getImm() >= 0)
            System.out.printf("%.2f + %.2fi%n", this.getRe(), this.getImm());
        else
            System.out.printf("%.2f - %.2fi%n", this.getRe(), -this.getImm());
    }

    //funzione che calcola e ritorna il valore del modulo del
    public double moduloComplex()
    {
        return Math.sqrt(Math.pow(this.Re, 2) + Math.pow(Imm, 2));
    }

    //funzione che somma le componenti reali e immaginarie di due numeri complessi e ritorna un oggetto Complex
    public Complex sommaComplex(Complex OP)
    {
        Complex somma = new Complex();

        somma.Re = this.Re + OP.Re; //componente reale della somma
        somma.Imm = this.Imm + OP.Imm; //componente immaginaria della somma

        return somma;
    }

    public Complex prodottoComplex(Complex OP)
    {
        Complex prodotto = new Complex();

        prodotto.Re = (this.Re * OP.Re) - (this.Imm * OP.Imm); //componente reale del prodotto
        prodotto.Imm = (this.Re * OP.Imm) - (this.Imm * OP.Re); //componente immaginaria del prodotto

        return prodotto;
    }
}
