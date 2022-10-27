package Animal;

public class Animal {
    protected static int animalCount = 0;
    private char size;
    private char coat;
    private String color;
    private double weight;

    protected Animal(){
        this('s', 's', "black", 10);        
    }

    protected Animal(char size, char coat, String color, double weight){
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
        animalCount++;
    }

    public void makeNoise(String sound){
        System.out.println(sound);
    }

    public void eat(){
        System.out.println("Het dier eet.");
        weight += 0.1;
    }

    public void sleep(){
        System.out.println("Het dier slaapt.");
    }

    public boolean isAlive(){
        return true;
    }

    public char getSize() {
        return size;
    }

    public char getCoat() {
        return coat;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
