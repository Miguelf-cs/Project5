/**
 * @author - Miguel Ferreiro 
 * COP-3337 
 * NetBeans IDE 8.2
 * Java 1.8.0_221
 * Instructor - Dr. Charlyne Walker
 * 
 * The Cat abstract class will get all the instance variables and methods 
 * for a cat while using the Mammal interface.
*/
//package project5;


public abstract class Cat implements Mammal
{
    //Cat instance vairables
    private String name ;
    private String breed ;
    private int age ; 
    private int weight ;
    private int maxLife ;
    
    //Constructor of a cat
    public Cat()
    {
        name = "NO NAME" ;
        breed = "NO BREED" ;
        age = 0 ;
        weight = 0 ;
        maxLife = 0 ;
    }
    
    //Abstract method for when a new cat comes in(only name, age and weight will vary)
    public abstract void createCat(String n, int a, int w) ;

    //Getter methods of Cat
    public String getName() 
    {
        return name ;
    }

    public String getBreed() 
    {
        return breed ;
    }

    public int getAge() 
    {
        return age ;
    }

    public int getWeight() 
    {
        return weight ;
    }

    public int getMaxLife() 
    {
        return maxLife ;
    }

    //Setter methods of Cat
    public void setName(String name) 
    {
        this.name = name ;
    }

    public void setBreed(String breed) 
    {
        this.breed = breed ;
    }

    public void setAge(int age) 
    {
        this.age = age ;
    }

    public void setWeight(int weight) 
    {
        this.weight = weight ;
    }

    public void setMaxLife(int maxLife) 
    {
        this.maxLife = maxLife ;
    }

    //Abstract eatTime method from Mammal interface
    public String eatTime()
    {
        return "Cats should eat twice a day and their favorite snack is canned fish!" ;
    }
    
    //Abstract sleepTime method from Mammal interface
    public String sleepTime()
    {
        return "Cats tend to sleep 12-14 hours a day." ;
    }
    
    //Abstract numOfBabies method from Mammal interface
    public String numOfBabies()
    {
        return "Cats can range between 1 to 12 kittens in each litter!" ;
    }
    
    @Override
    public String toString() 
    {
        return "This cat right here is a " + getBreed() + " named " + getName() + "." 
                + " It weighs over" + getWeight() + " pounds and they are expected to live over "
                + getMaxLife() + " years." ;
    }
    
}
