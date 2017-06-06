package Strategy;

/**
 * Created by Sharel on 4/23/2017.
 */

/*Concrete Strategy class implementing StopMsg() strategy
*to display the message when gas has stopped pumping
* while payment mode is chosen as cash*/

public class A11_StopMsg_2 extends A11_StopMsg {
    @Override
    public void StopMsg() {
        System.out.println("\nGas Pump has been stopped.\n");
        System.out.println("\nChoose to print the Receipt?");
    }
}
