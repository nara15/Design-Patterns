

package shipping;

/**
 *
 * @author jonaranjo
 */
public class SpainShipAvocado extends ShipProduct {

    
    public SpainShipAvocado(String _pShipProductName, String _description, String _typeWrap, float _weight, float _unitPrice) 
    {
        super(_pShipProductName, _description, _typeWrap, _weight, _unitPrice);
    }

    @Override
    public String shipTo() 
    {
        System.out.println("Shipping " + this._pShipProductName + " Spain");
        return "Spain";
    }

    @Override
    public String cleanProduct() 
    {
        return "Cleaning with pure water";
    }

    @Override
    public String packProduct() 
    {
        System.out.println("Packing " + this._pShipProductName + " in soft cotton");
        return "Packing in soft cotton";
    }

    @Override
    public String labelProduct() 
    {
        System.out.println("Special Premium Avocado to Spain");
        return "Special Premium Avocado to Spain";
    }
    
}
