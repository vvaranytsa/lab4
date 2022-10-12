package lotr;


import org.apache.log4j.BasicConfigurator;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;

public class CharacterFactory {
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Character first = createCharacter();
        Character second = createCharacter();
        System.out.println("Two fighters: " + first + " " + second );
        GameManager.Fight(first, second);

    }

    public static Character createCharacter() throws Exception {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> arr = reflections.getSubTypesOf(lotr.Character.class);
        arr.removeIf(aClass -> Modifier.isAbstract(aClass.getModifiers()));
        System.out.println(arr);
        Class[] arr1 = arr.toArray(new Class[arr.size()]);
        return (Character) arr1[new Random().nextInt(arr1.length)].getDeclaredConstructor().newInstance();
    }
}
