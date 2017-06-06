package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing PrintReceipt() strategy
*to print Receipt and display total amount for gas disposed
* while payment mode is chosen as credit/cash*/

public class A12_PrintReceipt_1 extends A12_PrintReceipt{
    @Override
    public void PrintReceipt() {
        System.out.println("\n\tPrinting receipt...\n");
        float total = ds.gettotal();
        System.out.printf("\n\tThe total amount for the gas that has been pumped is: "+total);

    }
}
