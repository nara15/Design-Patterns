
package Account;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonaranjo
 */
public class Account implements AccountPrototype {
    
    private String _userName;
    private String _password;
    private String _firstName;
    private String _lastName;
    private  List _permissions;

    public Account(String pUserName, String pPassword, String pFirstName, String pLastName) 
    {
        this._userName = pUserName;
        this._password = pPassword;
        this._firstName = pFirstName;
        this._lastName = pLastName;
        this._permissions = new ArrayList<>();
    }

    public void setUserName(String puserName) 
    {
        this._userName = puserName;
    }

    public void setPassword(String pPassword) 
    {
        this._password = pPassword;
    }

    public void setFirstName(String pfirstName)
    {
        this._firstName = pfirstName;
    }

    public void setLastName(String plastName) 
    {
        this._lastName = plastName;
    }

    public void setPermissions(List pPermissions) 
    {
        this._permissions = pPermissions;
    }

    
    public String getUserName()
    {
        return _userName;
    }

    public String getPassword() 
    {
        return _password;
    }

    public String getFirstName() 
    {
        return _firstName;
    }

    public String getLastName()
    {
        return _lastName;
    }

    public List getPermissions() 
    {
        return _permissions;
    }
    
    public void addPermission(String pPermission)
    {
        _permissions.add(pPermission);
    }

    @Override
    public String toString() {
        return "Account{" + "_userName = " + _userName + ", _password = " + _password + ", _firstName = " + _firstName + ", _lastName = " + _lastName + '}';
    }
    
    

    @Override
    public Account clone() 
    {
        
        Account account = null;
        
        try 
        {
            account = (Account) super.clone();
        } 
        catch (CloneNotSupportedException ex) 
        {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return account;
    }
}
