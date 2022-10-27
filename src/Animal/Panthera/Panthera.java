package Animal.Panthera;

import Animal.Animal;

public class Panthera extends Animal{
    protected Panthera(){
        super();
    }

    protected Panthera(char size, char coat, String color, double weight){
        super(size, coat, color, weight);
    }

    public String roar(){
        return "Rawr";
    }

    public void hunt(){
        System.out.print("De jacht was ");
        if(Math.random() > .5){
            System.out.println("successvol.");
        } else {
            System.out.println("onsuccessvol.");
        }
    }
}
