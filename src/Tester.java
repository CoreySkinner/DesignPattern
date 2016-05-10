import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by corey on 5/4/16.
 */
public class Tester extends JFrame{

    private CompositeIcon compositeIcon;
    private Random rng;

    public Tester(){
        compositeIcon = new CompositeIcon();
        rng = new Random();
        make();
    }

    public void make(){

        setTitle("Design Pattern");
        setSize(600, 400);
        int x, y;

        for( int i = 0; i < 12; i++ ){
            x = rng.nextInt() % 500 + 50;
            y = rng.nextInt() % 300 + 50;

            if( rng.nextInt() % 2 == 0 ){
                compositeIcon.addIcon( new BlueCircle(), x, y );
            }
            else
                compositeIcon.addIcon( new RedCircle(), x, y );
        }
        compositeIcon.printAll(this, this.getGraphics());

        setVisible(true);
    }

    public static void main( String[] args ){
        Tester tester = new Tester();
    }
}
