package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implement
*Reject()&Approved() meta Event with meta action RejectMsg()
* and DisplayMenu() when payment option is credit */

public class State_S2 extends State{
    @Override
    public void Activate() {
            }

    @Override
    public void Start() {

    }

    @Override
    public void PayType(int t) {

    }

    @Override
    public void Reject() {
        outputProcessor.RejectMsg();
    }

    @Override
    public void Cancel() {

    }

    @Override
    public void Approved() {
        outputProcessor.DisplayMenu();
    }

    @Override
    public void StartPump() {

    }

    @Override
    public void Pump() {

    }

    @Override
    public void StopPump() {

    }

    @Override
    public void SelectGas(int g) {

    }

    @Override
    public void Receipt() {

    }

    @Override
    public void NoReceipt() {

    }
}
