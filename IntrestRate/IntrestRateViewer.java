
/**
 * Asks for and uses the given a description of an item, how much it costed and the  
 * monthly rate. Divide rate by 100 and multiply that by the 
 * price to determine what the first months payment will be.
 * Display the description, monthly rate, and the first month's payment.
 *
 * @author Haley Sanchez
 * @version 11/11/18
 * @period 1
 */
import javax.swing.JOptionPane;
public class IntrestRateViewer
{
    public static void main (String [] args)
    {
        String des = JOptionPane.showInputDialog(
        "Please enter a short description of the item.");
        String dol = JOptionPane.showInputDialog(
        "Please enter the amount of purchase in whole dollars.");
        String mon = JOptionPane.showInputDialog(
        "Please enter the monthly intrest rate."); 
        IntrestRate h = new IntrestRate(des, dol, mon);
        h.convertNumbs();
        System.out.println(h.desItem() + "\n" + h.monRate() +
        "\n" + h.amtPaying());
        //System.out.println(h.monRate());
        //System.out.println(h.amtPaying());
    }
}
