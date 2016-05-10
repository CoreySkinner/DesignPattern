import javax.swing.*;
import java.awt.*;

/**
 * Created by corey on 5/9/16.
 */
public class RedCircle implements Icon {

    private ImageIcon image;
    public RedCircle(){
        image = new ImageIcon("red.png");
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
