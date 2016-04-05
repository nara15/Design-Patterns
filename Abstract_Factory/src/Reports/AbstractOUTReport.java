
package Reports;

/**
 *
 * @author jonaranjo
 */
public abstract class AbstractOUTReport extends AReport {

    protected AbstractOUTReport(String pName) 
    {
        super(pName);
    }
    
    @Override
    public void processReport()
    {
        super.processReport();
        System.out.println("Performing OUT Reports");
    }
    
    
}
