package kick;

import lotr.Character;

public class NoblKick implements BasicKick {

    @Override
    public void kick(Character c1, Character c2) {
        c2.setHp(c2.getHp()- c1.getPower());
    }
}
