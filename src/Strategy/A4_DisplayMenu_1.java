package Strategy;

/**
 * Created by Sharel on 4/19/2017.
 */

/*Concrete Strategy class implementing DisplayMenu() strategy
* for displaying list of selections
* while payment mode is chosen as credit*/

public class A4_DisplayMenu_1 extends A4_DisplayMenu {
    @Override
    public void DisplayMenu() {


        System.out.println("\n ***********DISPLAY MENU*************");
        System.out.println("\n Select option 6 for Super Fuel and then select option 8 to Start the Pump");
        System.out.println("\n Select option 7 for Regular Fuel option 8 to Start the Pump");
    }
}
