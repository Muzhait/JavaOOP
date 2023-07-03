public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Duck kudah = new Duck("Donald", "gray", 10, "duck", true, true, true);
        kudah.toRun();
        kudah.toFly();
        kudah.toSwim();
        System.out.println();

        Cat slon = new Cat("Musya", "green", 7, true, "Milky", 4, "cat", true, false, false);
        slon.toRun();
        slon.toFly();
        slon.toSwim();
        System.out.println();

        Dog mamonth = new Dog("Pesik", "red", 12, false, "Lion", 4, "dog", true, false, true);
        mamonth.toRun();
        mamonth.toFly();
        mamonth.toSwim();
        System.out.println();
    }
}
