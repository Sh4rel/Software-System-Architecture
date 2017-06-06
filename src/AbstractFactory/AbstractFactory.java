package AbstractFactory;

import DataStore.DataStore;
import Strategy.*;


/**
 * Created by Sharel on 4/19/2017.
 */
/*Abstract AbstractFactory class for creating objects for Strategy classes*/
public abstract class AbstractFactory {
    public abstract  DataStore getDataStore();

    public abstract A1_StoreData getStoreDataObj();
    public abstract A2_PayMsg getPayMsgObj();
    public abstract A3_StoreCash getStoreCash();
    public abstract A4_DisplayMenu getDisplayMenuOj();
    public abstract A5_RejectMsg getRejectMsgObj();
    public abstract A6_SetPrice getSetPriceObj();
    public abstract A7_ReadyMsg getReadyMsgObj();
    public abstract A8_SetInitialValues getSetInitialValuesObj();
    public abstract A9_PumpGasUnit getPumpGasUnitObj();
    public abstract A10_GasPumpedMsg getGasPumpedMsgObj();
    public abstract A11_StopMsg getStopMsgObj();
    public abstract A12_PrintReceipt getPrintReceiptObj();
    public abstract A13_CancelMsg getCancelMsgObj();
    public abstract A14_ReturnCash getReturnCashObj();
}
