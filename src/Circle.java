public class Circle {
  private double radius;
  //private int x;
  //private int y;
  Point2D centerPoint;
  //private final String COLOR = "Red";
  private Color circleColor;

  /**
   *
   * @param radius
   * @param x
   * @param y
   */
  public Circle(double radius, int x, int y) {
    this.radius = radius;
    this.centerPoint = new Point2D(x,y);
    this.circleColor = Color.BLUE;
//    this.x = x;
//    this.y = y;
  }

  /**
   * default constructor.
   */
  public Circle() {
    this(1,0,0);
  }

  public Circle(Circle copy) {
    this(copy.radius, copy.centerPoint.getX(), copy.centerPoint.getY());
//    this.radius = copy.radius;
//    this.x = copy.x;
//    this.y = copy.y;
  }

  /**
   *
   * @return Area of the circle.
   */
  public double getArea() {
    return Math.PI * Math.pow(this.radius,2);
  }

  /**
   *
   * @return String representation of the radius and color of the circle.
   */
  public String toString() {
    return "The radius of the circle is " + this.radius
            + " @ " + this.centerPoint.getX()
            + " , " + this.centerPoint.getY()
            + " and color " + this.COLOR;
  }
}
