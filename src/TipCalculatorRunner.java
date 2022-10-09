import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculatorRunner {
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //finds out people and percentage of tip
        System.out.println("Hello! Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numOfPeople = scan.nextInt();
        System.out.print("What's the tip percentage? ");
        int tipPercentage =  scan.nextInt();

        //creates the object using the info from user ^^
        TipCalculator calc = new TipCalculator(numOfPeople, tipPercentage);

        //adding up total and asking user costs.
        double itemCost = 0.0;
        while (itemCost != -1) { //not equal -1 because that symbolizes the user is done inputting values.
            System.out.print("Enter the cost of an item you bought in dollars and cents, e.g. 12.50(type -1 to end): ");
            itemCost = scan.nextDouble();
            if (itemCost != -1) {
                calc.addMeal(itemCost);
            }
        }

        //PRINTS THE RECEIPT
        //formatter.format is used for all values except tip percentage because they all involve dollars and cents and money is always rounded to the second decimal place.
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(calc.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + formatter.format(calc.tipAmount()));
        System.out.println("Total Bill With Tip: " + formatter.format(calc.totalBill()));
        System.out.println("Per Person Cost Before Tip: " + formatter.format(calc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + formatter.format(calc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + formatter.format(calc.perPersonTotalCost()));
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Have a great day.");

    }
}
