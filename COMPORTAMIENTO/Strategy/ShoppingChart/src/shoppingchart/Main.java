
package shoppingchart;

import shopStrategy.CreditCardStrategy;
import shopStrategy.Item;
import shopStrategy.PaypalStrategy;
import shopStrategy.ShoppingChart;

/**
 *
 * @author jonaranjo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // http://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
        
        
        ShoppingChart cart = new ShoppingChart();
         
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678",40);
         
        cart.addItem(item1);
        cart.addItem(item2);
         
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
         
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        
    }
    
}
