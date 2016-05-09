import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Corey on 5/4/2016.
 */
public class CompositeIcon implements Icon {

    private ArrayList<Icon> icons;
    private ArrayList<int[]> coordinates;

    public CompositeIcon(){
        icons = new ArrayList<>();
        coordinates = new ArrayList<>();
    }

    public void addIcon(Icon icon, int x, int y ){

        int[] coor = {x, y};

        icons.add(icon);
        coordinates.add(coor);
    }

    public void printAll( Component c, Graphics g){

        for( int i = 0; i < icons.size(); i++ ){
            icons.get(i).paintIcon(c, g, coordinates.get(i)[0], coordinates.get(i)[1]);
        }
    }

    @Override
    public int getIconHeight() {
        return 30;
    }

    @Override
    public int getIconWidth() {
        return 30;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
