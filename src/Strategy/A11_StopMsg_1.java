package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing StopMsg() strategy
*to display the message when gas has stopped pumping
* while payment mode is chosen as credit*/

public class A11_StopMsg_1 extends A11_StopMsg {
    @Override
    public void StopMsg() {
        System.out.println("Gas Pump has been stopped.");
    }
}
