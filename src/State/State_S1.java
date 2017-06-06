package State;

/**
 * Created by Sharel on 4/19/2017.
 */

/*State class that directs outputProcessor to implement
*PayType() meta Event with meta action StoreCash()
* and DisplayMenu when payment option is cash */

public class State_S1 extends State{
    @Override
    public void Activate() {

    }

    @Override
    public void Start() {

    }

    @Override
    public void PayType(int t) {
        if(t==1){
            System.out.println("\n\n\t\tYou chose to pay using credit. Follow the instructions to continue...\n");
            //changes state to next
        }
        else if(t==2){
            System.out.println("\n\n\t\tYou chose to pay using Cash. Follow the instructions to continue...\n");
             outputProcessor.StoreCash();
             outputProcessor.DisplayMenu();
        }

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
