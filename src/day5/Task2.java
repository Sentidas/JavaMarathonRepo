package day5;

public class Task2 {
  public static void main(String[] args) {

     Motorbike myMotorbike = new Motorbike (2020, "green", "U456");
     Motorbike yourMotorbike = new Motorbike (2021, "red");

  }
}

class Motorbike {

  private int year;
  private String color;
  private String model;

  public Motorbike (int year, String color, String model) {
    this.year = year;
    this.color = color;
    this.model = model;
  }

  public Motorbike (int year, String color) {
    this.year = year;
    this.color = color;
  }
}
