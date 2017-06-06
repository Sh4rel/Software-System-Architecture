package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing StoreData() strategy
* for storing gas prices of GasPump-2 for super,premium & regular
* into temp variables of DataStore
* */
public class A1_StoreData_2 extends A1_StoreData {


    public void StoreData() {
        int a, b,c;
        a=ds.getTemp_a1();
        ds.setreg1_price(a);
        b=ds.getTemp_b1();
        ds.setpre_price(b);
        c=ds.getTemp_c1();
        ds.setsup1_price(c);
    }
}