import javax.swing.*;
import java.awt.*;

/**
 * Created by corey on 5/4/16.
 */
public class BlueCircle implements Icon {

    private ImageIcon image;

    public BlueCircle(){
        image = new ImageIcon("blue.png");
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
