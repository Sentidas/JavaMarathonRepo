//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//       Найти максимум среди сумм трех соседних элементов. Для найденной тройки
//       с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

package day4;

import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {

    int [] array = new int[100];

    for (int i = 0; i<array.length; i++ ) {
      array[i] = (int)Math.ceil(Math.random() *  10000);
    }
    System.out.println(Arrays.toString(array));

    int num = 0;
    int numMax = 0;
    int index1 = 0;
    int index2 = 0;
    int index3 = 0;
    int element = 0;
    for (int i = 2; i<array.length; i++ ) {
      num = array [i-2]+ array [i-1] + array [i];
      if (num>numMax) {
        numMax = num;
        index1 = array [i-2];
        index2 = array [i-1];
        index3 = array [i];
        element = i-2;
      }
      System.out.println(array [i-2] + " " + array [i-1] + " " + array[i] + " = " + num);
    }
    System.out.println("Это максимальная сумма тройки: ["  + index1 + " " + index2 + " " + index3 + "]" + " = "  +  numMax);
    System.out.println("Индекс первого элемента тройки: "  +  element);
  }
}
