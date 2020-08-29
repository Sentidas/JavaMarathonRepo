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



