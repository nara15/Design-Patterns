

package shippingsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import shipping.DestinationShipFactory;
import shipping.ProductToSpainType;
import shipping.SpainShipAvocado;
import shipping.SpainShipFactory;



/**
 *
 * @author jonaranjo
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DestinationShipFactory factory = new SpainShipFactory();
        
        try 
        {
            
           //SpainShipAvocado avocado = (SpainShipAvocado) factory.shipProduct(ProductToSpainType.SpainShipAvocado.name());
         
           //avocado = (SpainShipAvocado) factory.shipProduct("GermanyShipAvocado");
           
           SpainShipAvocado avocadoGermany = (SpainShipAvocado) factory.shipProduct("GermanShipAvocado");
           
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
