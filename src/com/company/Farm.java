package com.company;

import java.util.Arrays;

public class Farm {
  String adress;
  String ownerName;
  Cow[] cows;
  Horse[] horses;
  Sheep[] sheep;

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public Farm() {

  }

  @Override
  public String toString() {
    return "1-Farm:  " + "adress='" + adress + '\'' +", ownerName='" + ownerName + '\''+ "."+
            "\n"+"cows=" + Arrays.toString(cows) +
            "\n"+"horses=" + Arrays.toString(horses) +
            "\n"+"sheep=" + Arrays.toString(sheep);
  }
}
