package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "red", "green", "yellow" };
  
  public String getMessage() {
    return("Hello, World");
  }
  
  public String[] getColors() {
    return(colors);
  }
}