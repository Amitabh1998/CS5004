public class ImmutableCircle {
  private final double radius;
  private final Point2D centerPoint;

  public ImmutableCircle(double radius, Point2D centerPoint) {
    this.radius = radius; //primitive type
    //this.centerPoint = centerPoint; // could be issues as this is from a different class.
    // Changes to this value in that class can alter the values here.
    this.centerPoint = new Point2D(centerPoint);
  }

  // Omit the setters since it is immutable


  public Point2D getCenterPoint() {
    return new Point2D(this.centerPoint); // Safe copy
  }

  @Override
  public String toString() {
    return "Immutable Circle @ " + this.centerPoint.getX() + "," + this.centerPoint.getY();
  }
}
