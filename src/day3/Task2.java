package day3;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {

    System.out.println("Введите два числа:");
    Scanner scanner = new Scanner(System.in);
    double y = scanner.nextDouble();
    double x = scanner.nextDouble();

    while (true){
    if  (x == 0) {
      break;
    }
    System.out.println(y / x);
     break;
   }
  }
}
