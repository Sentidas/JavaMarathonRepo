package day6;

public class Task1 {
  public static void main(String[] args) {

    Motorbike motorbike = new Motorbike(2000, "red", "v12");
    motorbike.infoMotorbike();
    System.out.println(motorbike.ageMotorbike(2020));

    Car car = new Car();
    car.setYear(2010);
    car.setColor("green");
    car.setModel("audi");
    car.infoCar();
    System.out.println(car.ageCar(2020));
  }
}
