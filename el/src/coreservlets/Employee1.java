package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Doni", "Hermawan"),
          new Company("Quenella",
                      "Company"));
  }
}
