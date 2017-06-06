package MdaEfsm;
import State.*;

/**
 * Created by Sharel on 4/17/2017.
 */
public class MdaEfsm {

    private State currentState;
    State[] ls = new State[8];

//below method is used to set the current state of the MDA-EFSM
    public void setState(State s)
    {
        currentState = s;
    }

    //to define the states for the state classes
    public void setStatesList( State[] x)
    {
        ls=x;
    }

    /*Meta Events implementation to refer to respective state classes  implementing the functionalities in the State design pattern*/

    public void Activate() {

        int id = currentState.getStateId();
        System.out.println("Current state is in :"+id);

        switch (id) {
            case 0: {
                currentState.Activate();
                currentState = ls[1];      //ready for next state
                break;
            }
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: {
                System.out.println("Already activated!");
                break;
            }

        }
    }

    public void Start(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: {
                currentState.Start();
                currentState = ls[2];
                break;
            }
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7:
            {
                System.out.println("Incorrect state.");
                break;
            }
        }
    }

    public void PayType(int t){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: {
                if(t==1){
                    currentState.PayType(t);
                    currentState = ls[3];
                }
                else{
                    currentState.PayType(t);
                    currentState = ls[4];
                }
                break;
            }
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7:
            {
                System.out.println("Paytype");
                break;
            }
        }

    }

    public void  Reject(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3:
                    currentState.Reject();
                    currentState = ls[1];  //change state to 0 or 1??
                break;

            case 4: break;
            case 5: break;
            case 6: break;
            case 7:
            {
                System.out.println("Reject!");
                break;
            }
        }
    }
    public  void Cancel(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4:
                currentState.Cancel();
                currentState = ls[1];  //change state to 0 or 1??
                break;

            case 5: break;
            case 6: break;
            case 7:
            {
                System.out.println("Cancel!");
                break;
            }
        }

    }
    public  void  Approved(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3:
                currentState.Approved();
                currentState = ls[4];  //change state to 0 or 1??
                break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7:
            {
                System.out.println("Approved!");
                break;
            }
        }

    }
    public  void  StartPump(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5:
                currentState.StartPump();
                currentState = ls[6];  //change state to 0 or 1??
                break;


            case 6: break;
            case 7:
            {
                System.out.println("StartPump!");
                break;
            }
        }
    }
    public  void  Pump(){

        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: {
                System.out.println("\n\n The gas is being pumped....");
                currentState.Pump();
                currentState = ls[6];  //change state to 0 or 1??
                break;
            }

            case 7:
            {
                System.out.println("Pump!");
                break;
            }
        }
    }
    public  void  StopPump(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6:
                currentState.StopPump();
                currentState = ls[7];  //change state to 0 or 1??
                break;

            case 7:
            {
                System.out.println("StopPump!");
                break;
            }
        }

    }
    public  void  SelectGas(int g){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 4: currentState.SelectGas(g);
                    currentState = ls[5];  //change state to 0 or 1??
                    break;
            case 3: break;
            case 5: break;
            case 6: break;
            case 7:

                break;

            case 8:
            {
                System.out.println("SelectGas");
                break;
            }
        }

    }
    public  void  Receipt(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 4: break;
            case 3: break;
            case 5: break;
            case 6: break;
            case 7:currentState.Receipt();
                   currentState = ls[1];  //change state to 0 or 1??

                break;


        }
    }

    public  void  NoReceipt(){
        int id = currentState.getStateId();
        switch(id)
        {
            case 0: break;
            case 1: break;
            case 2: break;
            case 4: break;
            case 3: break;
            case 5: break;
            case 6: break;
            case 7:currentState.NoReceipt();
                currentState = ls[1];  //change state to 0 or 1??
                break;

        }
    }
}
