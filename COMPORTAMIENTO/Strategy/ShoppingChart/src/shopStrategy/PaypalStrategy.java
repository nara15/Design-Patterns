
package shopStrategy;

/**
 *
 * @author jonaranjo
 */
public class PaypalStrategy implements PaymentStrategy {
    
    private String _emailID;
    private String _password;

    public PaypalStrategy(String _emailID, String _password) 
    {
        this._emailID = _emailID;
        this._password = _password;
    }

    public String getEmailID()
    {
        return _emailID;
    }

    public void setEmailID(String _emailID)
    {
        this._emailID = _emailID;
    }

    public String getPassword()
    {
        return _password;
    }

    public void setPassword(String _password)
    {
        this._password = _password;
    }

    @Override
    public void pay(float pAmount)
    {
        System.out.println(pAmount + " paid using Paypal");
    }
    
    
    
    
    
}
