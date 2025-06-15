package Hash;

import java.util.Objects;

public class SingUpForm implements Comparable <SingUpForm>
{
  private String email = null;
  private int age = 0;

  public SingUpForm(String s, int a)
  {
    this.email = s;
    this.age = a;
  }

  public int getAge() 
  {
    return age;
  }

  public String getEmail() 
  {
    return email;
  }

  public void setAge(int age) 
  {
    this.age = age;
  }

  public void setEmail(String email) 
  {
    this.email = email;
  }

  // da java 7 in poi
  @Override
  public int hashCode()
  {
    return Objects.hash(this.email);
  }

  /*
   * versione pre java 7
   * 
   * @Override
   * public int hashCode()
   * {
   *  int result = 17;
   *  result = 31 * result + this.email;
   *  return result;
   * }
   */

  // il metodo hash e equals devo riguardare gli stessi attributi per garantire
  // la coerenza
  @Override
  public boolean equals(Object obj)
  {
    if(this ==  obj)
    {
      return true;
    }
    if(obj != null && this.getClass() != obj.getClass())
    {
      return false;
    }
    SingUpForm F = (SingUpForm) obj;
    return Objects.equals(this.email, F.email);
  }

  @Override
  public int compareTo(SingUpForm F)
  {
    return (this.age - F.age);
  }
}
