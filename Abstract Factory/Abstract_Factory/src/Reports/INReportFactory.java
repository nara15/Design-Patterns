
package Reports;

/**
 *
 * @author jonaranjo
 */
public class INReportFactory implements IReportFactory {

    @Override
    public AReport createReport(ReportType pType, String pName) 
    {
        AReport report = null;
        switch(pType)
        {
            case Invoice:
                report = new INInvoiceReport(pName);
                break;
            case Purchase:
                report = new INPurchaseReport(pName);
                break;
                
        }
        
        return report;
    }
    
}
