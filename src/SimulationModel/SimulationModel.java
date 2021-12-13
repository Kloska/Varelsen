package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    Stick s;
    public SimulationModel() {
        s = new Stick(4,2);
    }
    public void update() {
        s.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s.getShape());
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(s.getSprite());
        return sprites;
    }
}
