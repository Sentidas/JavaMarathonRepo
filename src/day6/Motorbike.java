package day6;

public class Motorbike {

  private int year;
  private String color;
  private String model;

  public Motorbike(int year, String color, String model) {
    this.year = year;
    this.color = color;
    this.model = model;
  }
  public void infoMotorbike () {
    System.out.println("Это Мотоцикл");
  }

  public int ageMotorbike (int year) {
    int age = year - this.year;
    return age;
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
