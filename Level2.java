import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first level
 * 
 * Eric Tran
 * 9/22/2021
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    private int delay;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        addObject(new SmBrickWall(), 777, 583);
        addObject(new TrapDoor(GRAVITY), 414, 341);
        addObject(new SmBrickWall(), 1121, 468);
        addObject(new Gem(), 1137, 387);
        addObject(new BrickWall(), 424, 424);
        addObject(new SmBrickWall(), 409, 736);
        addObject(new SmBrickWall(), 624, 651);
        addObject(new TrapDoor(GRAVITY), 994, 500);
        addObject(new SmBrickWall(), 556, 183);
        addObject(new SmBrickWall(), 124, 268);
        addObject(new SmBrickWall(), 124, 308);
        addObject(new SmBrickWall(), 124, 348);
        addObject(new SmBrickWall(), 124, 388);
        addObject(new Gem(), 130, 208);
        addObject(new TrapDoor(GRAVITY), 1046, 203);
        addObject(new SmBrickWall(), 872, 245);
        addObject(new Bomb(GRAVITY), 887, 202);
        addObject(new Bomb(GRAVITY), 751, 84);
        addObject(new Bomb(GRAVITY), 69, 344);


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
