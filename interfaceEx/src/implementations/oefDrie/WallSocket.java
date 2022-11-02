package implementations.oefDrie;

import interfaces.oefDrie.Battery;

public class WallSocket implements Battery{

    @Override
    public int deliverPower() {
        return 255;
    }
    
}
