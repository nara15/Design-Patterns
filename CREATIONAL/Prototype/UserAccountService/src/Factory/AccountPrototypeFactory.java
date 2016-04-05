
package Factory;

import Account.Account;
import Account.AccountType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jonaranjo
 */
public class AccountPrototypeFactory {
    
    HashMap accountMap = new HashMap();
    
    public AccountPrototypeFactory()
    {
        loadAccountCache();
    }
    
    public Account createAccount(AccountType pType)
    {
        Account account = (Account) accountMap.get(pType);
        return account.clone();
    }
    
    private void loadAccountCache()
    {
        Account account = new Account("your user name here", "your password", "your first name", "your last name");
        List permissions;
        permissions = new ArrayList<>();
        permissions.add("Eliminar el terrorismo");
        permissions.add("Instaurar la paz en el mundo");
        permissions.add("Eliminar las cuentas de otros usuarios");
        account.setPermissions(permissions);
        accountMap.put(AccountType.SUPERVISOR, account);
    }
    
}
