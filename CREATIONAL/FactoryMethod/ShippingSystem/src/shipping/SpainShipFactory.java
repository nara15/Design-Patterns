

package shipping;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonaranjo
 */
public class SpainShipFactory extends DestinationShipFactory{

    private final Map<String, Class> _shipProductsToSpain;

    public SpainShipFactory() 
    {
         _shipProductsToSpain = new HashMap<>();
    }
    
    
    
    @Override
    protected SpainShipAvocado createShipProduct(String pProductType) throws Exception
    {
        SpainShipAvocado shipProductToSpain = null;
 
        try 
        {
            shipProductToSpain = (SpainShipAvocado) _shipProductsToSpain.get(pProductType).newInstance();
            
        } 
        catch(InstantiationException | IllegalAccessException | NullPointerException e)
        {
            String className = ShipProduct.class.getPackage().getName();
            try 
            { 
                Class parametros[] = new Class[] { String.class, String.class, String.class, float.class, float.class };
                shipProductToSpain = (SpainShipAvocado)Class.forName(className + "." + pProductType).getDeclaredConstructor(parametros).newInstance("", "", "", 0, 0);
            } 
            catch (ClassNotFoundException | InstantiationException | ClassCastException | IllegalAccessException ex1) 
            {
                 throw new Exception("The product type is unknown");
            }
        }
      
        return shipProductToSpain;
    }
    
}
