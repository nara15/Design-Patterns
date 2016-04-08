/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonaranjo
 */
public class VehicleFactory {
    
    private Map<String, Class> _vehicles;

    public VehicleFactory() 
    {
       _vehicles = new HashMap<>();
    }
    
   
    public Vehicle createVehicle (String pType) throws Exception
    {
        Vehicle vehicle;
                
        try
        {
           vehicle = (Vehicle) _vehicles.get(pType).newInstance();
         
        }
        catch(InstantiationException | IllegalAccessException | NullPointerException e)
        {
            try
            {
                String name = Vehicle.class.getPackage().getName();
                vehicle = (Vehicle) Class.forName(name + "." + pType).newInstance();
                _vehicles.put(pType, vehicle.getClass());
            } 
            catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex)
            {
                throw new Exception("The vehicle type is unknown");
            }
        }
      
        return vehicle;
            
     
    }
    
}
