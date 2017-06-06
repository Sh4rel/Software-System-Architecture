package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing StoreData() strategy
* for storing gas prices of GasPump-1 for super & regular
* into temp variables of DataStore**/
public class A1_StoreData_1 extends A1_StoreData {


    public void StoreData() {
        float a, b;
        a=ds.getTempa();
        ds.setreg_price(a);
        b=ds.getTempb();
        ds.setsup_price(b);


    }

}