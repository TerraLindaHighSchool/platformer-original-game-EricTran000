import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The TrapDoor is a platform that the player can't stand on
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrapDoor extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public TrapDoor(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
    }
    
    protected void fall()
    {
    }
}
