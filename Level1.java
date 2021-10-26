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
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    private int delay;
    
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
        Player player = new Player(SPEED, JUMP_FORCE,GRAVITY, MAX_HEALTH,
                                   MAX_POWERUP, NEXT_LEVEL, MUSIC);
                                   
        addObject(player,50,750);
        Door door = new Door();
        addObject(door,1175,42);
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 1000, 500);
        addObject(new SmBrickWall(), 200, 340);
        addObject(new SmBrickWall(), 400, 650);
        addObject(new SmBrickWall(), 1175,90);
        addObject(new AcidRain(GRAVITY), 50, 21);
        addObject(new Rock(GRAVITY), 490, 0);
        addObject(new Bomb(GRAVITY), 1000, 450);
        addObject(new TrapDoor(GRAVITY), 400, 340);
        addObject(new SmBrickWall(), 600, 600);
        addObject(new SmBrickWall(), 600, 340);
        addObject(new TrapDoor(GRAVITY), 780, 187);
        addObject(new SmBrickWall(), 660, 187);
        addObject(new SmBrickWall(), 900, 187);
        addObject(new Gem(), 165, 150);
        addObject(new SmBrickWall(), 165, 200);
        addObject(new Gem(), 1150, 450);
        addObject(new Bomb(GRAVITY), 300, 340);
        addObject(new Bomb(GRAVITY), 490, 340);

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
        
        delay++;
        if(delay % 180 == 0)
        {
            addObject(new Arrow(GRAVITY), 600, 350);
        }
    }
}