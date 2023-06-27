public class ClapLamp extends Lamp {

    final private String clapHands = "You have clapped your hands";

    public ClapLamp(String cable, String color, String model, int price) {
        super(cable, color, model, price);
    }
    @Override
    public void turnLampOn() {
        lampState = true;
    }

    @Override
    public void turnLampOff() {
        lampState = false;
    }

    public void clapYourHands() {
        System.out.println(clapHands);
        if(lampState) {
            turnLampOff();
        } else
            turnLampOn();
    }

}
