package Strategy;

/**
 * Created by Sharel on 4/22/2017.
 */
/*Concrete Strategy class implementing PumpGasUnit() strategy
*to pump one unit of gas and calculate total based on units disposed
* while payment mode is chosen as cash*/

public class A9_PumpGasUnit_2 extends A9_PumpGasUnit {
    @Override
    public void PumpGasUnit() {

        System.out.println("\nIn PumpGasUnit");
         l=ds.getL();
        l=l+1;
        float total;
        float price = ds.getprice1();
        total =price*l;
        ds.setL(l);
        ds.settotal(total);
        System.out.println("Amount for gas disposed: "+total);
    }

}
