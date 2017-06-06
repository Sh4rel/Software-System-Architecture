package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implement
*Activate() meta Event with meta action StoreData();
* this is the starting point of the state classes*/

public class State_Start extends State {
    @Override
    public void Activate() {
        outputProcessor.StoreData();
        System.out.println("\n \n ******Activating GasPump******");
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
