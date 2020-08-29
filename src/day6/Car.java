//В классах Автомобиль и Мотоцикл из прошлого дня реализовать два метода:
 //  первый метод - выводит в консоль строку “Это Автомобиль” (или “Это мотоцикл”)
 //  второй метод - принимает на вход число (год), и возвращает разницу между переданным годом и годом выпуска транспортного средства

package day6;

public class Car {

  private int year;
  private String color;
  private String model;

  public void infoCar () {
    System.out.println("Это Автомобиль");
  }

  public int ageCar (int year) {
    int age = year - this.year;
    return age;
  }

  public void setYear(int year) {
    this.year = year;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }
  public String getColor() {
    return color;
  }
  public String getModel() {
    return model;
  }
}
