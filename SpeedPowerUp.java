import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class SpeedPowerUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpeedPowerUp extends PowerUp
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SpeedPowerUp
     */
    public SpeedPowerUp(int x, int y, int width, int height, int speed)
    {
        // initialise instance variables
        super(x, y , width, height, speed);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String  getWhatPowerUp(){
        return "speed";
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.RED); // Enemy is purpo
        // Use inherited getters for drawing position and dimensions
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // Draw as a circle/oval
    }
}
