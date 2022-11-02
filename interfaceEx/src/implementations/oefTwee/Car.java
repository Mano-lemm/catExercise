package implementations.oefTwee;
import interfaces.oefTwee.Vehicle;

public class Car implements Vehicle{
    private boolean drivable;
    private boolean[] dOpen = new boolean[doors];

    @Override
    public void toggleSwitch() {
        drivable = !drivable;
    }

    @Override
    public void gas() {
        if(drivable && !anyOpen()){
            System.out.println("vroem"); 
        }
        else if(anyOpen()){
            System.out.println("de deur staat nog open");
        }
        else{
            System.out.println("motor staat nog niet aan.");
        }
    }

    private boolean anyOpen(){
        for (boolean b : dOpen) {
            if(b)
                return true;
        }
        return false;
    }

    @Override
    public void openDoor(int door) {
       assert door > 0 && door <= doors;
       dOpen[door] = true; 
    }

    @Override
    public void closeDoor(int door) {
        assert door > 0 && door <= doors;
        dOpen[door] = false;
    }
    
}
