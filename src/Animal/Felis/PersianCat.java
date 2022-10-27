package Animal.Felis;

public class PersianCat extends Felis{
    public PersianCat(){
        this("stray", 1, -1, -1);
    }

    public PersianCat(String name, int age, int shelterNo, int BadgeNo){
        super(name, age, shelterNo, BadgeNo, 'l', "brown");
    }

    @Override
    public void miauw() {
        makeNoise("Mrrraaw (persisch)");
    }

    @Override
    public String toString() {
        return String.format("PersianCat{name = %s, age = %d}", getName(), getAge());
    }
}
