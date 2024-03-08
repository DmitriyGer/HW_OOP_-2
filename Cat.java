package Home002;

public class Cat {

    private String name;

    private int appetite;

    private boolean satiety;

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean isSatiety() {
        return satiety; 
    }

    public void eat(Plate plate){
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " больше не голоден");
        } else {
            System.out.println("Коту " + name + " не хватило еды");
        }
    }

    
}
