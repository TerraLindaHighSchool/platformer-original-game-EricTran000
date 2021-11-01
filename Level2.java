import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first level
 * 
 * Eric Tran
 * 9/22/2021
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.09500f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 4;
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
        addObject(new SmBrickWall(), 843, 583);
        addObject(new SmBrickWall(), 1121, 468);
        
        addObject(new BrickWall(), 424, 444);
        addObject(new SmBrickWall(), 409, 736);
        addObject(new SmBrickWall(), 624, 651);
        addObject(new SmBrickWall(), 556, 183);
        addObject(new SmBrickWall(), 124, 288);
        addObject(new SmBrickWall(), 124, 328);
        addObject(new SmBrickWall(), 124, 368);
        addObject(new SmBrickWall(), 124, 408);
        addObject(new SmBrickWall(), 124, 444);

        addObject(new Gem(), 130, 208);
        addObject(new SmBrickWall(), 872, 245);
        addObject(new Bomb(GRAVITY), 867, 211);
        addObject(new Bomb(GRAVITY), 69, 344);

        Crossbow crossbow = new Crossbow();
        addObject(crossbow,1138,696);
        Crossbow crossbow2 = new Crossbow();
        addObject(crossbow2,1136,616);
        Crossbow crossbow3 = new Crossbow();
        addObject(crossbow3,1136,548);

        SmBrickWall smBrickWall11 = new SmBrickWall();
        addObject(smBrickWall11,1138,103);
        Gem gem2 = new Gem();
        addObject(gem2,857,102);
        Crossbow crossbow4 = new Crossbow();
        addObject(crossbow4,1142,201);

    }
    //spawns various objects
    private void spawn()
    {   
        delay++;
        if(delay % 210 == 0)
        {
            addObject(new AcidRain(GRAVITY), 349,-30);
        }
        if(delay % 210 == 0)
        {
            addObject(new Arrow(GRAVITY), 1108, 696);
        }
        if(delay % 240 == 0)
        {
            addObject(new Arrow(GRAVITY), 1108, 616);
        }
        if(delay % 270 == 0)
        {
            addObject(new Arrow(GRAVITY), 1108, 548);
            addObject(new Arrow(GRAVITY), 1112, 201);
        }
        
        if(delay % 900 == 0)
        {
            addObject(new Gem(), 130, 208);
            addObject(new Gem(), 857,102);
        
        }
    }
}
