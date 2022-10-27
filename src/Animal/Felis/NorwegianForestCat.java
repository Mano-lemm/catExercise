package Animal.Felis;

public class NorwegianForestCat extends Felis{
    public NorwegianForestCat(){
        this("Wild cat", 1, -1, -1, "Brown");
    }

    public NorwegianForestCat(String name, int age, int shelterNo, int BadgeNo, String color){
        super(name, age, shelterNo, BadgeNo, 'l', color);
    }

    public void miauwInNorwegian(){
        makeNoise("Miauw (i swear this is norwegian)");
    }

    @Override
    public String toString() {
        return String.format("NorwegianForestCat{name = %s, age = %d}", getName(), getAge());
    }
}
