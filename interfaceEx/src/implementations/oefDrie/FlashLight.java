package implementations.oefDrie;

import javax.swing.SpinnerDateModel;

import interfaces.oefDrie.Battery;

public class FlashLight {
    private Battery battery;

    public FlashLight(Battery battery){
        this.battery = battery;
    }

    private String getFlashPower(int power){
        if(power > 200){
            return "brightly ";
        } 
        if(power > 100){
            return "";
        }
        if(power > 10){
            return "dimly ";
        }
        return "UNREACHABLE REACHED ";
    }

    public void useBattery(){
        battery.deliverPower();
    }

    public void Flash(){
        int power = battery.deliverPower();
        if(power > 10)
            System.out.printf("The flashlight flashes %swith light.\n", getFlashPower(power));
        else{
            System.out.println("The flashlight doesnt flash with light, the battery is almost empty.");
        }
    }
}
