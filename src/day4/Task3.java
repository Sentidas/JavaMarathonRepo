//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.

package day4;

public class Task3 {
  public static void main(String[] args) {

    int[][] array = new int[12][8];
    int sum = 0;
    int sumMax = 0;
    int index = 0;


    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) Math.ceil(Math.random() * 50);
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        sum = sum + array[i][j];
        System.out.print(array[i][j] + " ");
        if (sumMax < sum) {
          sumMax = sum;
          index = i;
        }
        if (sumMax == sum) {
          index = i;
        }
      }
      System.out.println("сумма этой строки: " + sum);
      sum = 0;
    }
    System.out.println("максимальная сумма элементов в строке (" + sumMax + ")" + " c индексом строки: " + index);
  }
}
