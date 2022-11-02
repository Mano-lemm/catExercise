package interfaces.oefTwee;
public interface Vehicle extends Motor, Switch{
    int doors = 5;

    void openDoor(int door);
    void closeDoor(int door);
}
