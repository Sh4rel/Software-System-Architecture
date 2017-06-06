package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing SetInitialValues() strategy of the meta action*/

public abstract class A8_SetInitialValues {
    DataStore ds;
    public void setdata(DataStore x){
        ds=x;
    }
    public abstract void SetInitialValues();
}
