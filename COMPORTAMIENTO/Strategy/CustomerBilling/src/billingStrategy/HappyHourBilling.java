
package billingStrategy;

/**
 *
 * @author jonaranjo
 */
public class HappyHourBilling implements IBillingStrategy {

    @Override
    public double getPrice(double pRawPrice) 
    {
        return pRawPrice * 0.5;
    }
    
}
