import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents an enemy character that falls from the top of the screen.
 * Extends GameObject and implements its abstract methods.
 */
public class EnemyShield extends Enemy {
    
    /**
     * Constructor for EnemyShield.
     * @param x The initial x-coordinate.
     * @param y The initial y-coordinate.
     * @param width The width of the enemy.
     * @param height The height of the enemy.
     * @param speed The falling speed of the enemy.
     */
    public EnemyShield(int x, int y, int width, int height, int speed) {
        super(x, y, width, height,speed, 3 ); // Call superclass constructor
        
    }
    
    
    /**
     * Updates the enemy's position, making it fall downwards.
     * Deactivates the enemy if it goes off-screen.
     */
    @Override
    public void update() {
        // Enemies fall from the top, update y-coordinate using inherited setter
        setY(getY() + this.getSpeed());

        // Deactivate if off-screen (below the bottom of the screen)
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
        
        if(this.getHealth() < 1){
            this.setActive(false);
        }
    }

    /**
     * Draws the enemy character on the screen.
     * @param g The Graphics object used for drawing.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN); // EnemyShield is red
        // Use inherited getters for drawing position and dimensions
        g.fillOval(getX(), getY(), getWidth(), getHeight()); // Draw as a circle/oval
    }
}
