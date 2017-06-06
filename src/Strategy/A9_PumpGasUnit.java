package Strategy;

import DataStore.DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing PumpGasUnit() strategy of the meta action*/

public abstract class A9_PumpGasUnit  {
    DataStore ds;
    float l,g;
    public void setdata(DataStore dOb){
        ds=dOb;
    }

    public abstract void PumpGasUnit();
}
