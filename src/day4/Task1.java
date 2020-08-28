package day4;

/* С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
        а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
        е) Сумме всех элементов массива */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {

    System.out.println("Введите длину массива");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) Math.ceil(Math.random() * 10);
    }
    System.out.println(Arrays.toString(array));
    System.out.println("Длина массива: " + array.length);

    int countMoreEight = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 8) {
        countMoreEight++;
      }
    }
    System.out.println("Количество чисел больше 8: " + countMoreEight);

    int countEqlOne = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1) {
        countEqlOne++;
      }
    }
    System.out.println("Количество чисел равных 1: " + countEqlOne);

    int countEven = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        countEven++;
      }
    }
    System.out.println("Количество четных чисел: " + countEven);

    int countNotEven = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        countNotEven++;
      }
    }
    System.out.println("Количество нечетных чисел: " + countNotEven);

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum=sum+array[i];
      }
      System.out.println("Сумма всех элементов массива: " + sum);
    }
  }

