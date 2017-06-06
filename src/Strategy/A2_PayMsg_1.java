package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing PayMsg() strategy
* for displaying message while payment mode is chosen as credit*/

public class A2_PayMsg_1 extends A2_PayMsg{

    @Override
    public void PayMsg() {
        System.out.println("Paid using Credit.");
    }
}
