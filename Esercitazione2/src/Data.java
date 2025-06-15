// gli import non si propagano
import java.time.LocalDate;

public class Data 
{
    int day;
    int month;
    int year;

    // costruttore
    public Data()
    {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Data(int d, int m, int y)
    {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public Data(Data date)
    {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    //metodo set dell'attributo day
    //
    public void setDay(int d)
    {
        if(d >= 1 && d <= 31)
        {
            this.day = d;
        }
    }

    // metodo get dell'attributo day
    public int getDay()
    {
        return this.day;
    }

    // metodo set dell'attributo day
    public void setMonth(int m)
    {
        if(m >= 1 && m <= 12)
        {
            this.month = m;
        }
    }

    // metodo get dell'attributo day
    public int getMonth()
    {
        return this.month;
    }

    // metodo set dell'attributo day
    public void setYear(int y)
    {
        if(y > 1900)
        {
            this.year = y;
        }
    }

    // metodo get dell'attributo year
    public int getYear()
    {
        return this.year;
    }

    public boolean isBeforeToday()
    {
        LocalDate today = LocalDate.now(); // data odierna
        LocalDate date = LocalDate.of(this.year, this.month, this.day); // data da controllare
        return date.isBefore(today); // controlla se la data da controllare è prima della data odierna 
    }

    // override del metodo toString
    @Override
    public String toString()
    {
        return this.day + "/" + this.month + "/" + this.year;
    }

    // override del metodo equals
    public boolean equals(Data d)
    {
        return this == d
            || this.day == d.day
            && this.month == d.month
            && this.year == d.year;
    }

}
