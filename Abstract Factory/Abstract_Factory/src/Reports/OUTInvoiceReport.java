
package Reports;

/**
 *
 * @author jonaranjo
 */
public class OUTInvoiceReport extends AbstractOUTReport {

    public OUTInvoiceReport(String pName)
    {
        super(pName);
    }
    
    @Override
    public void processReport() 
    {
        super.processReport();
        System.out.println("Performing OUT Reports Invoice specific stuff");
    }
    
}
