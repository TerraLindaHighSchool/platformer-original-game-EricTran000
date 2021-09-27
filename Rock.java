import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rocks fall from the sky and land on the ground to damage the player
 * 
 * Eric Tran 
 * 9/22/2021
 */
public class Rock extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    //causes object to fall unto a platform below
    public Rock(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        if(!isOnGround())
        {
            yVelocity += GRAVITY;
            setLocation(getX(), getY() + (int) yVelocity);
        }
    }
}
