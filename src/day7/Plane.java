/* Создать класс Самолет с полями “изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “объем топлива в баке” установить равным 0).
В конструкторе для передачи полям значений использовать ключевое слово this.
Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
Создать новый объект класса Самолет с произвольными данными.
Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза, передав разные значения. Вызвать метод info().*/

package day7;

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

  public static void  infoLength (Plane plane1, Plane plane2) {
    if (plane1.length > plane2.length) {
      System.out.println("Длина первого самолета больше второго");
    } else if (plane1.length < plane2.length) {
      System.out.println("Длина второго самолета больше первого");
    } else {
      System.out.println("Длины самолетов одинаковые");
    }
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
