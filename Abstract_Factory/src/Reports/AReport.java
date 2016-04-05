
package Reports;

/**
 *
 * @author jonaranjo
 */
public abstract class AReport {
    
    protected String _name;

    public AReport(String pName) 
    {
        this._name = pName;
    }
    
    public void processReport()
    {
        System.out.println("Processing report: " + this._name);
    }
    
}
