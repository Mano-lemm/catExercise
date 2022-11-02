package implementations.oefDrie;

import interfaces.oefDrie.Battery;

public class ABattery implements Battery{
    private double percent = 1.0;

    @Override
    public int deliverPower() {
        int r = (int) (200 * percent);
        percent -= 0.01;
        return r;
    }
    
}
