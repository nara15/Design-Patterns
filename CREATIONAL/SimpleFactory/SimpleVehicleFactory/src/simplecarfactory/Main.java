
package simplecarfactory;

import factory.Vehicle;
import factory.VehicleFactory;
import factory.VehicleType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonaranjo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VehicleFactory factory = new VehicleFactory();
        Vehicle car;
        Vehicle truck;
        try 
        {
            car = factory.createVehicle(VehicleType.Car.name());
            car.drive();
            
            truck = factory.createVehicle(VehicleType.Truck.name());
            truck.drive();
            
                      
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
           
        
        
            
         
            
       
        
    }
    
}
