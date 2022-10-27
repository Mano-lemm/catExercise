package Animal.Felis;

public class TurkishVanCat extends Felis{
    private String nickname;

    public TurkishVanCat(){
        this("Jonathan van Amelen", 1, -1, -1, "Jantje");
    }

    public TurkishVanCat(String name, int age, int shelterNo,int BadgeNo, String nickname){
        super(name, age, shelterNo, BadgeNo, 'm', "tabby");
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return String.format("TurkishVanCat{name = %s, age = %d, nickname = %s}", getName(), getAge(), this.nickname);
    }
}