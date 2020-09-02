//1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 //       В классе Самолет создать статический метод, который в качестве аргументов принимает два объекта класса Airplane
 //       (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.

package day7;

public class Task1 {

  public static void main(String[] args) {
    Plane plane1 = new Plane ("plane", 2020, 100, 50);
    Plane plane2 = new Plane ("summer", 2020, 50, 50);

    Plane.infoLength(plane1,plane2);
  }
}
