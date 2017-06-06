package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing GasPumpedMsg() strategy
*to display units of gas  disposed
* while payment mode is chosen as credit*/

public class A10_GasPumpedMsg_1 extends A10_GasPumpedMsg {
    @Override
    public void GasPumpedMsg() {
        float g = ds.getG();
        System.out.println("Amount of Gas pumped in units: " +g);

    }
}
