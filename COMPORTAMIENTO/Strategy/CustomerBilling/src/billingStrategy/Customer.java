
package billingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonaranjo
 */
public class Customer {
    
    private List<Double> _drinksPrices;
    private IBillingStrategy _strategy;

    public Customer(IBillingStrategy pBillingStrategy) 
    {
        this._drinksPrices = new ArrayList<>();
        this._strategy = pBillingStrategy;
    }

    public void setStrategy(IBillingStrategy pBillingStrategy) 
    {
        this._strategy = pBillingStrategy;
    }
    
    public void addDrinkPrice(double pDrinkPrice, int pQuantity)
    {
        double totalDrinkPrice = pDrinkPrice * pQuantity;
        _drinksPrices.add(_strategy.getPrice(totalDrinkPrice));
    }
    
    public void printBill()
    {
        double sum = 0;
        for (Double price : _drinksPrices)
        {
            sum += price;
        }
        System.out.println("Total due: " + sum);
        _drinksPrices.clear();
    }
    
    
    
    
}
