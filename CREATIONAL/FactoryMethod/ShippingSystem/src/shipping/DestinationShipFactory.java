

package shipping;

/**
 *
 * @author jonaranjo
 */
public abstract class DestinationShipFactory {
    
    public ShipProduct shipProduct(String pShipProductType) throws Exception
    {
        ShipProduct shipProduct = createShipProduct(pShipProductType);
        
        shipProduct.cleanProduct();
        shipProduct.packProduct();
        shipProduct.labelProduct();
        
        return shipProduct;
    }
    
    protected abstract ShipProduct createShipProduct(String pShipProductType) throws Exception;
    
}
