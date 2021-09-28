import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first level
 * 
 * Eric Tran
 * 9/22/2021
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,83,616);
        Door door = new Door();
        addObject(door,1175,42);
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        addObject(new Floor(), 600, 760);
        addObject(new BrickWall(), 1000, 500);
        addObject(new SmBrickWall(), 500, 340);
        addObject(new SmBrickWall(), 400, 650);
        addObject(new SmBrickWall(), 1175,90);
        addObject(new AcidRain(GRAVITY), 50, 21);
        addObject(new Rock(GRAVITY), 21, 600);
        addObject(new Bomb(GRAVITY), 100, 500);
        addObject(new TrapDoor(GRAVITY), 750, 340);
        addObject(new SmBrickWall(), 628, 579);
        addObject(new SmBrickWall(), 564, 440);
        addObject(new TrapDoor(GRAVITY), 780, 187);
        addObject(new SmBrickWall(), 660, 187);
        addObject(new SmBrickWall(), 900, 187);

    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200),-30);
        }
        
        if(Math.random() < 0.01)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200),-30);
        }
    }
}