package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing StoreCash() strategy
* by storing the cash from temp variable
* while payment mode is chosen as cash*/

public class A3_StoreCash_2 extends A3_StoreCash {
    @Override
    public void StoreCash() {
        float c =ds.getTempCash();
        ds.setcash(c);
    }
}
