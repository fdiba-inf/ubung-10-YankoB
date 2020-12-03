package exercise10;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Point startPoint2 = new Point(1, 1);
        Rectangle rectangle2 = new Rectangle(startPoint2, 2, 3);
        Rectangle rectangle3 = new Rectangle(rectangle2);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.initialize();

        System.out.println("1. " + rectangle1);
        System.out.println("2. " + rectangle2);
        System.out.println("3. " + rectangle3);
        System.out.println("4. " + rectangle4);

        System.out.println("2. equals 1.: " + rectangle2.equal(rectangle1));
        System.out.println("2. equals 3.: " + rectangle2.equal(rectangle3));
    }
}