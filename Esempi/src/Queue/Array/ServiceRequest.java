package Queue.Array;

public class ServiceRequest 
{
  private String user;
  private String description;

  public ServiceRequest
(String user, String description) 
  {
    this.user = user;
    this.description = description;
  }

  @Override
  public String toString() 
  {
    return user + " - " + description;
  }

  @Override
  public boolean equals(Object obj) 
  {
    if (this == obj)
    {
      return true;
    } 
    if (!(obj instanceof ServiceRequest))
    {
      return false;
    }

    ServiceRequest other = (ServiceRequest) obj;
    return user.equals(other.user) && description.equals(other.description);
  }
}