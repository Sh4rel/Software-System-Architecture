package DataStore;

/**
 * Created by Sharel on 4/19/2017.
 */
public class Data_2 extends DataStore {

    int temp_a1;
    int temp_b1;
    int temp_c1;
    float temp_cash;

    static float L;
    static int reg1_price;
    static int pre_price;
    static int sup1_price;
    static float cash;
    static float total;
    static int price;


    //Price for the gas selected
    public int getprice1()
    {
        return price;
    }
    public void setprice1(int y)
    {
        price=y;
    }

    //Store temp the prices for gases
    public void setTemp_a1(int a)
    {
        temp_a1 =a;
    }
    public void setTemp_b1(int b)
    {
        temp_b1=b;
    }

    public void setTemp_c1(int c)
    {
        temp_c1=c;
    }


    public int getTemp_a1(){return temp_a1;}
    public int getTemp_b1(){return  temp_b1;}
    public int getTemp_c1(){return  temp_c1;}

    //Get the litre unit when PumpLiter is chosen

    public void setL(float a)
    {
        L=a;
    }
    public float getL()
    {
        return L;
    }

    //Store prices for different gas types
    public void setpre_price(int a)
    {
        pre_price=a;
    }
    public int getpre_price()
    {
        return pre_price;
    }
    public void setreg1_price(int a)
    {
        reg1_price=a;
    }
    public int getreg1_price()
    {
        return reg1_price;
    }

    public void setsup1_price(int a)
    {
           sup1_price=a;
    }
    public int getsup1_price()
    {
        return sup1_price;
    }

    //Store the cash entered and Transaction total amount
    public void setcash(float a)
    {
        cash=a;
    }
    public float getcash()
    {
        return cash;
    }
    public float gettotal()
    {
        return total;
    }
    public void settotal(float a)
    {
        total=a;
    }

    //Store Cash in temp variables

    public void setTempCash(float cash){

        temp_cash = cash;
    }

    public float getTempCash(){
        return temp_cash;
    }

}
