import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon2 extends Actor
{
    // instance variables
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon2(int hp, int ap, String name, String attack, String type){
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.img = new GreenfootImage(name.toLowerCase()+".png");
        setImage(this.img);
        this.img.scale(160, 160);
        this.attack = new Attack(attack);
        this.type = type;
        this.outStatus = false;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void attack(String aName, User enemy){
        // takeDamage(enemy.getPokemon().getAPower(aName, enemy));
        enemy.getPokemon().takeDamage(getAPower(aName, enemy));
    }
    
    public void takeDamage(int amount){
        this.hp -= amount;
        if (this.hp < 0){
            this.hp = 0;
        }
    }
    
    public void heal(){
        this.hp += 20;
    }
    
    public void printAttack(){
        System.out.print(this.attack);
    }
    
    public Attack getAttack(){
        return this.attack;
    }
    
    public boolean isOut(){
        return this.hp<=0;
    }
    
    public int getAPower(String aName, User enemy){
        Attack a = enemy.getPokemon().getAttack();
        return a.getPower();
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public int getAp(){
        return this.ap;
    }
    
    /**
     * Act - do whatever the Pokemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}

