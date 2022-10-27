package Animal.Felis;

import java.util.Objects;

import Animal.Animal;

public class Felis extends Animal{
    private static int vaccinationCount = 0;
    private String name;
    private int age;
    private int shelterNo;
    private int BadgeNo;

    protected Felis(){
        this("Catto", 1, -1, -1, 's', "Black");
    }

    protected Felis(String name, int age, int shelterNo,int BadgeNo, char coat, String color){
        super('s', coat, color, 5.0);
        if(shelterNo > 999 || shelterNo < 0){
            shelterNo = Math.abs(shelterNo) % 999;
        }
        if(BadgeNo > 999 || BadgeNo < 0){
            BadgeNo = Math.abs(BadgeNo) % 999;
        }
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.BadgeNo = BadgeNo;
        if(!(this instanceof AndeanMountainCat)){
            vaccinationCount++;
        }
    }

    public void miauw(){
        makeNoise("Miauw");
    }

    public void miauw(int times){
        for (int i = 0; i < times; i++) {
            miauw();
        }
    }

    @Override
    public String toString() {
        return String.format("Felis{name = %s, age = %d}", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBadgeNo() {
        return BadgeNo;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public static int getNoOfVaccinatedCats() {
        return vaccinationCount;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Felis){
            Felis cat = (Felis) obj;
            return this.hashCode() == cat.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.BadgeNo, this.shelterNo);
    }
}