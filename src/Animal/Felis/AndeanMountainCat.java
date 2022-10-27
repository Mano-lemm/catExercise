package Animal.Felis;

public class AndeanMountainCat extends Felis{
    public AndeanMountainCat(String name, int age, char coat, String color){
        super(name, age, -1, -1, 'b', "orange");
    }

    public void miauw(String customSound) {
        makeNoise(customSound);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("AndeanMountainCat{name = %s, age = %d}", getName(), getAge());
    }
}
