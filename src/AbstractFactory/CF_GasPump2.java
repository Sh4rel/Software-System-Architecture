package AbstractFactory;

import DataStore.*;
import Strategy.*;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Create respective object References for strategy classes for GasPump_2 operations*/

public class CF_GasPump2 extends AbstractFactory {
    DataStore ds;

    @Override
    public DataStore getDataStore() {
        ds = new Data_2();
        return ds;
    }

    @Override
    public A1_StoreData getStoreDataObj() {
        A1_StoreData a1_storeData = new A1_StoreData_2();
        a1_storeData.setdata(ds);
        return a1_storeData;
    }

    @Override
    public A2_PayMsg getPayMsgObj() {
        A2_PayMsg a2_payMsg = new A2_PayMsg_2();
        return a2_payMsg;
    }

    @Override
    public A3_StoreCash getStoreCash() {
        A3_StoreCash a3_storeCash=new A3_StoreCash_2();
        a3_storeCash.setdata(ds);
        return a3_storeCash;
    }

    @Override
    public A4_DisplayMenu getDisplayMenuOj() {
        A4_DisplayMenu a4_displayMenu= new A4_DisplayMenu_2();
        return a4_displayMenu;
    }

    @Override
    public A5_RejectMsg getRejectMsgObj() {
        A5_RejectMsg a5_rejectMsg=new A5_RejectMsg_1();
        return a5_rejectMsg;
    }

    @Override
    public A6_SetPrice getSetPriceObj() {
        A6_SetPrice a6_setPrice = new A6_SetPrice_2();
        a6_setPrice.setdata(ds);
        return a6_setPrice;
    }

    @Override
    public A7_ReadyMsg getReadyMsgObj() {
        A7_ReadyMsg a7_readyMsg=new A7_ReadyMsg_1();
        return a7_readyMsg;
    }

    @Override
    public A8_SetInitialValues getSetInitialValuesObj() {
        A8_SetInitialValues a8_setInitialValues=new A8_SetInitialValues_2();
        a8_setInitialValues.setdata(ds);
        return a8_setInitialValues;
    }

    @Override
    public A9_PumpGasUnit getPumpGasUnitObj() {
        A9_PumpGasUnit a9_pumpGasUnit=new A9_PumpGasUnit_2();
        a9_pumpGasUnit.setdata(ds);
        return a9_pumpGasUnit;
    }

    @Override
    public A10_GasPumpedMsg getGasPumpedMsgObj() {
        A10_GasPumpedMsg a10_gasPumpedMsg = new A10_GasPumpedMsg_2();
        a10_gasPumpedMsg.setdata(ds);
        return a10_gasPumpedMsg;
    }

    @Override
    public A11_StopMsg getStopMsgObj() {
        A11_StopMsg a11_stopMsg= new A11_StopMsg_2();
        return a11_stopMsg;
    }

    @Override
    public A12_PrintReceipt getPrintReceiptObj() {
        A12_PrintReceipt a12_printReceipt=new A12_PrintReceipt_1();
        a12_printReceipt.setdata(ds);
        return a12_printReceipt;
    }

    @Override
    public A13_CancelMsg getCancelMsgObj() {
        A13_CancelMsg a13_cancelMsg=new A13_CancelMsg_1();
        return a13_cancelMsg;
    }

    @Override
    public A14_ReturnCash getReturnCashObj() {
        A14_ReturnCash a14_returnCash = new A14_ReturnCash_2();
        a14_returnCash.setdata(ds);
        return a14_returnCash;
    }
}
