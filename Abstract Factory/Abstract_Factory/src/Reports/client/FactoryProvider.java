
package Reports.client;

import Reports.FactoryType;
import Reports.INReportFactory;
import Reports.IReportFactory;
import Reports.OUTReportFactory;

/**
 *
 * @author jonaranjo
 */
public abstract class FactoryProvider {
    
    public static IReportFactory getFactory(FactoryType pType)
    {
        IReportFactory factory = null;
        
        switch(pType)
        {
            case IN:
                factory = new INReportFactory();
                break;
            case OUT:
                factory = new OUTReportFactory();
                break;
        }
        
        return factory;
    }
}
