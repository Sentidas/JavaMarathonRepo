package day3;
/*Москва, Владивосток, Ростов - Россия. Рим, Милан, Турин - Италия. Ливерпуль, Манчестер, Лондон - Англия. Берлин, Мюнхен, Кёльн - Германия.
При вводе любого другого города вывести сообщение “Неизвестная страна”.*/

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    System.out.println("Введите город:");
    Scanner scanner = new Scanner(System.in);
    String country = scanner.nextLine();

    switch (country) {
      case "Москва":
      case "Владивосток":
      case "Ростов":
        System.out.println("Россия");
        break;
      case "Рим":
      case "Милан":
      case "Турин":
        System.out.println("Италия");
        break;
      case "Ливерпуль":
      case "Манчестер":
      case "Лондон":
        System.out.println("Англия");
        break;
      case "Берлин":
      case "Мюнхен":
      case "Кёльн":
        System.out.println("Германия");
        break;
      case "Stop":
        break;
      default:
        System.out.println("Неизвестная страна");
    }
  }
}
