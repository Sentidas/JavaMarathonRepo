/*  Скопируйте класс Самолет из задания дня 6.
Внесите изменения в класс таким образом, чтобы следующий код выводил информацию о самолете, аналогично вызову метода info().

Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
System.out.println(airplane);*/

package day8;

public class Plane {
  private String maker;
  private int year;
  private int length;
  private int weight;
  private int volumeFuel = 0;

  public Plane(String maker, int year, int length, int weight) {
    this.maker = maker;
    this.year = year;
    this.length = length;
    this.weight = weight;
  }

  public String toString() {
    return "Изготовитель: " + maker + ", год выпуска: " + year +
            ", длина: " + length +  ", вес: " + weight + ", объем топлива в баке: " + volumeFuel;
  }
  public void info () {
    System.out.println("Изготовитель: " + maker + ", год выпуска: " + year +
            ", длина: " + length +  ", вес: " + weight + ", объем топлива в баке: " + volumeFuel);
  }
  public int fillUp (int volume) {
    volumeFuel = volumeFuel + volume;
    return volumeFuel;
  }

  public void setYear(int year) {
    this.year = year;
  }
  public void setLength(int length) {
    this.length = length;
  }

}
