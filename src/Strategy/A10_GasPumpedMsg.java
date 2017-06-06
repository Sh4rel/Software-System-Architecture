package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing GasPumpedMsg() strategy of the meta action*/

public abstract class A10_GasPumpedMsg {
    DataStore ds;
    public void setdata(DataStore dOb){
        ds=dOb;
    }
    public abstract void GasPumpedMsg();

}
