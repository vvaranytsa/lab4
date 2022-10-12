package kick;

import lotr.Character;

public class HobbitKick implements BasicKick {

   private void toCry(){
       System.out.println("Tears, tears!");
   }

    @Override
    public void kick(Character c1, Character c2) {
        toCry();
    }
}

