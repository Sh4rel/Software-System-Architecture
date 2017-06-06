package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing DisplayMenu() strategy
* for displaying list of selections
* while payment mode is chosen as cash*/

public class A4_DisplayMenu_2 extends A4_DisplayMenu{

    @Override
    public void DisplayMenu() {


        System.out.println("\n ***********DISPLAY MENU*************");
        System.out.println("\n Select option 4 for Super Fuel and then select option 7 to Start the Pump");
        System.out.println("\n Select option 5 for Premium Fuel option 7 to Start the Pump");
        System.out.println("\n Select option 6 to Regular Fuel option 7 to Start the Pump");
    }
}
