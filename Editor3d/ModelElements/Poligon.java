package Editor3d.ModelElements;

import java.util.ArrayList;
import java.util.List;

import Editor3d.Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();
    public Poligon(Point3D point)
    {
        points.add(point);
    }
}
