/**
 * @author - Miguel Ferreiro 
 * COP-3337 
 * NetBeans IDE 8.2
 * Java 1.8.0_221
 * Instructor - Dr. Charlyne Walker
 * 
 * The Burmese class will get all the instance variables and methods 
 * for a cat.
*/
//package project5;


public class Burmese extends Cat 
{
    public Burmese()
    {
        super() ;
        setBreed("Burmese") ;
        setMaxLife(17) ;
    }
    
    public void createCat(String n, int a, int w)
    {
        setName(n) ;
        setAge(a) ;
        setWeight(w) ;
    }
}
