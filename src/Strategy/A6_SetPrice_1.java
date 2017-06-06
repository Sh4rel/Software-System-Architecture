package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing SetPrice() strategy
* for setting the price to the price of gas chosen during selections
* while payment mode is chosen as credit*/

public class A6_SetPrice_1 extends A6_SetPrice {
    @Override
    public void SetPrice(int g) {
        float a=ds.getreg_price();
        float b=ds.getsup_price();
        if( g== 1)
            ds.setprice(a);
        else if (g == 2)
            ds.setprice(b);

    }
}
