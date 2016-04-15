
package shopStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonaranjo
 */
public class ShoppingChart {
    
    private List<Item> _items;

    public ShoppingChart() 
    {
        this._items = new ArrayList<>();
    }
    
    public void addItem (Item pItem)
    {
        this._items.add(pItem);
    }
    
    public void removeItem(Item item)
    {
        this._items.remove(item);
    }
    
    public float calculateTotalPrice()
    {
        float sum = 0;
        for (Item item : _items)
        {
            sum += item.getPrice();
        }
        return sum;
    }
    
    public void pay(PaymentStrategy payMethod)
    {
        float amount = calculateTotalPrice();
        payMethod.pay(amount);
    }
    
    
}
