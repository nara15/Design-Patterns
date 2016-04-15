
package shopStrategy;

/**
 *
 * @author jonaranjo
 */
public class CreditCardStrategy implements PaymentStrategy {
    
    private String _name;
    private String _cardName;
    private String _cvv;
    private String _dateOfExpiry;

    public CreditCardStrategy(String _name, String _cardName, String _cvv, String _dateOfExpiry) 
    {
        this._name = _name;
        this._cardName = _cardName;
        this._cvv = _cvv;
        this._dateOfExpiry = _dateOfExpiry;
    }

    public String getName() 
    {
        return _name;
    }

    public void setName(String _name) 
    {
        this._name = _name;
    }

    public String getCardName() 
    {
        return _cardName;
    }

    public void setCardName(String _cardName) 
    {
        this._cardName = _cardName;
    }

    public String getCvv() 
    {
        return _cvv;
    }

    public void setCvv(String _cvv) 
    {
        this._cvv = _cvv;
    }

    public String getDateOfExpiry() 
    {
        return _dateOfExpiry;
    }

    public void setDateOfExpiry(String _dateOfExpiry) 
    {
        this._dateOfExpiry = _dateOfExpiry;
    }

    @Override
    public void pay(float pAmount) 
    {
        System.out.println(pAmount + "paid with credi/debir card");
    }
    
    
    
    
    
}
