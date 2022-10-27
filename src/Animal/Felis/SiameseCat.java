package Animal.Felis;

public class SiameseCat extends Felis{
    public SiameseCat(String name, int age, int shelterNo, int BadgeNo){
        super(name, age, shelterNo, BadgeNo, 'l', "brown");        
    }

    @Override
    public String toString() {
        return String.format("SiameseCat{name = %s, age = %d}", getName(), getAge());
    }
}
