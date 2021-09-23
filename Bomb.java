import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bomb is an obstacle that damages the player
 * 
 * @Eric Tran
 * @version 9/22/2021
 */
public class Bomb extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Bomb(float gravity)
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
