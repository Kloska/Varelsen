package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

/**
 * This is a class
 * Created 2021-11-15
 *
 * @author Magnus Silverdal
 */
public class Stick {
    private int x;
    private int y;

    public Stick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {

    }

    public Sprite getSprite() {
        return null;
    }

}
