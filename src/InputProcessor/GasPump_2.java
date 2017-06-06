package InputProcessor;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import MdaEfsm.MdaEfsm;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Input Processor class for GasPump-2 to which invokes different operations of the gas pump*/
public class GasPump_2 {
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

    public  void  Activate(int a, int b, int c) {
        if ((a>0)&&(b>0)&&(c>0)) {
            dataStore.setTemp_a1(a);
            dataStore.setTemp_b1(b);
            dataStore.setTemp_c1(c);

            mdaEfsm.Activate();
        }
    }
    public  void  Start() {
        mdaEfsm.Start();
    }
    public  void  PayCash(float c) {
        if (c>0) {
            dataStore.setTempCash(c);
            mdaEfsm.PayType(2);

        }
    }

    public  void  Cancel() {
        mdaEfsm.Cancel();
    }


    public  void Super() {
        mdaEfsm.SelectGas(2);
    }
    public void Regular() {
        mdaEfsm.SelectGas(1);
    }
    public void Premium() {
        mdaEfsm.SelectGas(3);
    }

    public void StartPump() {
        mdaEfsm.StartPump();
    }

public void PumpLiter() {

    float cash = dataStore.getcash();
    float price =dataStore.getprice1();
    float L = dataStore.getL();
    boolean res = (cash<(L+1)*price);
   // System.out.println("\nCash:"+cash +"\tprice:"+price+"\tLiter:"+L+"\tResult:"+res);


        if(cash<(L+1)*price){
            mdaEfsm.StopPump();
        }
        else {
            mdaEfsm.Pump();
        }
     }


   public void Stop() {
      mdaEfsm.StopPump();
    }
public  void Receipt() {
       mdaEfsm.Receipt();
    }
public void NoReceipt() {
mdaEfsm.NoReceipt();
    }


}

