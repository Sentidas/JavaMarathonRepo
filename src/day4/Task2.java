/*Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя циклы for each вывести:
        наибольший элемент массива
        наименьший элемент массива
        количество элементов массива, оканчивающихся на 0
        сумму элементов массива, оканчивающихся на 0 */
package day4;


public class Task2 {
  public static void main(String[] args) {

    int array[] = new int[100];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) Math.ceil(Math.random() * 10000);
    }
    int numMax = 0;
    for (int num : array) {
      if (num > numMax) {
        numMax = num;
      }
    }
    System.out.println("Это максимальное число массива: " + numMax);

    int numMin = 10000;
    for (int num : array) {
      if (num < numMin) {
        numMin = num;
      }
    }
    System.out.println("Это минимальное число массива: " + numMin);

    int count  = 0;
    for (int num : array) {
      if (num % 10 == 0) {
        count ++;
      }
    }
    System.out.println("Это количество элементов массива, оканчивающихся на 0: " + count);

    int countSum  = 0;
    for (int num : array) {
      if (num % 10 == 0) {
        countSum = countSum+num;
      }
    }
    System.out.println("Это cумма элементов, оканчивающихся на 0: " + countSum);
  }
}
