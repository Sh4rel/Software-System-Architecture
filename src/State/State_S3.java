package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implement
*Cancel()& SelectGas(g) meta Event with meta action CancelMsg()
* and SetPrice(g) */

public class State_S3 extends State {
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

    }

    @Override
    public void Cancel() {
        outputProcessor.CancelMsg();

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
        outputProcessor.SetPrice(g);
        System.out.println("\nFollow the instructions to continue using GasPump..");

    }

    @Override
    public void Receipt() {

    }

    @Override
    public void NoReceipt() {

    }
}
