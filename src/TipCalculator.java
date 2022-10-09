public class TipCalculator {
    private int numOfPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage){
        numOfPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip+=cost;
    }

    public double tipAmount(){
        return totalBillBeforeTip * (tipPercentage *0.01);
    }

  public double totalBill(){
        return totalBillBeforeTip + tipAmount();
  }

  public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numOfPeople;
  }

  public double perPersonTipAmount(){
        return tipAmount()/numOfPeople;
  }

  public double perPersonTotalCost(){
        return perPersonCostBeforeTip() + perPersonTipAmount();
  }
}
