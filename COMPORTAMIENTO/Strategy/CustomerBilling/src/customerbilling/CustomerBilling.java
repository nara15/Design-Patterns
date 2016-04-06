
package customerbilling;

import billingStrategy.Customer;
import billingStrategy.HappyHourBilling;
import billingStrategy.NormalBilling;

/**
 *
 * @author jonaranjo
 */
public class CustomerBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Customer customer = new Customer(new NormalBilling());
        
        //Normal billing
        customer.addDrinkPrice(1.0, 1);
        
        //Start Happy Hour
        customer.setStrategy(new HappyHourBilling());
        customer.addDrinkPrice(1.0, 2);
        
        //The customer pays
        customer.printBill();
    }
    
}
