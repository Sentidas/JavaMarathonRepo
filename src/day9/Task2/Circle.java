package day9.Task2;

public class Circle extends Figure{

  private double radius;

  public Circle(double r, String color) {
    super(color);
    this.radius = r;
  }

  @Override
  public double area() {
    return 3.14 * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2 * 3.14 * radius;
  }
}
