/**
 * @author - Miguel Ferreiro 
 * COP-3337 
 * NetBeans IDE 8.2
 * Java 1.8.0_221
 * Instructor - Dr. Charlyne Walker
 * 
 * The EnglishLop class will get all the instance variables and methods 
 * for a cat.
*/
//package project5;


public class EnglishLop extends Rabbit 
{
    public EnglishLop()
    {
        super() ;
        setBreed("English Lop") ;
        setMaxLife(7) ;
    }
    
    public void createRabbit(String n, int a, int w)
    {
        setName(n) ;
        setAge(a) ;
        setWeight(w) ;
    }
}
