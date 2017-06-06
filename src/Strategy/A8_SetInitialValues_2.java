package Strategy;

/**
 * Created by Sharel on 4/22/2017.
 */

/*Concrete Strategy class implementing SetInitialValues() strategy
* for setting the total to 0 and units of liter to 0 before Pumping
* while payment mode is chosen as cash*/

public class A8_SetInitialValues_2 extends A8_SetInitialValues{
    @Override
    public void SetInitialValues() {
        ds.setL(0);
        ds.settotal(0);
    }
}
