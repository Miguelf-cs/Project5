/**
 * @author - Miguel Ferreiro 
 * COP-3337 
 * NetBeans IDE 8.2
 * Java 1.8.0_221
 * Instructor - Dr. Charlyne Walker
 * 
 * The Pet Store Tester class will construct mammals of different species 
 * and print out the information of each through a menu.
*/
package project5;

import java.util.*;

public class PetStoreTester 
{

    
    public static void main(String[] args) 
    {
        // arraylist for mammals
        ArrayList<Mammal> pets = new ArrayList<Mammal>() ;
        
        // creating different pet objects
        Burmese cat1 = new Burmese() ;
        GoldenRetreaver dog1 = new GoldenRetreaver() ;
        EnglishLop rabbit1 = new EnglishLop() ;
        
        // adding new info on pets
        cat1.createCat("Simon", 2, 7) ;
        dog1.createDog("Spot", 3, 15) ;
        rabbit1.createRabbit("Chewy", 1, 3) ;
    }
    
}
