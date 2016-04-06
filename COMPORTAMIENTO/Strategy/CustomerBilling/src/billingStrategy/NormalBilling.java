
package billingStrategy;

/**
 *
 * @author jonaranjo
 */
public class NormalBilling implements IBillingStrategy {

    @Override
    public double getPrice(double pRawPrice) 
    {
        return pRawPrice;
    }
    
}
