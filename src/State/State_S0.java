package State;

/**
 * Created by Sharel on 4/19/2017.
 */


/*State class that directs outputProcessor to implement Start() meta Event with meta action PayMsg(); */

public class State_S0 extends State {
    @Override
    public void Activate() {

    }

    @Override
    public void Start() {
        outputProcessor.PayMsg();
    }

    @Override
    public void PayType(int t) {

    }

    @Override
    public void Reject() {

    }

    @Override
    public void Cancel() {

    }

    @Override
    public void Approved() {

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
