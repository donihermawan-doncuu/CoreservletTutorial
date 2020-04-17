package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
public class Purchases {
  private String[] cheapItems =
    { "Pen", "Gameboy", "Ruler" };
  private List<String> mediumItems =
    new ArrayList<>();
  private Map<String,String> valuableItems =
    new HashMap<>();
  private boolean isEverythingOK = true;

  public Purchases() {
    mediumItems.add("Headset");
    mediumItems.add("Monitor");
    mediumItems.add("Personal Computer (pc)");
    valuableItems.put("low", "Ferarri");
    valuableItems.put("medium", "Plane");
    valuableItems.put("high", "Datacamp Training Course");
  }

  public String[] getCheapItems() {
    return(cheapItems);
  }

  public List<String> getMediumItems() {
    return(mediumItems);
  }

  public Map<String,String> getValuableItems() {
    return(valuableItems);
  }

  public String purchaseItems() {
    isEverythingOK = Utils.doBusinessLogic(this);
    isEverythingOK = Utils.doDataAccessLogic(this);
    if (isEverythingOK) {
      return("purchase-success");
    } else {
      return("purchase-failure");
    }
  }
}