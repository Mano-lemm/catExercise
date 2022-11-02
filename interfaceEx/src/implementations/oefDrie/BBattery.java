package implementations.oefDrie;

import interfaces.oefDrie.Battery;

public class BBattery  implements Battery{
    private double percent = 1.0;

    @Override
    public int deliverPower() {
        int r = (int) (255 * percent);
        percent -= 0.01;
        return r;
    }
}
