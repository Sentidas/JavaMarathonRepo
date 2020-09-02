/*Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.

Вызовите эти два метода на массиве figures и выведите результат в консоль. */


        package day9.Task2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.concurrent.TransferQueue;

public class TestFigures {
  public static void main(String[] args) {

    Figure[] figures = {
            new Triangle(10, 10, 10, "Red"),
            new Triangle(10, 20, 30, "Green"),
            new Triangle(10, 20, 15, "Red"),
            new Rectangle(5, 10, "Red"),
            new Rectangle(40, 15, "Orange"),
            new Circle(4, "Red"),
            new Circle(10, "Red"),
            new Circle(5, "Blue")
    };

    System.out.println(calculateRedPerimeter(figures));
    System.out.println(calculateRedArea(figures));
  }

  public static double calculateRedPerimeter(Figure[] figures) {
    double sumPer = 0;
    for (int i = 0; i < figures.length; i++) {
      if (figures[i].getColor().equals("Red")) {
        sumPer = sumPer + figures[i].perimeter();
      }
    }
    return sumPer;
  }

  public static double calculateRedArea(Figure[] figures) {
    double sumArea = 0;
    for (int i = 0; i < figures.length; i++) {
      if (figures[i].getColor().equals("Red")) {
        sumArea = sumArea + figures[i].area();
      }
    }
    return sumArea;
  }
}

