
package Reports;

/**
 *
 * @author jonaranjo
 */
public class INPurchaseReport extends AbstractINReport {

    public INPurchaseReport(String pName) 
    {
        super(pName);
    }
    
    @Override
    public void processReport() 
    {
        super.processReport();
        System.out.println("Performing IN Reports Purchase specific stuff");
    }
}
