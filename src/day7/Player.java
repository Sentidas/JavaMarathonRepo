package day7;



public class Player {
  private int stamina;
  private static final int MAX_STAMINA = 100;
  private static final int MIN_STAMINA = 0;
  static int countPlayers = 0;

  public Player(int stamina) {
    this.stamina = stamina;
    if (countPlayers < 6)
      countPlayers++;
  }

  public void run() {
      if (stamina == 0)
        return;
      stamina = stamina - 1;
      if (stamina == 0)
        countPlayers--;
  }

  public static void info (){
    if (countPlayers < 6) {
      System.out.println("Команды неполные, еще есть " + (6 - countPlayers) +   " свободных мест");
    } else {
      System.out.println("Мест в командах больше нет");
    }
  }

  public int getStamina() {
    return stamina;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }
}
