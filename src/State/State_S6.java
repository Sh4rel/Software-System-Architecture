package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implements
*Receipt & NoReceipt meta Event with meta
* action PrintReceipt,ReturnCash respectively*/

public class State_S6 extends State{
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

    }

    @Override
    public void StopPump() {

    }

    @Override
    public void SelectGas(int g) {

    }

    @Override
    public void Receipt() {
        outputProcessor.PrintReceipt();
        outputProcessor.ReturnCash();

    }


    @Override
    public void NoReceipt() {
        System.out.println("No Receipt will be printed for this transaction!");
        outputProcessor.ReturnCash();

    }
}
