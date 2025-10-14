public class Shape {
    public enum ShapeType {
        CIRCLE,
        SQUARE,
        TRIANGLE
    }
    
    public static void main(String[] args) {
        ShapeType myShape = ShapeType.CIRCLE;
        System.out.println("My shape is a " + myShape);
    }
}
