
package Client;

import Account.Account;
import Account.AccountType;
import Factory.AccountPrototypeFactory;

/**
 *
 * @author jonaranjo
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       AccountPrototypeFactory manager = new AccountPrototypeFactory();
        
       Account supervisor = manager.createAccount(AccountType.SUPERVISOR);
       System.out.println(supervisor.getPermissions().toString());
       
       supervisor.getPermissions().clear();
       
       Account anothersupervisor = manager.createAccount(AccountType.SUPERVISOR);
       System.out.println(anothersupervisor.getPermissions().toString());
        
        
    }
    
}
