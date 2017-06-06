package OutputProcessor;
import DataStore.*;
import AbstractFactory.*;
import Strategy.*;

/**
 * Created by Sharel on 4/17/2017.
 */
public class OutputProcessor {

    DataStore ds;
    AbstractFactory AF;

    //setting up the objects for AF and DataStore classes
    public void setdata(DataStore x){
        ds=x;
    }
    public void setfactory(AbstractFactory x)
    {
        AF=x;
    }

    /*Meta Actions implementation here creates references to respective classes(using Concrete Factory object)
     *in the strategy classes that implements the different
     *strategies for the meta actions in the project*/

    public void StoreData(){
        A1_StoreData a1_storeData;
        a1_storeData = AF.getStoreDataObj();
        a1_storeData.StoreData();
    }

    public void PayMsg(){
        A2_PayMsg a2_payMsg;
        a2_payMsg = AF.getPayMsgObj();
        a2_payMsg.PayMsg();
    }

    public void StoreCash(){
        A3_StoreCash a3_storeCash;
        a3_storeCash = AF.getStoreCash();
        a3_storeCash.StoreCash();
    }

    public void DisplayMenu(){
        A4_DisplayMenu a4_displayMenu;
        a4_displayMenu = AF.getDisplayMenuOj();
        a4_displayMenu.DisplayMenu();
    }

    public void RejectMsg(){
        A5_RejectMsg a5_rejectMsg;
        a5_rejectMsg = AF.getRejectMsgObj();
        a5_rejectMsg.RejectMsg();
    }

    public void SetPrice(int g){
        A6_SetPrice a6_setPrice;
        a6_setPrice = AF.getSetPriceObj();
        a6_setPrice.SetPrice(g);
    }

    public void ReadyMsg(){
        A7_ReadyMsg a7_readyMsg;
        a7_readyMsg = AF.getReadyMsgObj();
        a7_readyMsg.ReadyMsg();
    }

    public void SetInItialValues(){
        A8_SetInitialValues a8_setInitialValues;
        a8_setInitialValues = AF.getSetInitialValuesObj();
        a8_setInitialValues.SetInitialValues();
    }

    public void PumpGasUnit(){
        A9_PumpGasUnit a9_pumpGasUnit;
        a9_pumpGasUnit = AF.getPumpGasUnitObj();
        System.out.println("\nIn OP..");
        a9_pumpGasUnit.PumpGasUnit();
    }

    public void GasPumpedMsg( ){
        A10_GasPumpedMsg a10_gasPumpedMsg;
        a10_gasPumpedMsg = AF.getGasPumpedMsgObj();
        a10_gasPumpedMsg.GasPumpedMsg();
    }

    public void StopMsg(){
        A11_StopMsg a11_stopMsg;
        a11_stopMsg=AF.getStopMsgObj();
        a11_stopMsg.StopMsg();
    }

    public void PrintReceipt(){
        A12_PrintReceipt a12_printReceipt;
        a12_printReceipt = AF.getPrintReceiptObj();
        a12_printReceipt.PrintReceipt();
    }

    public void CancelMsg(){
        A13_CancelMsg a13_cancelMsg;
        a13_cancelMsg = AF.getCancelMsgObj();
        a13_cancelMsg.CancelMsg();
    }

    public void ReturnCash(){
        A14_ReturnCash a14_returnCash;
        a14_returnCash = AF.getReturnCashObj();
        a14_returnCash.ReturnCash();
    }
}
