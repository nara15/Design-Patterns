
package Reports;

/**
 *
 * @author jonaranjo
 */
public abstract class AbstractINReport extends AReport {

    protected AbstractINReport(String pName) 
    {
        super(pName);
    }
    
    @Override
    public void processReport()
    {
        super.processReport();
        System.out.println("Performing IN Reports");
    }
    
}
