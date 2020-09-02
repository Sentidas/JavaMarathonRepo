package day7;

import day6.Plan;

import javax.jws.Oneway;

public class Task2 {
  public static void main(String[] args) {


    Player player1 = new Player(99);
    Player player2 = new Player(100);
    Player player3 = new Player(90);

    Player.info();
    Player player4 = new Player(92);
    Player player5 = new Player(97);
    Player.info();

    Player player6 = new Player(99);
    Player player7 = new Player(99);
    Player.info();

    for (int i = player2.getStamina(); i>=0; i--) {
      player2.run();
    }
    Player.info();
    for (int i = player3.getStamina(); i>=0; i--) {
      player3.run();
    }
    Player.info();
  }
}
