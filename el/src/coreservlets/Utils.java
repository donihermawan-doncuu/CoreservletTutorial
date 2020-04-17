package coreservlets;

public class Utils {
  public static boolean doBusinessLogic
                          (Purchases bean) {
    // Business logic omitted
    return(Math.random() > 0.2);
  }

  public static boolean doDataAccessLogic
                          (Purchases bean) {
    // Database access omitted
    return(Math.random() > 0.2);
  }
}