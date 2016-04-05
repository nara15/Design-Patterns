
package Reports;

/**
 *
 * @author jonaranjo
 */
public class INInvoiceReport extends AbstractINReport {

    public INInvoiceReport(String pName)
    { 
        super(pName);
    }
    
     @Override
    public void processReport() 
    {
        super.processReport();
        System.out.println("Performing IN Reports Invoice specific stuff");
    }
    
}
