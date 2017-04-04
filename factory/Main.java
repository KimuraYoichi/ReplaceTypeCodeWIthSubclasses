public class Main {
    public static void main(String[] args) {
        Shape line = Shape.createShape(ShapeFactory.LineFactory.factory, 0, 0, 100, 200);
        Shape rectangle = Shape.createShape(ShapeFactory.RectangleFactory.factory, 10, 20, 30, 40);
        Shape oval = Shape.createShape(ShapeFactory.OvalFactory.factory, 100, 200, 300, 400);

        Shape[] shape = {
            line, rectangle, oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
