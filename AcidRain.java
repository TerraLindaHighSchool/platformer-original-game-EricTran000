import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Droplets that fall from the sky and damage the player
 * 
 * Eric Tran
 * 9/22/2021
 */
public class AcidRain extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public AcidRain(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        yVelocity += GRAVITY;
        setLocation(getX(), getY() + (int) yVelocity);
        removeOutOfBounds(this);
    }
}
