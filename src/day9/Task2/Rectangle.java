package day9.Task2;

public class Rectangle extends Figure {

  private double widht;
  private double height;

  public Rectangle(double widht, double height, String color) {
    super(color);
    this.widht = widht;
    this.height = height;

  }

  @Override
  public double area() {
    return widht * height;
  }

  @Override
  public double perimeter() {
    return 2 * (widht + height);
  }
}
