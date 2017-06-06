package InputProcessor;

import AbstractFactory.*;
import DataStore.*;
import MdaEfsm.*;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Input Processor class for GasPump-1 to which invokes different operations of the gas pump*/
public class GasPump_1 {
    AbstractFactory abstractFactory;
    MdaEfsm mdaEfsm;
    DataStore dataStore;

    //Creating objects for AF, MDaEfsm And DataStore
    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setMdaEfsm(MdaEfsm mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public  void  Activate(float a, float b) {
        if ((a>0)&&(b>0)) {
            dataStore.setTempa(a);
            dataStore.setTempb(b);
            mdaEfsm.Activate();

        }
    }
    public  void  Start() {
    mdaEfsm.Start();
    }
    public  void  PayCredit() {
        mdaEfsm.PayType(1);
    }

    public  void  Reject() {
       mdaEfsm.Reject();
    }

    public  void  Cancel() {
      mdaEfsm.Cancel();
    }

public void  Approved() {
        mdaEfsm.Approved();
    }

    public  void Super() {
        mdaEfsm.SelectGas(2);
    }
public void Regular() {
        mdaEfsm.SelectGas(1);
    }

public void StartPump() {
    mdaEfsm.StartPump();
    }

public void PumpGallon() {
        mdaEfsm.Pump();

}

public void StopPump() {
        mdaEfsm.StopPump();
        mdaEfsm.Receipt();

        }


}
