package lotr;


import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public abstract class Character  {
    @Getter
    private int hp;
    @Setter
    @Getter
    private int power;

    private BasicKick kick;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void kick(Character c2) {
        kick.kick(this, c2);
    }
}
