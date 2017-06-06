package DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */
public class Data_1 extends DataStore{



    float temp_a;
    float temp_b;


    static float price;
    static float cash;
    static float total;
    static float G;
    static float reg_price;
    static float sup_price;

    //Store gas prices temporarily
    public void setTempa(float a)
    {
        temp_a =a;
    }
    public float getTempa(){return temp_a;}
    public void setTempb(float b)
                {
        temp_b=b;
    }
    public float getTempb(){return temp_b;}

    //Store ttotal amount of the transaction
    public void settotal(float c)
    {
        total =c;
    }
    public float gettotal()
    {
        return total;
    }

    //Storeprice for gas chosen
    public void setprice(float y)
    {
        price=y;
    }
    public float getprice()
    {
        return price;
    }
    public void setcash(float a)
    {
        cash =a;
    }
    public float getcash()
    {
        return cash;
    }

    //Store Gallon units when PumpGallon is chosen
    public void setG(float y)
    {
        G=y;
    }
    public float getG()
    {
        return G;
    }

    //Store the prices in respective variables
    public void setsup_price(float y)
    {
        sup_price=y;
    }
    public float getsup_price()
    {
        return sup_price;
    }
    public void setreg_price(float y)
    {
        reg_price=y;
    }
    public float getreg_price()
    {
        return reg_price;
    }
}
