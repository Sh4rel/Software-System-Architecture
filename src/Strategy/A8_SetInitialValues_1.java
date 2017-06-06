package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing SetInitialValues() strategy
* for setting the total to 0 and units of gallons to 0 before Pumping
* while payment mode is chosen as credit*/


public  class A8_SetInitialValues_1 extends A8_SetInitialValues{
    @Override
    public void SetInitialValues() {
        ds.setG(0);
        ds.settotal(0);
    }
}
