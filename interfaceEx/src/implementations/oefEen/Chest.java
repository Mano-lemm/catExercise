package implementations.oefEen;
import interfaces.oefEen.Lock;

public class Chest implements Lock{
    boolean opened;
    
    public boolean isOpen() {
        return opened;
    }

    @Override
    public void lock() {
        opened = false;
    }

    @Override
    public void unlock() {
        opened = true;        
    }
    
}
