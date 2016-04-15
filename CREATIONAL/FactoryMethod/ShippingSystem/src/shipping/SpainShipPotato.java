

package shipping;

/**
 *
 * @author jonaranjo
 */
public class SpainShipPotato extends ShipProduct {

    public SpainShipPotato(String _pShipProductName, String _description, String _typeWrap, float _weight, float _unitPrice)
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
        return "Cleaning with pure and cold water; and dried with cotton";
    }

    @Override
    public String packProduct() 
    {
        System.out.println("Packing " + this._pShipProductName + " in sacks");
        return "Packing in sacks";
    }

    @Override
    public String labelProduct() 
    {
        System.out.println("Special Premium Potato to Spain");
        return "Special Premium Avocado to Spain";
    }
    
}
