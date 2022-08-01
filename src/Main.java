public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point point1 = new Point(5,5);
        System.out.println(point1);
        MoveablePoint moveablePoint1 = new MoveablePoint(point1.getX(), point1.getY(),10,20);
        System.out.println("truoc: " + moveablePoint1);
        moveablePoint1.move();
        System.out.println("sau: " + moveablePoint1);

    }
}