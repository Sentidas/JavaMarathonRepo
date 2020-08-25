package day2;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число этажей для постройки дома");
    int countFloors = scanner.nextInt();

    if (countFloors > 0 && countFloors < 5) {
      System.out.println("Малоэтажный дом");
    } else if (countFloors >= 5 && countFloors < 9 ) {
      System.out.println("Среднеэтажный дом");
    } else if (countFloors > 8) {
      System.out.println("Многоэтажный дом");
    } else {
      System.out.println("Вы ввели неверные данные для постойки дома. Вы хотите постоить подвал?");
    }

    scanner.close();
  }
}
