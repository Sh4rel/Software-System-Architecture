package Strategy;

import DataStore.DataStore;

import javax.xml.crypto.Data;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing ReturnCash() strategy of the meta action*/
public abstract class A14_ReturnCash {
    DataStore dataStore;
    public void setdata(DataStore ds){
        dataStore=ds;

    }
    public abstract void ReturnCash();
}
