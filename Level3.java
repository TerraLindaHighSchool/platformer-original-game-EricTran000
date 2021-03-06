import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first level
 * 
 * Eric Tran
 * 9/22/2021
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.09500f;
    private final GreenfootSound MUSIC = new GreenfootSound("Jazz edit 1 audacity.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 4;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    private int delay;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        addObject(new BrickWall(), 504, 565);
        addObject(new SmBrickWall(), 1037, 687);
        addObject(new SmBrickWall(), 900, 416);
        addObject(new SmBrickWall(), 175,438);
        addObject(new AcidRain(GRAVITY), 50, 21);
        addObject(new Rock(GRAVITY), 490, 0);
        addObject(new Crossbow(), 1160, 310);
        addObject(new SmBrickWall(), 552, 180);
        addObject(new SmBrickWall(), 768, 196);
        addObject(new SmBrickWall(), 268, 154);
        addObject(new Gem(), 230, 102);
        addObject(new Gem(), 450, 300);
        addObject(new Bomb(GRAVITY), 930, 350);
        addObject(new Bomb(GRAVITY), 1160, 280);

        Crossbow crossbow = new Crossbow();
        addObject(crossbow,1147,504);

        Gem gem3 = new Gem();
        addObject(gem3,668,170);
        gem3.setLocation(970,163);
    }
    //spawns various objects
    private void spawn()
    {
        if(Math.random() < 0.0020)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(800),-30);
        }
        
        if(delay % 75 == 0)
        {
            addObject(new AcidRain(GRAVITY), 668, -30);
        }
        
        delay++;
        if(delay % 180 == 0)
        {
            addObject(new Arrow(GRAVITY), 1100, 504);
        }
        
        if(delay % 130 == 0)
        {
            addObject(new Arrow(GRAVITY), 1130, 310);
        }
        
        if(delay % 900 == 0)
        {
            addObject(new Gem(), 230, 102);
            addObject(new Gem(), 450, 300);
            addObject(new Gem(), 970, 163);
        
        }
    }
}
