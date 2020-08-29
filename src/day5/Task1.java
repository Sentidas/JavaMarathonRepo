package day5;

import java.sql.SQLOutput;

public class Task1 {
  public static void main(String[] args) {

    Car car = new Car();
    car.setYear(1990);
    car.setColor("red");
    car.setModel("V32");

    System.out.println("Ты купил машину " + car.getYear() + "-ого года выпуска, цвета " + car.getColor() + ", " + car.getModel() + " - модель");
  }
}


class Car {
  private int year;
  private String color;
  private String model;

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