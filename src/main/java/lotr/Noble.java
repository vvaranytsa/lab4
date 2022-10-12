package lotr;

import kick.NoblKick;

import java.util.Random;

public abstract class Noble extends lotr.Character{
    private static final Random randomGenerator= new Random();
        public Noble(int min, int max){
            super(randomGenerator.nextInt(max-min)+min, randomGenerator.nextInt(max-min)+min, new NoblKick());
        }

}
