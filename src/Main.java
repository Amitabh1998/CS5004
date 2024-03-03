public class Main {
  public static void main(String[] args) {
//    Circle circle = new Circle(1,0,1);
//    System.out.println(circle.getArea());
//    System.out.println(circle);
//
//    Circle c = new Circle();
//    System.out.println(c.getArea());
//    System.out.println(c);
//
//    Circle c2 = new Circle(c);
//    System.out.println(c2);

    ImmutableCircle ic = new ImmutableCircle(1, new Point2D(1,1));
    System.out.println(ic);
    Point2D p = new Point2D(1,2);
    ImmutableCircle iCircle = new ImmutableCircle(2,p);
    System.out.println(iCircle);
    p.setX(123 );
    System.out.println(iCircle);

    Point2D p2 = iCircle.getCenterPoint();
    p2.setX(222);
    System.out.println(iCircle);
  }
}
