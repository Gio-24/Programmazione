package List.LinkedListPerson;

public class Person implements Comparable<Person>
{
  private String name;
  private int age;

  public Person(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString()
  {
    return name + " (" + age + " anni)";
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) // controlla se i due riferimenti sono uguali
    {
      return true;
    }
    // controlla se i due riferimenti appartengono a classi diverse
    if (obj == null || getClass() != obj.getClass()) 
    {
      return false;
    }
    //esegue un cast da Object a Person e confronta lo stato di ogni attributo
    Person other = (Person) obj;
    return age == other.age && name.equals(other.name);
  }

  @Override
  public int compareTo(Person other)
  {
    return Integer.compare(this.age, other.age);  // ordinamento per età crescente
  }
}

