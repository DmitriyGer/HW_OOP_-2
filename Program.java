package Home002;

public class Program {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Murka", 10);
        Plate plate = new Plate(14);
        
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();

        System.out.println();

        System.out.println("Сыт ли кот " + cat1.getName() + "? " + cat1.isSatiety());
        System.out.println("Сыт ли кот " + cat2.getName() + "? " + cat2.isSatiety());

        System.out.println();
        
        plate.addFood(14);
        plate.info();
        
    }
}
