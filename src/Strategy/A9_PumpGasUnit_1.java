package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing PumpGasUnit() strategy
*to pump one unit of gas and calculate total based on units disposed
* while payment mode is chosen as credit*/

public class A9_PumpGasUnit_1 extends A9_PumpGasUnit {
    @Override
    public void PumpGasUnit() {
        //dispose units of gas
         g=ds.getG();
        g=g+1;
        float total;
        float price = ds.getprice();
        total =price *g;
        ds.setG(g);
        ds.settotal(total);
        System.out.println("Amount for gas disposed: "+total);
    }
}
