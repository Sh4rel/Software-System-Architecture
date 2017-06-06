package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */
/*Abstract Strategy class for implementing StoreCash() strategy of the meta action*/
public abstract class A3_StoreCash {

    DataStore ds;
    public void setdata(DataStore x){
        ds=x;
    }
    public abstract void StoreCash();
}
