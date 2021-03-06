package com.TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class LIFO extends COGS {
  private List<double[]> purchases;

  public LIFO() {
    purchases = new ArrayList<double[]>();
  }

  public void purchase(double quantity, double cost) {
    purchases.add(new double[] { quantity, cost });
  }

  public double calculateCOGS(double sellQuantity) {
    quantity = sellQuantity;
    double cOGS = 0;

    for(int i=purchases.size()-1; i >= 0; i--) {

      lotUnitCost = purchases.get(i)[1]/purchases.get(i)[0];
      lotQuantity = purchases.get(i)[0];
      lotCost = purchases.get(i)[1];

      cOGS += doCalculation();
    }

    return cOGS;
  }

}
