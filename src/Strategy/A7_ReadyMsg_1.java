package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing ReadyMsg() strategy
* for displaying the message when it is ready for pumping
* while payment mode is chosen as credit/cash*/

public class A7_ReadyMsg_1 extends A7_ReadyMsg {
    @Override
    public void ReadyMsg() {
        System.out.println("Ready for pumping.");
    }
}
