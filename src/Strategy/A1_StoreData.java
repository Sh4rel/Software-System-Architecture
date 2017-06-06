package Strategy;

import DataStore.*;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Abstract Strategy class for implementing StoreData() strategy of the meta action*/
public abstract class A1_StoreData {

	DataStore ds;

	public void setdata(DataStore x){
		ds=x;
	}
    public abstract void StoreData();

}