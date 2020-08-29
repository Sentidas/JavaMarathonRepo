package day6;

public class Task2 {
  public static void main(String[] args) {
    Plan plan = new Plan ("Gate", 2019, 8, 167);
    plan.info();
    plan.setYear(2015);
    plan.setLength(10);
    plan.fillUp(10);
    plan.fillUp(20);
    plan.info();
  }
}
