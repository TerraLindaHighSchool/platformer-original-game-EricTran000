import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Obstacle
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private float xVelocity;
    private final float GRAVITY;
    
    public Arrow(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        xVelocity = -4;
        setLocation(getX() + (int) xVelocity, getY());
        removeOutOfBounds(this);
    }
}
