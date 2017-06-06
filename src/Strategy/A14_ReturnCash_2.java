package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing ReturnCash() strategy
*to return the remaining cash, if any  and display a info message
* while payment mode is chosen as cash*/

public class A14_ReturnCash_2 extends A14_ReturnCash {
    @Override
    public void ReturnCash() {

        float cash = dataStore.getcash();
        float total = dataStore.gettotal();

        if(cash!=0 ) {
            if (cash > total) {
                float ret = cash - total;
                System.out.println("\nReturning remaining cash:\n " + ret);
            } else {
                System.out.println("\nNothing to return!");
            }
        }

    }
}
