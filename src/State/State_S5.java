package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implement
*Pump & StopPump meta Event with meta action PumpGasUnit(),GasPumpedMsg
 * and StopMsg() respectively*/

public class State_S5 extends State{
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

    }

    @Override
    public void Approved() {

    }

    @Override
    public void StartPump() {

    }

    @Override
    public void Pump() {
        outputProcessor.PumpGasUnit();
        outputProcessor.GasPumpedMsg();
    }

    @Override
    public void StopPump() {
        outputProcessor.StopMsg();
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
