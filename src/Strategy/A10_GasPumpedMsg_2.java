package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing GasPumpedMsg() strategy
*to display units of gas  disposed
* while payment mode is chosen as cash*/

public class A10_GasPumpedMsg_2 extends A10_GasPumpedMsg {
    @Override
    public void GasPumpedMsg() {
        float l = ds.getL();
        System.out.println("The Gas pump has successfully pumped units :" +l);

    }
}
