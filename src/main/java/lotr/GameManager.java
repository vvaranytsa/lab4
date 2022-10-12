package lotr;

import java.util.SortedMap;

public class GameManager {
    public static void Fight(Character c1, Character c2) {
        int i = 0;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + ++i + ":");
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            System.out.println("Fight! " + "\n" + c1 + "\n" + c2 + "\n");
        }
        String winner = (c1.isAlive()) ? c1.getClass().getSimpleName() + " wins!!!" : c2.getClass().getSimpleName() + " wins!!!";
        System.out.println(winner);
    }
}
