package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */


/*Concrete Strategy class implementing CancelMsg() strategy
*to print cancellation message when the operation has been cancelled
* while payment mode is chosen as credit/cash*/

public class A13_CancelMsg_1 extends A13_CancelMsg{
    @Override
    public void CancelMsg() {
        System.out.println("Operation cancelled successfully.");
    }
}
