import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,216,232);
        pizza.setLocation(223,229);
        Topping topping = new Topping("Cheese");
        addObject(topping,223,229);
        pizza.setLocation(229,229);
        Topping topping2 = new Topping("Pepperoni");
        addObject(topping2,229,229);
        pizza.setLocation(214,231);
        Topping topping3 = new Topping("BellPeppers");
        addObject(topping3,214,231);
        pizza.setLocation(235,208);
        pizza.setLocation(236,194);
        pizza.setLocation(249,215);
    }
}
