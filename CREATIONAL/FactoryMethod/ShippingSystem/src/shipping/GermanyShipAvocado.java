

package shipping;

/**
 *
 * @author jonaranjo
 */
public class GermanyShipAvocado extends ShipProduct {

    public GermanyShipAvocado(String _pShipProductName, String _description, String _typeWrap, float _weight, float _unitPrice)
    {
        super(_pShipProductName, _description, _typeWrap, _weight, _unitPrice);
    }

    @Override
    public String shipTo() 
    {
       return "German";
    }

    @Override
    public String cleanProduct() 
    {
       return "German";
    }

    @Override
    public String packProduct() 
    {
        return "German";
    }

    @Override
    public String labelProduct() 
    {
        return "Special Premium Avocado to German";
    }
    
}
