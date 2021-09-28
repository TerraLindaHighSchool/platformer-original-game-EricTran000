import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private Health[] health;
    private Powerup[] powerup;
    private int healthCount;
    private int speed;
    private int walkIndex;
    private int frame;
    private float yVelocity;
    private boolean isWalking;
    private boolean isJumping;
    private boolean isFacingLeft;
    private final GreenfootImage[] WALK_ANIMATION;
    private final GreenfootImage STANDING_IMAGE;
    private final float JUMP_FORCE;
    private final float GRAVITY;
    private final Class NEXT_LEVEL;
    private final GreenfootSound Music;
    
    public Player(int speed,float jumpForce, float gravity, int maxHealth,
                  int maxPowerUp, Class nextLevel, GreenfootSound music)
    { }
                  
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void addedToWorld(World world) {}
    
    private void walk() {}
    private void jump() {}
    private void fall() {}
    private void animator() {}
    private void onCollision() {}
    private void mirrorImages() {}
    private void gameOver() {}
    private boolean isOnGround()
    {
        return false;
    }

}
