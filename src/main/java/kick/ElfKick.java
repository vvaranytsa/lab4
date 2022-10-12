package kick;

import lotr.Character;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character c1, Character c2) {
        if (c1.getPower() > c2.getPower()) {
            c2.setHp(0);
        } else {
            c1.setPower(c1.getPower() - 1);
        }
    }
}
