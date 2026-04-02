import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class PowerUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class PowerUp extends GameObject
{
    private int speed; // Speed at which the enemy falls
   
    /**
     * Constructor for Enemy.
     * @param x The initial x-coordinate.
     * @param y The initial y-coordinate.
     * @param width The width of the enemy.
     * @param height The height of the enemy.
     * @param speed The falling speed of the enemy.
     */
    public PowerUp(int x, int y, int width, int height, int speed) {
        super(x, y, width, height); // Call superclass constructor
        this.speed = speed;
        
    }
    
    public int getSpeed(){
        return speed;
    }
    
    /**
     * Updates the enemy's position, making it fall downwards.
     * Deactivates the enemy if it goes off-screen.
     */
    @Override
    public void update() {
        // Enemies fall from the top, update y-coordinate using inherited setter
        setY(getY() + speed);

        // Deactivate if off-screen (below the bottom of the screen)
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
        
        
    }
    
    public abstract String  getWhatPowerUp();
    
    /**
     * Draws the enemy character on the screen.
     * @param g The Graphics object used for drawing.
     */
    //@Override
    public abstract void draw(Graphics g);
}
