import java.util.Arrays;

public class Cat extends Animal {
    String creature = "cat";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = false;
    
    public Cat(String name, String color, Integer age, Boolean vaccination,
            String species, Integer legsCount, String creature, Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, creature, run, fly, swim);

    }

    
    private void FIndFood() {
        System.out.println("Котик нашла пропитание ");
    }

    private void FIndFood(int... args) {
        System.out.println("Котик нашла еду, count = " + Arrays.toString(args));
    }

    private void WakeUp() {
        System.out.println("Кошак проснулся ");
    }

    private void Sleep() {
        System.out.println("Котя спит ");
    }

    private void Eat() {
        System.out.println("Кот съел ");
    }

    public void Hunt(int... args) {
        WakeUp();
        FIndFood(args);
        Eat();
        Sleep();
    }
}
