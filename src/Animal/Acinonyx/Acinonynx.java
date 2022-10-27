package Animal.Acinonyx;

import Animal.Animal;

public class Acinonynx extends Animal{
    private double speed;

    protected Acinonynx(){
        super();
        this.speed = 1;
    }

    protected Acinonynx(char size, char coat, String color, double weight, double speed){
        super(size, coat, color, weight);
        this.speed = speed;
    }

    public void kiauuww(){
        System.out.println("kiauuww!!");
    }

    public void run(int distance){
        System.out.printf("The Acionynx ran %d meters at %.2f m/s, in for %.2f seconds.",
                          distance, speed, distance / speed);
    }
}
