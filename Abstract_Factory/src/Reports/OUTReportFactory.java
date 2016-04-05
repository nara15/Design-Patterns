
package Reports;

/**
 *
 * @author jonaranjo
 */
public class OUTReportFactory implements IReportFactory {

    @Override
    public AReport createReport(ReportType pType, String pName) 
    {
        AReport report = null;
        
        switch(pType)
        {
            case Invoice:
                report = new OUTInvoiceReport(pName);
                break;
            case Purchase:
                report = new OUTPurchaseReport(pName);
                break;
        }
        
        return report;
    }
    
}
