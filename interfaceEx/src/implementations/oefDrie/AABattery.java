package implementations.oefDrie;

import interfaces.oefDrie.Battery;

public class AABattery implements Battery{
    private double percent = 1.0;

    @Override
    public int deliverPower() {
        int r = (int) (100 * percent);
        percent -= 0.01;
        return r;
    }
}
