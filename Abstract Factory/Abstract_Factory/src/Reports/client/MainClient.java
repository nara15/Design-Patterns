
package Reports.client;

import Reports.FactoryType;
import Reports.ReportType;

/**
 *
 * @author jonaranjo
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ReportArchive archive = new ReportArchive();
        
        archive.addReport(FactoryType.IN, ReportType.Invoice, "file000");
        archive.addReport(FactoryType.IN, ReportType.Purchase, "pfile000");
        
        archive.processAllReports();
        
    }
    
}
