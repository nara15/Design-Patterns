
package Reports;

/**
 *
 * @author jonaranjo
 */
public class OUTPurchaseReport extends AbstractOUTReport {

    public OUTPurchaseReport(String pName) 
    {
        super(pName);
    }
    
     @Override
    public void processReport() 
    {
        super.processReport();
        System.out.println("Performing OUT Reports Purchase specific stuff");
    }
    
}
