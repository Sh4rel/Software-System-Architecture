package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing SetPrice(g) strategy of the meta action*/

public abstract class A6_SetPrice {
    DataStore ds;
    public void setdata(DataStore x){
        ds=x;
    }
    public abstract void SetPrice(int g);
}
