package класи1;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {

        Robot robot1 = new Robot("Vasya", 15, 220);
        System.out.println(robot1.getName());
        System.out.println(robot1.getAge());
        System.out.println(robot1.getPower());
        Robot robot2 = new Robot("Petya", 22, 120);
        System.out.println(robot2.getName());
        System.out.println(robot2.getAge());
        System.out.println(robot2.getPower());
        boolean robot1Wins = robot1.fight(robot2);
        boolean robot2Wins = robot2.fight(robot1);
        System.out.println("Robot 1 vs Robot 2: " + (robot1Wins ? "Robot 1 wins" : "Robot 2 wins"));
        System.out.println("Robot 2 vs Robot 1: " + (robot2Wins ? "Robot 2 wins" : "Robot 1 wins"));

    }
}
