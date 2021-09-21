import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected abstract void fall();
    
    // Return true if the child oject is on the ground,
    // false otherwise
    protected boolean isOnGround()
    {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2,
                                            Platform.class);
        return ground != null;
    }
    
    // Some Child objects fall. This method remove the object
    // once it is out of bounds
    protected void removeOutOfBounds(Obstacle obstacle)
    {
        if(obstacle.getY()> getWorld().getHeight()+
                            obstacle.getImage().getWidth() / 2)
        {
            getWorld().removeObject(obstacle);
        }
    }

}
