
package shopStrategy;

/**
 *
 * @author jonaranjo
 */
public class Item {
    
    private String _code;
    private double _price;

    public Item(String _code, double _cost) 
    {
        this._code = _code;
        this._price = _cost;
    }

    public String getCode() 
    {
        return _code;
    }

    public double getPrice() 
    {
        return _price;
    }

}
