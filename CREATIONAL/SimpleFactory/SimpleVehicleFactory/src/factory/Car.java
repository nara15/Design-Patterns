
package factory;

/**
 *
 * @author jonaranjo
 */
public class Car implements Vehicle {
    
    private final String _brand = "hizhu";
    
    public String getBrand()
    {
        return  _brand;
    }
    @Override
    public void drive() {
        System.out.println("I am driving a car");
    }
    
}
