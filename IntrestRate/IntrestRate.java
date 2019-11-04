
/**
 * Given a description of an item, how much it costed and the  
 * monthly rate. Divide rate by 100 and multiply that by the 
 * price to determine what the first months payment will be.
 * Display the description, monthly rate, and the first month's payment.
 *
 * @author Haley Sanchez
 * @version 11/11/18
 * @period 1
 */
import javax.swing.JOptionPane;
public class IntrestRate
{
    private String des;
    private String dol;
    private String mon;
    private int dollars;
    private double monthly;
    public IntrestRate(String a, String b, String c)
    {
        des = a;
        dol = b;
        mon = c;
    }
    public void convertNumbs()
    {
        dollars = Integer.parseInt(dol);
        monthly = Double.parseDouble(mon);
    }
    public String desItem()
    {
        return "You purchased " + des + " for " + dol + " dollars.";
    }
    public String monRate()
    {
        return "Your monthly intrest rate is " + mon + "%.";
    }
    public String amtPaying()
    {
        return "You will be charged " + ((monthly/100.0)* dollars)
        + " dollars in intrest after the first month.";
    }
    
    
    /*String des = JOptionPane.showInputDialog("Please enter a short description of the item.");
    String dol = JOptionPane.showInputDialog("Please enter the amount of purchase in whole dollars.");
    String mon = JOptionPane.showInputDialog("Please enter the monthly intrest rate."); 
    int dollars = Integer.parseInt(dol);
    double monthly = Double.parseDouble(mon);
    double paying = (monthly/100) * dollars;
    System.out.println("You purchased " + des + " for " + dol + " dollars.");
    System.out.println("Your monthly intrest rate is " + monthly + "%.");
    System.out.println("You will be charged " + paying + 
    " in intrest after the first month");*/

}
