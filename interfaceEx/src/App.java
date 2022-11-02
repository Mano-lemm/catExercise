import implementations.oefDrie.*;
import implementations.oefDrie.FlashLight;

public class App {
    public static void main(String[] args) throws Exception {
        FlashLight pilllight = new FlashLight(new BBattery());
        for (int i = 0; i < 91; i++) {
            if(i % 15 == 0)
                pilllight.Flash();
            else{
                pilllight.useBattery();
            }
        }
    }
}
