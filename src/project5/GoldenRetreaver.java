/**
 * @author - Miguel Ferreiro 
 * COP-3337 
 * NetBeans IDE 8.2
 * Java 1.8.0_221
 * Instructor - Dr. Charlyne Walker
 * 
 * The GoldenRetreaver class will get all the instance variables and methods 
 * for a dog.
*/
package project5;


public class GoldenRetreaver extends Dog
{
    public GoldenRetreaver()
    {
        super() ;
        setBreed("Golden Retreaver") ;
        setMaxLife(12) ;
    }
    
    public void createDog(String n, int a, int w)
    {
        setName(n) ;
        setAge(a) ;
        setWeight(w) ;
    }
}
