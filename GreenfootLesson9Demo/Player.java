import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    class Direction {
        public static final int UP = -90;
        public static final int DOWN = 90;
        public static final int LEFT = 180;
        public static final int RIGHT = 0;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            setRotation(Direction.UP);
        } else if(Greenfoot.isKeyDown("down")){
            setRotation(Direction.DOWN);
        } else if(Greenfoot.isKeyDown("left")){
            setRotation(Direction.LEFT);
        } else if(Greenfoot.isKeyDown("right")){
            setRotation(Direction.RIGHT);
        }

    }    
}
