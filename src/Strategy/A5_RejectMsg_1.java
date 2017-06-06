package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing RejectMsg() strategy
* for displaying rejection message
* while credit card is rejected*/

public class A5_RejectMsg_1 extends A5_RejectMsg {
    @Override
    public void RejectMsg() {
        System.out.println("Credit card rejected!");
    }
}
