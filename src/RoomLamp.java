public class RoomLamp extends Lamp {

    final private String switchLamp = "You have flipped the switch";

    public RoomLamp(String cable, String color, String model, int price) {
        super(cable, color, model, price);
    }

    @Override
    public void turnLampOn() {
        System.out.println(switchLamp);
        if(lampState) {
            System.out.println("The lamp is already turned on");
        } else {
            lampState = true;
            System.out.println("The lamp is turned on");
        }
    }

    @Override
    public void turnLampOff() {
        System.out.println(switchLamp);
        if(lampState) {
            System.out.println("The lamp is turned off");
        } else {
            lampState = false;
            System.out.println("The lamp is already turned off");
        }
    }

}
