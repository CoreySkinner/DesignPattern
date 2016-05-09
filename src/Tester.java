import javax.swing.*;
import java.awt.*;

/**
 * Created by corey on 5/4/16.
 */
public class Tester extends JFrame{

    private CompositeIcon compositeIcon;

    public Tester(){
        compositeIcon = new CompositeIcon();
        make();
    }

    public void make(){

        setTitle("Design Pattern");
        setSize(600, 400);
        /*for( int i = 0; i < 3; i++ ){
            ImageIcon blue = new ImageIcon("blue.png");
            compositeIcon.addIcon(blue, ( i + 30 ) * 100, ( i + 30 ) * 100 );
        }
        compositeIcon.printAll(this, getGraphics());*/

        ImageIcon blue = new ImageIcon("blue.png");
        JLabel label = new JLabel(blue);
        label.setSize(200, 200);
        add(label);
        setVisible(true);
    }

    public static void main( String[] args ){
        Tester tester = new Tester();
    }
}
