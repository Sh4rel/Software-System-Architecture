package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing PrintReceipt() strategy of the meta action*/

public abstract  class A12_PrintReceipt {
    DataStore ds;
    public void setdata(DataStore dOb){
        ds=dOb;
    }
    public abstract void PrintReceipt();
}
