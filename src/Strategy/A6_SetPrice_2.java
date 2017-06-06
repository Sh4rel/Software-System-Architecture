package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */


/*Concrete Strategy class implementing SetPrice() strategy
* for setting the price to the price of gas chosen during selections
* while payment mode is chosen as cash*/

public class A6_SetPrice_2 extends A6_SetPrice {
    @Override
    public void SetPrice(int g) {
        int a=ds.getreg1_price();
        int b=ds.getpre_price();
        int c=ds.getsup1_price();
        if( g== 1)
            ds.setprice1(a);
        else if (g == 2)
            ds.setprice1(c);
        else if(g==3){
            ds.setprice1(b);
        }
    }
}
