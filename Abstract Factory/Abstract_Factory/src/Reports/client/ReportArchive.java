
package Reports.client;

import Reports.AReport;
import Reports.FactoryType;
import Reports.IReportFactory;
import Reports.ReportType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonaranjo
 */
public class ReportArchive {
    
    private List<AReport> _reportList;
    
    public ReportArchive()
    {
        _reportList = null;
    }
    
    public void addReport(FactoryType pFamily, ReportType pType, String pName)
    {
        IReportFactory reportFactory = FactoryProvider.getFactory(pFamily);
        
        if(this._reportList == null)
        {
            this._reportList = new ArrayList<AReport>();
        }
        this._reportList.add(reportFactory.createReport(pType, pName));
    }
    
    public void processAllReports()
    {
        for(AReport report : this._reportList)
        {
            report.processReport();
            System.out.println("---------------------");
        }
    }
    
}
