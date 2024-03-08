package Home002;

public class Plate {

    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    
    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int summ){
        if (summ <= food) {
            food -= summ;
        }
    }

    public void addFood(int summ){
        food += summ;
        System.out.println("Добавлено " + summ + " еды в тарелку");
    }

    public void info(){
        System.out.println("plate: " + food);
    }
}
