package Containers.Report;

public class Report 
{
  private String name;
  private int num;

  public Report(String name, int num)
  {
    this.name = name;
    this.num = num;
  }

  public String getName() 
  {
    return name;
  }

  public int getNum() 
  {
    return num;
  }

  @Override
  public boolean equals(Object obj) 
  {
    if(this == obj)
    {
      return true;
    }
    if(obj == null || this.getClass() != obj.getClass())
    {
      return false;
    }
    Report other = (Report) obj;
    return this.name.equals(other.name) && this.num == other.num;
  }

  @Override
  public String toString()
  {
    return "| Nome Report: "+ name +" || Numero: " + num + " |";
  }
}
