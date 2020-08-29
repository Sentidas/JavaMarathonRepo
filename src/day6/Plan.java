/* Создать класс Самолет с полями “изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “объем топлива в баке” установить равным 0).
В конструкторе для передачи полям значений использовать ключевое слово this.
Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
Создать новый объект класса Самолет с произвольными данными.
Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза, передав разные значения. Вызвать метод info().*/

package day6;

public class Plan {
  private String maker;
  private int year;
  private int length;
  private int weight;
  private int volumeFuel = 0;

  public Plan(String maker, int year, int length, int weight) {
    this.maker = maker;
    this.year = year;
    this.length = length;
    this.weight = weight;
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
