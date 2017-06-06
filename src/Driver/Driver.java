package Driver;

import AbstractFactory.CF_GasPump1;
import AbstractFactory.CF_GasPump2;
import DataStore.DataStore;
import InputProcessor.GasPump_1;
import InputProcessor.GasPump_2;
import MdaEfsm.MdaEfsm;
import OutputProcessor.OutputProcessor;
import State.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Sharel on 4/22/2017.
 */
public class Driver {
    static Scanner input=new Scanner(System.in);
    static BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        System.out.println("\n\t\t\t!@!@!@Welcome to the Gas Pump Station!@!@!@!@\t\t");
        System.out.println("\n*****Choose the suitable Gas Pump from the list below*****\t\t");
        System.out.println("\n\t 1. GasPump-1 Pay by credit \t");
        System.out.println("\n\t 2. GasPump-2 Pay by Cash \t");
        System.out.println("\n Key in your choice \t\t ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
            {
                MdaEfsm mdaEfsm =new MdaEfsm();
                DataStore dataStore;
                OutputProcessor outputProcessor=new OutputProcessor();
                GasPump_1 gasPump_1=new GasPump_1();
                CF_GasPump1 CF_gasPump1 = new CF_GasPump1();

                //State class references
                State_Start state_start=new State_Start();
                State_S0 state_s0=new State_S0();
                State_S1 state_s1=new State_S1();
                State_S2 state_s2=new State_S2();
                State_S3 state_s3 = new State_S3();
                State_S4 state_s4 = new State_S4();
                State_S5 state_s5 = new State_S5();
                State_S6 state_s6 = new State_S6();

                //initialisation
                    dataStore= CF_gasPump1.getDataStore();
                    gasPump_1.setAbstractFactory(CF_gasPump1);
                    gasPump_1.setDataStore(dataStore);
                    gasPump_1.setMdaEfsm(mdaEfsm);

                state_start.setOutputProcessor(outputProcessor);
                state_start.setStateId(0);

                state_s0.setOutputProcessor(outputProcessor);
                state_s0.setStateId(1);

                state_s1.setOutputProcessor(outputProcessor);
                state_s1.setStateId(2);

                state_s2.setOutputProcessor(outputProcessor);
                state_s2.setStateId(3);

                state_s3.setOutputProcessor(outputProcessor);
                state_s3.setStateId(4);

                state_s4.setOutputProcessor(outputProcessor);
                state_s4.setStateId(5);

                state_s5.setOutputProcessor(outputProcessor);
                state_s5.setStateId(6);

                state_s6.setOutputProcessor(outputProcessor);
                state_s6.setStateId(7);


                //Setting up concrete factory
                outputProcessor.setdata(dataStore);
                outputProcessor.setfactory(CF_gasPump1);

                mdaEfsm.setState(state_start);

                //Setting up the states
                State[] stateList= {state_start,state_s0,state_s1,state_s2,state_s3,state_s4,state_s5,state_s6};
                mdaEfsm.setStatesList(stateList);

                String input=null;
                int ch;

                while(true){
                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~Choose from the below options to utilize GasPump-1 facilities~~~~~~~~\t\t");
                    System.out.println("\n\t\t 0.\t Activate(Regular,Super) ");
                    System.out.println("\n\t\t 1.\t Start ");
                    System.out.println("\n\t\t 2.\t PayCredit ");
                    System.out.println("\n\t\t 3.\t Reject");
                    System.out.println("\n\t\t 4.\t Cancel");
                    System.out.println("\n\t\t 5.\t Approved");
                    System.out.println("\n\t\t 6.\t Super");
                    System.out.println("\n\t\t 7.\t Regular");
                    System.out.println("\n\t\t 8.\t StartPump");
                    System.out.println("\n\t\t 9.\t PumpGallon");
                    System.out.println("\n\t\t 10.\t StopPump");
                    System.out.println("\n\t\t Press any key to exit \n\n");
                    input=buf.readLine();

                    ch=Integer.parseInt(input);

                    switch(ch)
                    {
                        case 0: System.out.println(" \n\n Enter the value of Regular(a) to activate");
                            float a=Float.parseFloat(buf.readLine());
                            System.out.println("\n\n Enter the value of Super(b) to activate");
                            float b=Float.parseFloat(buf.readLine());
                            gasPump_1.Activate(a,b);      //calls method activate in GasPump1
                            break;

                        case 1: gasPump_1.Start();
                            break;

                        case 2: gasPump_1.PayCredit();
                            break;

                        case 3: gasPump_1.Reject();
                            break;

                        case 4: gasPump_1.Cancel();
                            break;

                        case 5: gasPump_1.Approved();
                            break;

                        case 6:gasPump_1.Super();
                            break;

                        case 7:gasPump_1.Regular();
                            break;

                        case 8: gasPump_1.StartPump();
                            break;
                        case 9: gasPump_1.PumpGallon();
                            break;
                        case 10: gasPump_1.StopPump();
                            break;
                        default:
                            System.out.println("\n Please enter a correct option from the list");
                    }
                }


            }

            case 2:
                MdaEfsm mdaEfsm =new MdaEfsm();
                DataStore dataStore;
                OutputProcessor outputProcessor=new OutputProcessor();
                GasPump_2 gasPump_2=new GasPump_2();
                CF_GasPump2 CF_gasPump2 = new CF_GasPump2();

                //State class references
                State_Start state_start=new State_Start();
                State_S0 state_s0=new State_S0();
                State_S1 state_s1=new State_S1();
                State_S2 state_s2=new State_S2();
                State_S3 state_s3 = new State_S3();
                State_S4 state_s4 = new State_S4();
                State_S5 state_s5 = new State_S5();
                State_S6 state_s6 = new State_S6();

                //initialisation
                dataStore= CF_gasPump2.getDataStore();
                gasPump_2.setAbstractFactory(CF_gasPump2);
                gasPump_2.setDataStore(dataStore);
                gasPump_2.setMdaEfsm(mdaEfsm);

                state_start.setOutputProcessor(outputProcessor);
                state_start.setStateId(0);

                state_s0.setOutputProcessor(outputProcessor);
                state_s0.setStateId(1);

                state_s1.setOutputProcessor(outputProcessor);
                state_s1.setStateId(2);

                state_s2.setOutputProcessor(outputProcessor);
                state_s2.setStateId(3);

                state_s3.setOutputProcessor(outputProcessor);
                state_s3.setStateId(4);

                state_s4.setOutputProcessor(outputProcessor);
                state_s4.setStateId(5);

                state_s5.setOutputProcessor(outputProcessor);
                state_s5.setStateId(6);

                state_s6.setOutputProcessor(outputProcessor);
                state_s6.setStateId(7);


                //Setting up concrete factory
                outputProcessor.setdata(dataStore);
                outputProcessor.setfactory(CF_gasPump2);

                mdaEfsm.setState(state_start);

                //Setting up the states
                State[] stateList= {state_start,state_s0,state_s1,state_s2,state_s3,state_s4,state_s5,state_s6};
                mdaEfsm.setStatesList(stateList);

                String input=null;
                int ch;

                while(true){
                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~Choose from the below options to utilize GasPump-2 facilities~~~~~~~~\t\t");
                    System.out.println("\n\t\t 0.\t Activate(Regular,Premium,Super) ");
                    System.out.println("\n\t\t 1.\t Start");
                    System.out.println("\n\t\t 2.\t PayCash");
                    System.out.println("\n\t\t 3.\t Cancel");
                    System.out.println("\n\t\t 4.\t Super");
                    System.out.println("\n\t\t 5.\t Premium");
                    System.out.println("\n\t\t 6.\t Regular");
                    System.out.println("\n\t\t 7.\t StartPump");
                    System.out.println("\n\t\t 8.\t PumpLiter");
                    System.out.println("\n\t\t 9.\t Stop");
                    System.out.println("\n\t\t 10.\tReceipt");
                    System.out.println("\n\t\t 11.\tNoReceipt");
                    System.out.println("\n\t\t Press any key to exit \n\n");
                    input=buf.readLine();
                    ch=Integer.parseInt(input);

                    switch(ch)
                    {
                        case 0: System.out.println(" \n\n Enter the value of Regular(a) to activate\n");
                            int a=Integer.parseInt(buf.readLine());
                            System.out.println("\n\n Enter the value of Premium(b) to activate\n");
                            int b=Integer.parseInt(buf.readLine());
                            System.out.println("\n\nEnter the value of Super(c) to activate\n");
                            int c = Integer.parseInt(buf.readLine());
                            gasPump_2.Activate(a,b,c);
                            break;

                        case 1: gasPump_2.Start();
                            break;

                        case 2:
                            System.out.println("\n Enter the amount to pay:\n");
                            float amt=Float.parseFloat(buf.readLine());
                            gasPump_2.PayCash(amt);
                            break;

                        case 3: gasPump_2.Cancel();
                            break;

                        case 4: gasPump_2.Super();
                               break;

                        case 5: gasPump_2.Premium();
                            break;

                        case 6: gasPump_2.Regular();
                            break;

                        case 7: gasPump_2.StartPump();
                            break;

                        case 8:gasPump_2.PumpLiter();
                            break;

                        case 9: gasPump_2.Stop();
                            break;

                        case 10:gasPump_2.Receipt();
                            break;

                        case 11:gasPump_2.NoReceipt();
                            break;
                        default:
                            System.out.println("\nPlease enter a correct option from the list");
                    }
                }
        }
    }

}
