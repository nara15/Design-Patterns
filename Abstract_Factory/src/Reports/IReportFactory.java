
package Reports;

/**
 *
 * @author jonaranjo
 */
public interface IReportFactory {
    
    public AReport createReport(ReportType pType, String pName);
}
