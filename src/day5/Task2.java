package day5;

public class Task2 {
  public static void main(String[] args) {

     Motorbike myMotorbike = new Motorbike (2020, "green", "U456");
     Motorbike yourMotorbike = new Motorbike (2021, "red");

    System.out.println("Ты купил мотоцикл " + yourMotorbike.getYear() + "-ого года выпуска, цвета " + yourMotorbike.getColor());

    System.out.println("Я купил мотоцикл " + myMotorbike.getYear() + "-ого года выпуска, цвета " + myMotorbike.getColor() +
            ", " + myMotorbike.getModel() + " - модель");
  }
}

