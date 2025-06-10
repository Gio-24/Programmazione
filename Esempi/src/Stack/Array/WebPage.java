package Stack.Array;

public class WebPage 
{
  private String url;
  private String title;

  public WebPage(String url, String title)
  {
    this.url = url;
    this.title = title;
  }

  public String getUrl() 
  {
    return url;
  }

  public String gettitle() 
  {
    return title;
  }

  @Override
  public String toString() 
  {
    return title + "||" + url ;
  }

  @Override
  public boolean equals(Object obj) 
  {
    if (this == obj) 
      return true;
    if (obj == null || getClass() != obj.getClass()) 
      return false;

    WebPage other = (WebPage) obj;
    return url.equals(other.url) && title.equals(other.title);
  }
}
