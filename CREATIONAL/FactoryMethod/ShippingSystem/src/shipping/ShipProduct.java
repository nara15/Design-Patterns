

package shipping;

/**
 *
 * @author jonaranjo
 */
public abstract class ShipProduct {
    
    protected String _pShipProductName;
    protected String _description;
    protected String _typeWrap;
    protected float _weight;
    protected float _unitPrice;

    public ShipProduct(String _pShipProductName, String _description, String _typeWrap, float _weight, float _unitPrice) 
    {
        this._pShipProductName = _pShipProductName;
        this._description = _description;
        this._typeWrap = _typeWrap;
        this._weight = _weight;
        this._unitPrice = _unitPrice;
    }

      

    public String getpShipProductName()
    {
        return _pShipProductName;
    }

    public void setpShipProductName(String _pShipProductName) 
    {
        this._pShipProductName = _pShipProductName;
    }

    public String getDescription() 
    {
        return _description;
    }

    public void setDescription(String _description) 
    {
        this._description = _description;
    }

    public String getTypeWrap() 
    {
        return _typeWrap;
    }

    public void setTypeWrap(String _typeWrap) 
    {
        this._typeWrap = _typeWrap;
    }

    public float getWeight() 
    {
        return _weight;
    }

    public void setWeight(float _weight) 
    {
        this._weight = _weight;
    }

    public float getUnitPrice() 
    {
        return _unitPrice;
    }

    public void setUnitPrice(float _unitPrice) 
    {
        this._unitPrice = _unitPrice;
    }

    @Override
    public String toString() 
    {
        return "ShipProduct{" + "_pShipProductName=" + _pShipProductName + ", _description=" + _description + ", _typeWrap=" + _typeWrap + ", _weight=" + _weight + ", _unitPrice=" + _unitPrice + '}';
    }
    
    public abstract String shipTo();
    public abstract String cleanProduct();
    public abstract String packProduct();
    public abstract String labelProduct();
    
}
