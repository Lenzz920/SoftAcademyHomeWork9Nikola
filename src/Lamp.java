public abstract class Lamp implements LampStateSwitcher {

    private String cable;
    private String color;
    private String model;
    private int price;
    protected boolean lampState;

    public Lamp(String cable, String color, String model, int price) {
        this.cable = cable;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public void checkStatus() {
        if(lampState) {
            System.out.println("The " + this.getClass().getSimpleName() + " is turned on");
        } else System.out.println("The " + this.getClass().getSimpleName() + " is turned off");
    }

    public void turnLampOn(){};
    public void turnLampOff(){};

}
